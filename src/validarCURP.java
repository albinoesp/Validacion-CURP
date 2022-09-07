import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
public class validarCURP {
    private static final Logger LOG = Logger.getLogger("validate.validarCURP");

    private static void validar(String args[]){

        LOG.setLevel(Level.WARNING);

        if (args.length == 0){
            LOG.severe("No se proporciono la CURP");
            System.exit(1);
        }

        String CURP = args[0];


    }
}
