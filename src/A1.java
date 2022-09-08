import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class A1 {

    private static final Logger LOG = Logger.getLogger("validate.C");

    public static void main(String[] args) {

        LOG.setLevel(Level.WARNING);

        if(args.length == 0){
            System.out.println("No se ingresó CURP");
            System.exit(1);
        }

        String curpString = args[0];

        if (validarcurp(curpString )){
            LOG.info("True");
        } else {
            LOG.info("False");
        }

    }

    public static boolean validarcurp(String curp){
        boolean isCorrect = false;

        final String basecurp = "/^([A-Z][AEIOUX][A-Z]{2}\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[12]\\d|3[01])[HM](?:AS|B[CS]|C[CLMSH]|D[FG]|G[TR]|HG|JC|M[CNS]|N[ETL]|OC|PL|Q[TR]|S[PLR]|T[CSL]|VZ|YN|ZS)[B-DF-HJ-NP-TV-Z]{3}[A-Z\\d])(\\d)$/";

        isCorrect = Pattern.matches(basecurp, curp);

        return isCorrect;
    }
}

