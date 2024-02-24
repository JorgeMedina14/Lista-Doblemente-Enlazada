import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nLista Doblemente Enlazada");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer hacia adelante");
            System.out.println("4. Recorrer hacia atrás");
            System.out.println("5. Mostrar tamaño de la lista");
            System.out.println("6. Mostrar si la lista está vacía");
            System.out.println("7. Buscar elemento por valor");
            System.out.println("8. Buscar elemento por índice");
            System.out.println("9. Borrar un elemento");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar al inicio: ");
                    int datoInicio = scanner.nextInt();
                    lista.insertarAlInicio(datoInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a insertar al final: ");
                    int datoFinal = scanner.nextInt();
                    lista.insertarAlFinal(datoFinal);
                    break;
                case 3:
                    System.out.println("Recorrido hacia adelante:");
                    lista.recorrerHaciaAdelante();
                    break;
                case 4:
                    System.out.println("Recorrido hacia atrás:");
                    lista.recorrerHaciaAtras();
                    break;
                case 5:
                    System.out.println("Tamaño de la lista: " + lista.getSize());
                    break;
                case 6:
                    System.out.println("La lista está vacía: " + lista.isEmpty());
                    break;
                case 7:
                    System.out.print("Ingrese el valor a buscar: ");
                    int valorBuscar = scanner.nextInt();
                    if (lista.buscarPorValor(valorBuscar)) {
                        System.out.println("El elemento " + valorBuscar + " se encuentra en la lista.");
                    } else {
                        System.out.println("El elemento " + valorBuscar + " no se encuentra en la lista.");
                    }
                    break;
                case 8:
                    System.out.print("Ingrese el índice a buscar: ");
                    int indiceBuscar = scanner.nextInt();
                    int valorIndice = lista.buscarPorIndice(indiceBuscar);
                    if (valorIndice != -1) {
                        System.out.println("El valor en el índice " + indiceBuscar + " es: " + valorIndice);
                    } else {
                        System.out.println("Índice fuera de rango.");
                    }
                    break;
                case 9:
                    System.out.print("Ingrese el valor a borrar: ");
                    int valorBorrar = scanner.nextInt();
                    lista.borrarElemento(valorBorrar);
                    break;
                case 10:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        } while (opcion != 10);

        scanner.close();
    }
}

