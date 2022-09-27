import java.util.Scanner;
public class ejercicio_4v3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double b,h,P,A;
        
        System.out.println("AREA Y PERIMETRO DE UN RECTANGULO");
        System.out.print("Ingrese el Base : ");
        b = entrada.nextDouble();
        System.out.print("Ingrese el Altura : ");
        h = entrada.nextDouble();
        
        P = (2*b)+(2*h);
        A = b * h;

        System.out.println("El AREA del RECTANGULO es : "+A);
        System.out.println("El PERIMETRO del RECTANGULO es : "+P);
    }
}
