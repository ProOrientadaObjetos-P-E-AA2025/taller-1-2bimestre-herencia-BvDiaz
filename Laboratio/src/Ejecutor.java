
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        List<Prestamo> listaPrestamos = new ArrayList<>();
        boolean continuar = true;
        int opcion;

        while (continuar) {
            System.out.println("\n--- Menú Gestión de Préstamos ---");
            System.out.println("1. Ingresar Préstamo Automóvil");
            System.out.println("2. Ingresar Préstamo Educativo");
            System.out.println("3. Mostrar Préstamos por Ciudad");
            System.out.println("0. Finalizar y Mostrar Préstamos");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = tcl.nextInt();
                tcl.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Ingrese un número.");
                tcl.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Ingreso de Préstamo Automóvil ---");

                    System.out.print("Nombre del Beneficiario: ");
                    String nombreB = tcl.nextLine();
                    System.out.print("Apellido del Beneficiario: ");
                    String apellidoB = tcl.nextLine();
                    System.out.print("Username del Beneficiario: ");
                    String usernameB = tcl.nextLine();
                    Persona beneficiarioAuto = new Persona(nombreB, apellidoB, usernameB);

                    System.out.print("Tiempo de Préstamo en Meses: ");
                    int tiempoMesesAuto = 0;
                    try {
                        tiempoMesesAuto = tcl.nextInt();
                        tcl.nextLine();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entrada inválida para meses. Se usará 0.");
                        tcl.nextLine();
                    }

                    System.out.print("Ciudad de Préstamo (Automóvil - minúsculas, por defecto Loja): ");
                    String ciudadAuto = tcl.nextLine();
                    if (ciudadAuto.trim().isEmpty()) {
                        ciudadAuto = "Loja";
                        System.out.println("Ciudad asignada por defecto: Loja");
                    }

                    System.out.print("Tipo de Automóvil: ");
                    String tipoAuto = tcl.nextLine();

                    System.out.print("Marca de Automóvil: ");
                    String marcaAuto = tcl.nextLine();

                    System.out.print("Nombre del Garante 1: ");
                    String nombreG1 = tcl.nextLine();
                    System.out.print("Apellido del Garante 1: ");
                    String apellidoG1 = tcl.nextLine();
                    System.out.print("Username del Garante 1: ");
                    String usernameG1 = tcl.nextLine();
                    Persona garanteAuto = new Persona(nombreG1, apellidoG1, usernameG1);

                    System.out.print("Valor del Automóvil: ");
                    double valorAuto = 0;
                    try {
                        valorAuto = tcl.nextDouble();
                        tcl.nextLine();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entrada inválida para valor automóvil. Se usará 0.");
                        tcl.nextLine();
                    }

                    PrestamoAutomovil prestamoAuto = new PrestamoAutomovil(beneficiarioAuto, tiempoMesesAuto,
                            ciudadAuto, tipoAuto, marcaAuto, garanteAuto, valorAuto);
                    listaPrestamos.add(prestamoAuto);
                    System.out.println("Préstamo Automóvil ingresado con éxito.");
                    break;

                case 2:
                    System.out.println("\n--- Ingreso de Préstamo Educativo ---");

                    System.out.print("Nombre del Beneficiario: ");
                    String nombreBE = tcl.nextLine();
                    System.out.print("Apellido del Beneficiario: ");
                    String apellidoBE = tcl.nextLine();
                    System.out.print("Username del Beneficiario: ");
                    String usernameBE = tcl.nextLine();
                    Persona beneficiarioEdu = new Persona(nombreBE, apellidoBE, usernameBE);

                    System.out.print("Tiempo de Préstamo en Meses: ");
                    int tiempoMesesEdu = 0;
                    try {
                        tiempoMesesEdu = tcl.nextInt();
                        tcl.nextLine();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entrada inválida para meses. Se usará 0.");
                        tcl.nextLine();
                    }

                    System.out.print("Ciudad de Préstamo (Educativo - mayúsculas, por defecto Loja): ");
                    String ciudadEdu = tcl.nextLine();
                    if (ciudadEdu.trim().isEmpty()) {
                        ciudadEdu = "Loja";
                        System.out.println("Ciudad asignada por defecto: Loja");
                    }

                    System.out.print("Nivel del Estudio: ");
                    String nivelEstudio = tcl.nextLine();

                    System.out.print("Nombre de la Institución Educativa: ");
                    String nombreInst = tcl.nextLine();
                    System.out.print("Siglas de la Institución Educativa: ");
                    String siglasInst = tcl.nextLine();
                    InstitucionEducativa centroEdu = new InstitucionEducativa(nombreInst, siglasInst);

                    System.out.print("Valor de Carrera: ");
                    double valorCarrera = 0;
                    try {
                        valorCarrera = tcl.nextDouble();
                        tcl.nextLine();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entrada inválida para valor carrera. Se usará 0.");
                        tcl.nextLine();
                    }

                    PrestamoEducativo prestamoEdu = new PrestamoEducativo(beneficiarioEdu, tiempoMesesEdu,
                            ciudadEdu, nivelEstudio, centroEdu, valorCarrera);
                    listaPrestamos.add(prestamoEdu);
                    System.out.println("Préstamo Educativo ingresado con éxito.");
                    break;

                case 3:
                    System.out.println("\n--- Mostrar Préstamos por Ciudad ---");
                    System.out.print("Ingrese la ciudad para filtrar (deje vacío para 'Loja' por defecto): ");
                    String ciudadFiltro = tcl.nextLine().trim();

                    if (ciudadFiltro.isEmpty()) {
                        ciudadFiltro = "Loja";
                        System.out.println("Filtrando por la ciudad por defecto: Loja");
                    }

                    boolean encontrados = false;
                    System.out.println("\n--- Préstamos en " + ciudadFiltro + " ---");
                    for (Prestamo prestamo : listaPrestamos) {
                        if (prestamo.getCiudadPrestamo().equalsIgnoreCase(ciudadFiltro)) {
                            System.out.println("\n***** Préstamo *****");
                            System.out.println(prestamo);
                            encontrados = true;
                        }
                    }

                    if (!encontrados) {
                        System.out.println("No se encontraron préstamos para la ciudad '" + ciudadFiltro + "'.");
                    }

                    System.out.println("\n--- Resumen por Ciudad ---");
                    Map<String, Integer> conteoPorCiudad = new HashMap<>();
                    Map<String, Double> montoTotalPorCiudad = new HashMap<>();

                    for (Prestamo prestamo : listaPrestamos) {
                        String ciudad = prestamo.getCiudadPrestamo();
                        conteoPorCiudad.put(ciudad, conteoPorCiudad.getOrDefault(ciudad, 0) + 1);
                        montoTotalPorCiudad.put(ciudad, montoTotalPorCiudad.getOrDefault(ciudad, 0.0) + prestamo.getValorMensualPago());
                    }

                    if (conteoPorCiudad.isEmpty()) {
                        System.out.println("No hay préstamos registrados para generar un resumen.");
                    } else {
                        System.out.println("Logro: \"Explorador de ciudades\".");
                        for (Map.Entry<String, Integer> entry : conteoPorCiudad.entrySet()) {
                            String ciudad = entry.getKey();
                            int count = entry.getValue();
                            double totalMonto = montoTotalPorCiudad.get(ciudad);
                            System.out.printf("  Ciudad: %s - Préstamos: %d - Monto Total Mensual: %.2f%n", ciudad, count, totalMonto);
                        }
                    }
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Finalizado el ingreso de préstamos.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        System.out.println("\n--- Lista de Préstamos Generados ---");
        if (listaPrestamos.isEmpty()) {
            System.out.println("No se ingresaron préstamos.");
        } else {
            for (int i = 0; i < listaPrestamos.size(); i++) {
                System.out.println("\n***** Préstamo #" + (i + 1) + " *****");
                System.out.println(listaPrestamos.get(i));
                System.out.println("**********************************");
            }
        }

        tcl.close();
    }
}
