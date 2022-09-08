import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class validarCURP {
    private static final Logger LOG = Logger.getLogger("validate.validarCURP");

    public static void main(String args[]){

        LOG.setLevel(Level.WARNING);

        if (args.length == 0){
            LOG.severe("No se proporciono la CURP");
            System.exit(1);
        }

        String CURP = args[0];
        String name = args[1];
        String fn = args[2]; //Fecha de nacimiento
        String sex = args [3]; //H = Hombre, M = Mujer
        String es = args [4]; //Estado de nacimiento

        CURP = CURP.toUpperCase();
        name = name.toUpperCase();
        es = es.toUpperCase();

        if(validarLongitud(CURP.length())){
            System.out.printf("La CURP %s es válida%n", CURP);
            LOG.info("OK");
        } else {
            System.out.printf("La CURP %s no es válida%n", CURP);
            LOG.info("FAIL");
        }
        if( validarFormat(CURP) ){
            System.out.printf("La CURP tiene el formato correcto");
            LOG.info("OK");
        } else {
            System.out.printf("El formato de la CURP es incorrecto");
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

    public static boolean validarFormat(String CURP) { //Validar formato de CURP
        boolean status = false;

        final String formatfour = "[A-Z]{4}[0-9]{6}[A-Z]{6}[A-Z0-9]{1}[0-9]{1}";
        status = Pattern.matches(formatfour, CURP);

        return status;
    }
}
