import java.util.*;
public class recibirCURP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] CURP;
        CURP = new String[0];
        System.out.println("Escriba su CURP");
        CURP[0] = s.nextLine();
        validarCURP.main(new String[]{CURP[0]});
    }
}
