//Creado Por Erick Salas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio de la entrada:");
        double precioEntrada = scanner.nextDouble();

        System.out.println("Ingrese el precio de la comida buffet:");
        double precioComidaBuffet = scanner.nextDouble();

        System.out.println("Ingrese el precio del espectáculo en general:");
        double precioEspectaculo = scanner.nextDouble();

        System.out.println("Ingrese el precio por estar en la sección VIP:");
        double precioVIP = scanner.nextDouble();

        System.out.println("Ingrese el precio por estar en la sección Balcón:");
        double precioBalcon = scanner.nextDouble();

        System.out.println("Ingrese el precio del nado con delfines:");
        double precioNadoDelfines = scanner.nextDouble();

        Compra compra = new Compra(precioEntrada, precioComidaBuffet, precioEspectaculo, precioVIP, precioBalcon, precioNadoDelfines);

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
                System.out.println("**Elementos adquiridos:**");
                System.out.println(" - Entrada");
                System.out.println("**Costos del paquete**");
                System.out.println("Precio: $" + compra.getPrecioEntrada());
                System.out.println("Total a pagar: $" + total);
                break;
            case 2:
                total = compra.calcularTotal(compra.getPrecioEntrada(), compra.getPrecioComidaBuffet());
                scanner.nextLine();
                System.out.println("Ingrese el tipo de comida (Pastas, Caldos, Carnes, Mariscos):");
                String tipoComida = scanner.nextLine();
                while (!tipoComida.equalsIgnoreCase("Pastas") && !tipoComida.equalsIgnoreCase("Caldos") && !tipoComida.equalsIgnoreCase("Carnes") && !tipoComida.equalsIgnoreCase("Mariscos")) {
                    System.out.println("Tipo de comida inválido. Ingrese el tipo de comida (Pastas, Caldos, Carnes, Mariscos):");
                    tipoComida = scanner.nextLine();
                }

                System.out.println("=======Detalle de la compra=======");
                System.out.println("**Elementos adquiridos:**");
                System.out.println(" - Entrada");
                System.out.println(" - Comida buffet: " + tipoComida);
                System.out.println("**Costos del paquete**");
                System.out.println("Precio entrada: $" + compra.getPrecioEntrada());
                System.out.println("Precio comida buffet: $" + compra.getPrecioComidaBuffet());
                System.out.println("Total a pagar: $" + total);
                break;
            case 3:
                total = compra.calcularTotal(compra.getPrecioEntrada(), compra.getPrecioComidaBuffet(), compra.getPrecioEspectaculo());
                scanner.nextLine();
                System.out.println("Ingrese el tipo de comida (Pastas, Caldos, Carnes, Mariscos):");
                String tipoComida2 = scanner.nextLine();
                while (!tipoComida2.equalsIgnoreCase("Pastas") && !tipoComida2.equalsIgnoreCase("Caldos") && !tipoComida2.equalsIgnoreCase("Carnes") && !tipoComida2.equalsIgnoreCase("Mariscos")) {
                    System.out.println("Tipo de comida inválido. Ingrese el tipo de comida (Pastas, Caldos, Carnes, Mariscos):");
                    tipoComida = scanner.nextLine();
                }


                System.out.println("Ingrese la sección del lugar (Balcón, VIP, General) del espectáculo nocturno:");
                String seccionLugar = scanner.nextLine();
                while (!seccionLugar.equalsIgnoreCase("Balcón") && !seccionLugar.equalsIgnoreCase("VIP") && !seccionLugar.equalsIgnoreCase("General")) {
                    System.out.println("Sección inválida. Ingrese la sección del lugar (Balcón, VIP, General) del espectáculo nocturno:");
                    seccionLugar = scanner.nextLine();
                }

                System.out.println("=======Detalle de la compra=======");
                System.out.println("**Elementos adquiridos:**");
                System.out.println(" - Entrada");
                System.out.println(" - Comida buffet: " + tipoComida2);
                System.out.println(" - Espectáculo nocturno: " + seccionLugar);
                System.out.println("**Costos del paquete**");
                System.out.println("Precio entrada: $" + compra.getPrecioEntrada());
                System.out.println("Precio comida buffet: $" + compra.getPrecioComidaBuffet());
                System.out.println("Precio espectáculo nocturno: $" + compra.getPrecioEspectaculo(seccionLugar));
                System.out.println("Total a pagar: $" + total);
                break;
            case 4:
                total = compra.calcularTotal(compra.getPrecioEntrada(), compra.getPrecioComidaBuffet(), compra.getPrecioEspectaculo(), compra.getPrecioNadoDelfines());
                scanner.nextLine();
                System.out.println("Ingrese el tipo de comida (Pastas, Caldos, Carnes, Mariscos):");
                String tipoComida3 = scanner.nextLine();
                while (!tipoComida3.equalsIgnoreCase("Pastas") && !tipoComida3.equalsIgnoreCase("Caldos") && !tipoComida3.equalsIgnoreCase("Carnes") && !tipoComida3.equalsIgnoreCase("Mariscos")) {
                    System.out.println("Tipo de comida inválido. Ingrese el tipo de comida (Pastas, Caldos, Carnes, Mariscos):");
                    tipoComida = scanner.nextLine();
                }

                System.out.println("Ingrese la sección del lugar (Balcón, VIP, General) del espectáculo nocturno:");
                String seccionLugar2 = scanner.nextLine();
                while (!seccionLugar2.equalsIgnoreCase("Balcón") && !seccionLugar2.equalsIgnoreCase("VIP") && !seccionLugar2.equalsIgnoreCase("General")) {
                    System.out.println("Sección inválida. Ingrese la sección del lugar (Balcón, VIP, General) del espectáculo nocturno:");
                    seccionLugar2 = scanner.nextLine();
                }

                System.out.println("Ingrese el tipo de interacción (sencilla o extra) del nado con delfines:");
                String tipoInteraccion = scanner.nextLine();

                System.out.println("=======Detalle de la compra=======");
                System.out.println("**Elementos adquiridos:**");
                System.out.println(" - Entrada");
                System.out.println(" - Comida buffet: " + tipoComida3);
                System.out.println(" - Espectáculo nocturno: " + seccionLugar2);
                System.out.println(" - Nado con delfines: " + tipoInteraccion);
                System.out.println("**Costos del paquete**");
                System.out.println("Precio entrada: $" + compra.getPrecioEntrada());
                System.out.println("Precio comida buffet: $" + compra.getPrecioComidaBuffet());
                System.out.println("Precio espectáculo nocturno: $" + compra.getPrecioEspectaculo());
                System.out.println("Precio nado con delfines: $" + compra.getPrecioNadoDelfines());
                System.out.println("Total a pagar: $" + total);
                break;
            default:
                System.out.println("Opción inválida, captura una opción válida");
                break;
        }

    }
}