import java.util.Scanner;
public class ejercicio_4v2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double a,P,A;
        
        System.out.println("AREA Y PERIMETRO DE UN CUADRADO");
        System.out.print("Ingrese el Lado : ");
        a = entrada.nextDouble();
        
        P = 4 * a;
        A = a * a;
        
        System.out.println("El AREA del CUADRADO es : "+A);
        System.out.println("El PERIMETRO del CUADRADO es : "+P);
    }
}
