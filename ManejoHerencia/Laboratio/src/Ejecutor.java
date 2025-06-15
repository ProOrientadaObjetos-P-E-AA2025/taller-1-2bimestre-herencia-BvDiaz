
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        List<Prestamo> listaPrestamos = new ArrayList<>();
        boolean continuar = true;
        int opcion;

        while (continuar) {
            System.out.println("\n--- Menuu Gestions de Prestamoss ---");
            System.out.println("1. Ingresar Prestamoo Automovil");
            System.out.println("2. Ingresar Prestamoo Educativvo");
            System.out.println("0. Finalisar y Mostrar Prestamoss");
            System.out.print("Seleccionne opccion: ");

            try {
                opcion = tcl.nextInt();
                tcl.nextLine(); 
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entradaa invalida. Ingressee un numero.");
                entrada.nextLine(); 
                continue; 
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Ingresoo Prestamoo Automovil ---");

                    System.out.print("Nombre Beneficiarioo: ");
                    String nombreB = tcl.nextLine();
                    System.out.print("Apellido Beneficiarioo: ");
                    String apellidoB = tcl.nextLine();
                    System.out.print("Username Beneficiarioo: ");
                    String usernameB = tcl.nextLine();
                    Persona beneficiarioAuto = new Persona(nombreB, apellidoB, usernameB);

                    System.out.print("Tiempo Prestamo en Mesess: ");
                    int tiempoMesesAuto = 0;
                    try {
                        tiempoMesesAuto = tcl.nextInt();
                        tcl.nextLine(); 
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entradaa invalida para mesess. Se usara 0.");
                        tcl.nextLine(); 
                    }

                    System.out.print("Ciudadd Prestamo (Automovil - minusculass): ");
                    String ciudadAuto = tcl.nextLine();

                    System.out.print("Tipoo Automovil: ");
                    String tipoAuto = tcl.nextLine();

                    System.out.print("Marcaa Automovil: ");
                    String marcaAuto = tcl.nextLine();

                    System.out.print("Nombre Garante 1: ");
                    String nombreG1 = tcl.nextLine();
                    System.out.print("Apellido Garante 1: ");
                    String apellidoG1 = tcl.nextLine();
                    System.out.print("Username Garante 1: ");
                    String usernameG1 = tcl.nextLine();
                    Persona garanteAuto = new Persona(nombreG1, apellidoG1, usernameG1);

                    System.out.print("Valor Automovil: ");
                    double valorAuto = 0;
                    try {
                        valorAuto = tcl.nextDouble();
                        tcl.nextLine(); 
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entradaa invalida para valor automovil. Se usara 0.");
                        tcl.nextLine();
                    }

                    PrestamoAutomovil prestamoAuto = new PrestamoAutomovil(beneficiarioAuto, tiempoMesesAuto,
                            ciudadAuto, tipoAuto, marcaAuto, garanteAuto, valorAuto);
                    listaPrestamos.add(prestamoAuto);
                    System.out.println("Prestamoo Automovil ingresadoo con exitoo.");
                    break;

                case 2:
                    System.out.println("\n--- Ingresoo Prestamoo Educativvo ---");

                    System.out.print("Nombre Beneficiarioo: ");
                    String nombreBE = tcl.nextLine();
                    System.out.print("Apellido Beneficiarioo: ");
                    String apellidoBE = tcl.nextLine();
                    System.out.print("Username Beneficiarioo: ");
                    String usernameBE = tcl.nextLine();
                    Persona beneficiarioEdu = new Persona(nombreBE, apellidoBE, usernameBE);

                    System.out.print("Tiempo Prestamo en Mesess: ");
                    int tiempoMesesEdu = 0;
                    try {
                        tiempoMesesEdu = tcl.nextInt();
                        tcl.nextLine(); 
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entradaa invalida para mesess. Se usara 0.");
                        tcl.nextLine(); // Limpiar el búfer
                    }

                    System.out.print("Ciudadd Prestamo (Educativvo - mayusculass): ");
                    String ciudadEdu = tcl.nextLine();

                    System.out.print("Nivell Estudio: ");
                    String nivelEstudio = tcl.nextLine();

                    System.out.print("Nombre Institucion Educativva: ");
                    String nombreInst = tcl.nextLine();
                    System.out.print("Siglas Institucion Educativva: ");
                    String siglasInst = tcl.nextLine();
                    InstitucionEducativa centroEdu = new InstitucionEducativa(nombreInst, siglasInst);

                    System.out.print("Valor Carrera: ");
                    double valorCarrera = 0;
                    try {
                        valorCarrera = tcl.nextDouble();
                        tcl.nextLine();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entradaa invalida para valor carrera. Se usara 0.");
                        tcl.nextLine(); 
                    }

                    PrestamoEducativo prestamoEdu = new PrestamoEducativo(beneficiarioEdu, tiempoMesesEdu,
                            ciudadEdu, nivelEstudio, centroEdu, valorCarrera);
                    listaPrestamos.add(prestamoEdu);
                    System.out.println("Prestamoo Educativvo ingresadoo con exitoo.");
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Finalisandoo ingresoo prestamoss.");
                    break;

                default:
                    System.out.println("Opccion no validdaa. Intentee de nuevvo.");
            }
        }

        System.out.println("\n--- Listaa Prestamoss Generadoss ---");
        if (listaPrestamos.isEmpty()) {
            System.out.println("No se ingresaronn prestamoss.");
        } else {
            for (int i = 0; i < listaPrestamos.size(); i++) {
                System.out.println("\n***** Prestamoo #" + (i + 1) + " *****");
                System.out.println(listaPrestamos.get(i));
                System.out.println("*");
            }
        }

        tcl.close();
    }
}
