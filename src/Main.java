import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Eliana Camila Guevara Cubillos

        Scanner entrada = new Scanner(System.in);

        int op;

        vehiculo vel = null;

        do {
            System.out.println("===== Menú de Vehículos =====");
            System.out.println("1. Registrar vehículo (Carro, Camión, Moto)");
            System.out.println("2. Ingresar vehículo eléctrico");
            System.out.println("3. Abastecer Combustible");
            System.out.println("4. Mostrar Información");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Seleccione el tipo de vehículo:");
                    System.out.println("1. Carro");
                    System.out.println("2. Camión");
                    System.out.println("3. Moto");
                    int tipo = entrada.nextInt();


                    System.out.print("Ingrese la marca del vehículo: ");
                    String marca = entrada.nextLine();
                    System.out.print("Ingrese el modelo del vehículo: ");
                    String modelo = entrada.nextLine();
                    System.out.print("Ingrese el tipo de combustible: ");
                    String combustible = entrada.nextLine();

                    break;

                case 2:


                case 3:
                    if (vel!= null) {
                        System.out.print("Ingrese la cantidad de litros a abastecer: ");
                        double litros = entrada.nextDouble();

                    } else {
                        System.out.println("no hay nad .");
                    }
                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("salir");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (op != 5);

        entrada.close();
    }
}