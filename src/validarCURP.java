import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
public class validarCURP {
    private static final Logger LOG = Logger.getLogger("validate.validarCURP");

    public static void main(String args[]){

        LOG.setLevel(Level.WARNING);

        if (args.length == 0){
            LOG.severe("No se proporciono la CURP");
            System.exit(1);
        }

        String CURP = args[0

        CURP = CURP.toUpperCase();
        if( validarLongitud(CURP.length()) ){
            System.out.printf("La CURP %s es válida%n", CURP);
            LOG.info("OK");
        } else {
            System.out.printf("La CURP %s no es válida%n", CURP);
            LOG.info("FAIL");
        }

    }

    public static boolean validarLongitud(int longitud) {

        boolean status = false;

        if (longitud == 18){
            status = true;
        } else {
            status = false;
        }
        return status;
    }

}
