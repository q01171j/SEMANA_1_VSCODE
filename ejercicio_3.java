import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        int suma = 0;
        System.out.println("Ingrese 5 números a sumar");
        for(int i = 1; i<=5;i++){
            System.out.print("Ingrese el valor "+i+" : ");
            x = entrada.nextInt();
            suma = suma + x;
        }
        System.out.println("La suma de los 5 números es : "+suma);
    }
}