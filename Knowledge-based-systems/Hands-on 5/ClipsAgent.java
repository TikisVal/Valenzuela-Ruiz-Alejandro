package clips.agents;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import net.sf.clipsrules.jni.*;

public class ClipsAgent extends Agent {
  private Environment clips;
  
  protected void setup() {	
    clips = new Environment(); 
    addBehaviour(new TellBehaviour());
    addBehaviour(new AskBehaviour());
  } 

  private class TellBehaviour extends Behaviour {
    boolean tellDone = false;

    public void action() {
    
      System.out.println("Invoking Tell"); 
      clips.load("load-enfermedades.clp");
      clips.run();
       
      tellDone = true;
    } 
    
    public boolean done() {
      if (tellDone)
        return true;
      else
	return false;
    }
  }    // END of inner class ...Behaviour

 private class AskBehaviour extends Behaviour {
    boolean askDone = false;

    public void action() {
      clips.clear();
      clips.load("load-sintomas.clp");
      clips.reset();
      
      System.out.println("Invoking Ask"); 
        
      askDone = true;
    } 
    
    public boolean done() {
      if (askDone)
        return true;
      else
	return false;
    }
   
    public int onEnd() {
      myAgent.doDelete();
      return super.onEnd();
    } 
  }  
}
