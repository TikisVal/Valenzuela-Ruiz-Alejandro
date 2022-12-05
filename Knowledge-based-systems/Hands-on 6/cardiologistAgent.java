package examples.messaging;
 
import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import net.sf.clipsrules.jni.*;
 
public class cardiologistAgent extends Agent {
   
    protected void setup() {
        addBehaviour(new cardiologistBehaviour());
    }

   private class cardiologistBehaviour extends SimpleBehaviour {
            private boolean fin = false;
       
            public void action() {
                System.out.println(" Preparing to receive");
 
            //Obtiene el primer mensaje de la cola de mensajes
                ACLMessage mensaje = receive();
 
                if (mensaje!= null) {
                    System.out.println(getLocalName() + ": you just receive the next message: ");
                    System.out.println(mensaje.toString());
                    clips.load("load-cardiologist-KB.clp");
                    System.out.println("El diagnostico es: ");
                    clips.run();
                    fin = true;
                }
            }

            public boolean done() {
                return fin;
            }
    }
}
