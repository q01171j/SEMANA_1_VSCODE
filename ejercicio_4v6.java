import java.util.Scanner;
public class ejercicio_4v6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double l,m,n,o,b,B,h,P,A;
        
        System.out.println("AREA Y PERIMETRO DE UN TRAPECIO");
        System.out.print("Ingrese el Lado 1 : ");
        l = entrada.nextDouble();
        System.out.print("Ingrese la Lado 2 : ");
        m = entrada.nextDouble();
        System.out.print("Ingrese la Lado 3 : ");
        n = entrada.nextDouble();
        System.out.print("Ingrese la Lado 4 : ");
        o = entrada.nextDouble();
        System.out.print("Ingrese la Base Menor : ");
        b = entrada.nextDouble();
        System.out.print("Ingrese la Base Mayor : ");
        B = entrada.nextDouble();
        System.out.print("Ingrese la Altura : ");
        h = entrada.nextDouble();
        
        P = l + m + n + o;
        A = (h*(B+b))/2;
        
        System.out.println("El AREA del TRAPECIO es : "+A);
        System.out.println("El PERIMETRO del TRAPECIO es : "+P);
    }
}
