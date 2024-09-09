import java.util.Scanner;

public class ReboundExercise {
    public static void main(String[] args) {
        // Crear un escáner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingresa un número: ");
        int n = scanner.nextInt();

        // Cerrar el escáner
        scanner.close();

        // Patrón 1: Estrellas en forma ascendente
        System.out.println("Patrón 1:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Patrón 2: Estrellas en forma descendente
        System.out.println("Patrón 2:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
