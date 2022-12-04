import net.sf.clipsrules.jni.*;

public class hands-on3 {
    public class persons {
        private static Environment clips;

        protected static void setup() throws CLIPSException{
            clips = new Environment();
            clips.load("run-persons.clp");
            clips.run();
        }
    }

    public class products {
        private static Environment clips;

        protected static void setup() throws CLIPSException{
            clips = new Environment();
            clips.load("run-products.clp");
            clips.run();
        }
    }

    public class market {
        private static Environment clips;

        protected static void setup() throws CLIPSException{
            clips = new Environment();
            clips.load("run-market.clp");
            clips.run();
        }
    }
    
    /**
    * @param args
    * @throws CLIPSException
    */
    public static void main(String[] args) throws CLIPSException {
        setup();
    }
}    

