import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nro;

        while (continuar == 1){
            System.out.println("Por favor, ingrese un número: ");
            nro = scan.nextInt();
            System.out.println("El número ingresado es: " + nro);

            System.out.println("Si desea continuar presione 1, de lo contrario, cualquier otro número");
            continuar = scan.nextInt();
        }
        System.out.println("Gracias!");
        scan.close();
    }
}
