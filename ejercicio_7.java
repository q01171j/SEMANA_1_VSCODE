import java.util.Scanner;
public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n,multi,n1=0,n2=0;
        System.out.println("INGRESE 10 NUMEROS LOS 5 PRIMEROS NUMEROS SE VAN A SUMAR Y SE VA A MULTIPLICAR CON LA SUMA DE LOS ULTIMOS NUMEROS");
        for(int i=1;i<=10;i++){
            System.out.print("Ingrese el valor "+i+" : ");
            n = entrada.nextInt();
            if(i<=5){
                n1 = n1 + n;
            }
            if(i>5){
                n2 = n2 + n;
            }
        }
        multi = n1 * n2;
        System.out.println("La respuesta es : "+multi);
    }
}
