import java.util.Scanner;
public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double n;
        double n_suma = 0;
        double promedio;
        System.out.println("INGRESE SUS 5 NOTAS PARA PROMEDIARLOS");
        for(int i = 1; i <= 5; i++){
            System.out.print("Ingrese la nota "+i+" : ");
            n = entrada.nextDouble();
            n_suma = n_suma + n;
        }
        promedio = n_suma / 5;
        System.out.println("El promedio de las 5 notas es : "+promedio);
    }
}
