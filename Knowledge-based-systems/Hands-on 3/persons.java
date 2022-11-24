import net.sf.clipsrules.jni.*;

public class persons {
    private static Environment clips;

    protected static void setup() throws CLIPSException{
        clips = new Environment();
        clips.load("run-persons.clp");
        clips.run();
    }

    /**
     * @param args
     * @throws CLIPSException
     */
    public static void main(String[] args) throws CLIPSException {
        setup();
    }
}