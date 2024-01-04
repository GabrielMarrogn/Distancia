import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        sc.close();

        double x = Math.pow((x2-x1), 2);
        double y = Math.pow((y2-y1), 2);

        double calculo = Math.sqrt(x + y);
        DecimalFormat distancia = new DecimalFormat("0.0000");
        System.out.println(distancia.format(calculo));
    }
}
