package examples.messaging;
 
import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.*;
import net.sf.clipsrules.jni.*;
 
public class pacientAgent2 extends Agent {

    protected void setup() {
        addBehaviour(new pacientBehaviour());
    }

   private class pacientBehaviour extends SimpleBehaviour {
        boolean fin = false;
      
        public void action() {
            System.out.println(getLocalName() +": Preparing to send a message to the medic");
            AID id = new AID();
            id.setLocalName("medic");
 
        // Creación del objeto ACLMessage
            ACLMessage mensaje = new ACLMessage(ACLMessage.INFORM);
 
        //Rellenar los campos necesarios del mensaje
            mensaje.setSender(getAID());
            mensaje.setLanguage("English");
            mensaje.addReceiver(id);
            mensaje.setContent(clips.load("load-sintomas2.clp"));
 
        //Envia el mensaje a los destinatarios
            send(mensaje);
 
            System.out.println(getLocalName() +": ... What are you up to");
            System.out.println(mensaje.toString());
            fin = true;
        }
 
        public boolean done()
        {
            return fin;
        }
    }
}
