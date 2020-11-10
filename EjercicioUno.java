import java.util.*;

public class EjercicioUno {
    public static void main(String[] args){
        // Objeto Scanner para tomar valores por consola:
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); //Escanea el próximo entero ingresado
        int b = scan.nextInt(); //Ver qué sucede si ingresamos un String u otro tipo?
        int c = scan.nextInt();

        System.out.println("El primer número ingresado es: " + a);
        System.out.println("El segundo número ingresado es: " + b);
        System.out.println("El tercer número ingresado es: " + c);
        scan.close();
    }
}
