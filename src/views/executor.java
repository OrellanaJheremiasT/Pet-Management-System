
    /* ========================================================================
     * TODO 5: CREAR MÉTODO imprimirReporte()
     * ========================================================================
     * Este método obtiene la lista de mascotas y muestra un reporte formateado.
     *
     * Instrucciones:
     *
     * PARTE A - FIRMA DEL MÉTODO:
     * 1. Crear un método privado llamado "imprimirReporte"
     *    - Modificador: private
     *    - No recibe parámetros
     *    - No retorna nada (void)
     *
     * PARTE B - MOSTRAR TÍTULO:
     * 2. Imprimir el título de la sección:
     *    - Imprimir: "\n--- Reporte de Mascotas ---"
     *
     * PARTE C - GENERAR EL REPORTE:
     * 3. Crear una variable local String llamada "reporte":
     *    - Llamar al método estático: Reporte.ReporteMascotras()
     *    - Pasar como parámetro: administrador.getListaMascotas()
     *    - Esto obtiene el array de mascotas y genera el reporte
     *
     * PARTE D - MOSTRAR EL REPORTE:
     * 4. Imprimir el reporte en la consola:
     *    - Usar System.out.println(reporte)
     *
     * PARTE E - DOCUMENTACIÓN JAVADOC:
     * 5. Agregar Javadoc explicando:
     *    - Qué hace el método
     *    - Que obtiene la lista del administrador
     *    - Que genera reporte usando la clase Reporte
     *    - Que muestra el reporte en consola
     *
     * CONCEPTOS CLAVE:
     * - Colaboración entre capas: Vista llama a Controlador y este usa Modelo
     * - Método estático: Reporte.ReporteMascotras() no necesita instancia
     * - Encadenamiento: administrador.getListaMascotas() usado directamente
     * ========================================================================
     */



    /* ========================================================================
     * TODO 6: CREAR MÉTODO main()
     * ========================================================================
     * Este es el punto de entrada de la aplicación.
     *
     * Instrucciones:
     *
     * PARTE A - FIRMA DEL MÉTODO:
     * 1. Crear el método main estándar de Java:
     *    - Modificadores: public static void
     *    - Nombre: main
     *    - Parámetro: String[] args
     *
     * PARTE B - CREAR INSTANCIA DE VISTAMASCOTA:
     * 2. Crear una instancia de VistaMascota:
     *    - Declarar variable: VistaMascota vista
     *    - Inicializar con: new VistaMascota()
     *
     * PARTE C - INICIAR EL MENÚ:
     * 3. Llamar al método mostrarMenu de la instancia:
     *    - Usar: vista.mostrarMenu()
     *    - Esto iniciará el bucle interactivo del menú
     *
     * PARTE D - DOCUMENTACIÓN JAVADOC:
     * 4. Agregar Javadoc explicando:
     *    - Que es el punto de entrada de la aplicación
     *    - Que crea una instancia de VistaMascota
     *    - Que muestra el menú principal
     *    - El parámetro args (@param)
     *
     * CONCEPTO CLAVE:
     * - Método main: Primer método que ejecuta la JVM al iniciar la aplicación
     * - Todo programa Java ejecutable debe tener un método main
     * ========================================================================
     */

package views;
import controller.petadministrator;
import controller.report;
import model.pets;
import java.util.Scanner;

public class executor {

    private final petadministrator administrador;
    private final Scanner scanner;

    public executor() {
        this.administrador = new petadministrator(5);
        this.scanner = new Scanner(System.in);
    }

    public void viewmenu (){
        int option;
        do {
            System.out.println("\n========== Pets Menu ==========");
            System.out.println("1. Add Pet");
            System.out.println("2. Print Pet Report");
            System.out.println("0. Exit");
            System.out.println("======================================");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addpet();
                    break;
                case 2:
                    printreport();
                    break;
                case 0:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }




        } while (option != 0);
    }

    private void addpet() {
        System.out.println("\n--- Add New Pet ---");
        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        System.out.print("Enter pet type: ");
        String type = scanner.nextLine();
        System.out.print("Enter pet age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        pets newPet = new pets(name, type, age);
        administrador.addPet(newPet);
        System.out.println("Pet added successfully!");
    }



}
