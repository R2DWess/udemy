import java.util.Locale;

public class PontoFlutuante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x = 4.9110;

        System.out.printf("%.3f%n",  x);
    }
}
