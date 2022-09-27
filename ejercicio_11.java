import java.util.Scanner;
public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num;
        System.out.println("MOSTRAR TU NUMERO FAVORITO");
        System.out.println("Ingrese su numero favorito");
        num = entrada.nextInt();
        System.out.println("Tu numero favorito es "+num);
    }
}
