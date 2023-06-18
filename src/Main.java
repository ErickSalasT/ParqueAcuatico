//Creado Por Erick Salas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio de la entrada:");
        double precioEntrada = scanner.nextDouble();

        System.out.println("Ingrese el precio de la comida buffet:");
        double precioComidaBuffet = scanner.nextDouble();

        System.out.println("Ingrese el precio del espectáculo nocturno:");
        double precioEspectaculo = scanner.nextDouble();

        System.out.println("Ingrese el precio del nado con delfines:");
        double precioNadoDelfines = scanner.nextDouble();


        Compra compra = new Compra(precioEntrada, precioComidaBuffet, precioEspectaculo, precioNadoDelfines);

        System.out.println("Seleccione el paquete que desea comprar:");
        System.out.println("1. Entrada");
        System.out.println("2. Entrada + Comida buffet");
        System.out.println("3. Entrada + Comida buffet + Espectáculo nocturno");
        System.out.println("4. Entrada + Comida buffet + Espectáculo nocturno + Nado con delfines");

        int opcion = scanner.nextInt();
        double total = 0;

    switch (opcion) {
        case 1:
            total = compra.calcularTotal(compra.getPrecioEntrada());
            System.out.println("=======Detalle de la compra=======");
            System.out.println("***Elementos adquiridos:***");
            System.out.println(" - Entrada");
            System.out.println("***Costos del paquete***");
            System.out.println("Precio: $" + compra.getPrecioEntrada());
            System.out.println("Total a pagar: $" + total);
            break;
        case 2:
            total = compra.calcularTotal(compra.getPrecioEntrada(), compra.getPrecioComidaBuffet());
            scanner.nextLine(); //Esto se puso para limpiar el buffer del scanner y así poder guardar los datos almacenados
            System.out.println("Ingrese el nombre del platillo de la comida buffet:");
            String nombrePlatillo = scanner.nextLine();



            System.out.println("=======Detalle de la compra=======");
            System.out.println("***Elementos adquiridos:***");
            System.out.println(" - Entrada");
            System.out.println(" - Comida buffet: " + nombrePlatillo);
            System.out.println("***Costos del paquete***");
            System.out.println("Precio entrada: $" + compra.getPrecioEntrada());
            System.out.println("Precio comida buffet: $" + compra.getPrecioComidaBuffet());
            System.out.println("Total a pagar: $" + total);
            break;
        case 3:
            total = compra.calcularTotal(compra.getPrecioEntrada(), compra.getPrecioComidaBuffet(), compra.getPrecioEspectaculo());
            scanner.nextLine();
            System.out.println("Ingrese el nombre del platillo de la comida buffet:");
            String nombrePlatillo2 = scanner.nextLine();

            System.out.println("Ingrese la sección del lugar (Balcón, VIP, General) del espectáculo nocturno:");
            String seccionLugar = scanner.nextLine();

            System.out.println("=======Detalle de la compra=======");
            System.out.println("***Elementos adquiridos:***");
            System.out.println(" - Entrada");
            System.out.println(" - Comida buffet: " + nombrePlatillo2);
            System.out.println(" - Espectáculo nocturno: " + seccionLugar);
            System.out.println("***Costos del paquete***");
            System.out.println("Precio entrada: $" + compra.getPrecioEntrada());
            System.out.println("Precio comida buffet: $" + compra.getPrecioComidaBuffet());
            System.out.println("Precio espectáculo nocturno: $" + compra.getPrecioEspectaculo());
            System.out.println("Total a pagar: $" + total);
            break;
        case 4:
            total = compra.calcularTotal(compra.getPrecioEntrada(), compra.getPrecioComidaBuffet(), compra.getPrecioEspectaculo(), compra.getPrecioNadoDelfines());
            scanner.nextLine();
            System.out.println("Ingrese el nombre del platillo de la comida buffet:");
            String nombrePlatillo3 = scanner.nextLine();

            scanner.nextLine();

            System.out.println("Ingrese la sección del lugar (Balcón, VIP, General) del espectáculo nocturno:");
            String seccionLugar2 = scanner.nextLine();

            scanner.nextLine();

            System.out.println("Ingrese el tipo de interacción (sencilla o extra) del nado con delfines:");
            String tipoInteraccion = scanner.nextLine();

            System.out.println("=======Detalle de la compra=======");
            System.out.println("***Elementos adquiridos:***");
            System.out.println(" - Entrada");
            System.out.println(" - Comida buffet: " + nombrePlatillo3);
            System.out.println(" - Espectáculo nocturno: " + seccionLugar2);
            System.out.println(" - Nado con delfines: " + tipoInteraccion);
            System.out.println("***Costos del paquete***");
            System.out.println("Precio entrada: $" + compra.getPrecioEntrada());
            System.out.println("Precio comida buffet: $" + compra.getPrecioComidaBuffet());
            System.out.println("Precio espectáculo nocturno: $" + compra.getPrecioEspectaculo());
            System.out.println("Precio nado con delfines: $" + compra.getPrecioNadoDelfines());
            System.out.println("Total a pagar: $" + total);
            break;
        default:
            System.out.println("Opción inválida, captura una opcion valida");
            break;
    }

    }
}