import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gimnasio FitMar");

        List<Tarifa> socios = new ArrayList<>();
        socios.add(new TarifaBasica("S-101", 30));
        socios.add(new TarifaPremium("S-102", 45));

        int meses = 3;
        double total = 0;
        for (Tarifa t : socios) {
            double precio = t.precioCuota(meses);
            System.out.printf("%s: %.2f €%n", t, precio);
            total += precio;
        }
        System.out.printf("Total por %d meses: %.2f €%n", meses, total);
    }
}
