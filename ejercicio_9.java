public class ejercicio_9 {
    public static void main(String[] args) {
        double pi = 3.14159265;
        double sum_A = 0;
        double array[] = new double[3];
        array[0]=8.9;
        array[1]=6.7;
        array[2]=7.9;
        
        System.out.println("CALCULAR LA SUMA DE LAS 3 AREAS DE LOS CIRCULOS");
        for(int i=0;i<array.length;i++){
           double radio = (pi * (array[i] * array[i]));
           sum_A = sum_A + radio;
        }
        System.out.println("La suma de las Areas es : "+sum_A);
    }
}
