import jdk.nashorn.api.scripting.NashornScriptEngineFactory;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;

public class Server {

    public static void main(String[] args) throws ScriptException {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        // Set the current working directory to the "public" folder
        engine.put("Out", System.out);
        engine. eval(new File("public/server.js").getAbsolutePath());

    }
}