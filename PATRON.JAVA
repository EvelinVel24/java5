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

        // Patrón 1
        System.out.println("Patrón 1:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(". ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println(); // Nueva línea al final del patrón 1

        // Patrón 2: Cuadrado 4x4 con bordes de asteriscos y vacío en el interior
        System.out.println("Patrón 2:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Imprimir asteriscos en los bordes
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Espacio vacío en el interior
                }
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}

