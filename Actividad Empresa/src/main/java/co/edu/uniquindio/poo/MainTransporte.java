package co.edu.uniquindio.poo;

import java.util.Scanner;
import java.util.Collection;

public class MainTransporte {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmpresaTransporte empresa = new EmpresaTransporte();

        // Añadir datos de prueba
        inicializarDatos(empresa);

        //do-while y switch-case en forma de menu para probar todas las funcionalidades
        int opcion;
        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Ver datos de prueba inicializados");
            System.out.println("2. Registrar un vehículo y su propietario y asociarlos");
            System.out.println("3. Obtener el número de usuarios de un vehículo de transporte por la placa");
            System.out.println("4. Obtener el número de usuarios mayores de 40 años");
            System.out.println("5. Contar usuarios en un rango de edad específico");
            System.out.println("6. Mostrar usuarios que superan un valor de peso específico");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // limpiar el buffer

            switch (opcion) {
                case 1:
                    mostrarDatosInicializados(empresa);
                    break;
                case 2:
                    registrarVehiculoYPropietario(empresa, scanner);
                    break;
                case 3:
                    mostrarNumeroUsuariosPorVehiculo(empresa, scanner);
                    break;
                case 4:
                    mostrarNumeroUsuariosMayoresDe40(empresa);
                    break;
                case 5:
                    mostrarNumeroUsuariosEnRangoDeEdad(empresa, scanner); 
                    break;
                case 6:
                    mostrarUsuariosConPesoMayorA(empresa, scanner);
                    break;
                case 0:
                    System.out.println("\nSaliendo...");
                    break;
                default:
                    System.out.println("\nOpcion no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    /**
     * Metodo para instanciar e inicializar objetos con datos de prueba
     *
     * @param {EmpresaTransporte} empresa
     */


    private static void inicializarDatos(EmpresaTransporte empresa) {
        // Inicializar datos de prueba aquí
        Propietario propietario1 = new Propietario("Juan Perez", "1234567890", "juanito@gmail.com", "555-1234", null);
        VehiculoTransporte vehiculo1 = new VehiculoTransporte("Toyota", "Corolla", "ABC123", "Rojo", 5, propietario1, null);
        Usuario usuario1 = new Usuario("Carlos Ruiz", 45,74, vehiculo1);
        empresa.getPropietarios().add(propietario1);
        empresa.getVehiculosTransporte().add(vehiculo1);
        empresa.getUsuarios().add(usuario1);
        propietario1.asociarVehiculo_Propietario(vehiculo1);
        vehiculo1.getUsuarios().add(usuario1);
    }

    /**
     * metodo para ver en consola los datos de prueba inicializados,
     * Case 1
     * @param {EmpresaTransporte} empresa
     */


    private static void mostrarDatosInicializados(EmpresaTransporte empresa) {
        System.out.println("\n=== Datos Inicializados ===");
        System.out.println("\nPropietarios:");
        for (Propietario p : empresa.getPropietarios()) {
            System.out.println("Nombre: " + p.getNombre() + ", Cédula: " + p.getCedula() + ", Email: " + p.getEmail() + ", Teléfono: " + p.getTelefono());
        }
        System.out.println("\nVehículos de Transporte:");
        for (VehiculoTransporte v : empresa.getVehiculosTransporte()) {
            System.out.println("Marca: " + v.getMarca() + ", Modelo: " + v.getModelo() + ", Placa: " + v.getPlaca() + ", Color: " + v.getColor());
        }
        System.out.println("\nUsuarios:");
        for (Usuario u : empresa.getUsuarios()) {
            System.out.println("Nombre: " + u.getNombre() + ", Edad: " + u.getEdad() + ",Peso: " + u.getPeso());
        }
    }

    /**
     * Metodo para facilitar el uso del metodo asociarVehiculo_Propietario con scanner,
     * Case 2
     * @param {EmpresaTransporte} empresa
     */


    private static void registrarVehiculoYPropietario(EmpresaTransporte empresa, Scanner scanner) {
        System.out.print("Ingrese nombre del propietario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese cédula del propietario: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese email del propietario: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese teléfono del propietario: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese placa del vehículo: ");
        String placa = scanner.nextLine();
        System.out.print("Ingrese color del vehículo: ");
        String color = scanner.nextLine();

        Propietario nuevoPropietario = new Propietario(nombre, cedula, email, telefono, null);
        VehiculoTransporte nuevoVehiculo = new VehiculoTransporte(marca, modelo, placa, color, 0, nuevoPropietario, null);

        empresa.getPropietarios().add(nuevoPropietario);
        empresa.getVehiculosTransporte().add(nuevoVehiculo);
        nuevoPropietario.asociarVehiculo_Propietario(nuevoVehiculo);

        System.out.println("Vehículo y propietario registrados exitosamente.");
    }

    /**
     * Metodo para facilitar el uso del metodo obtenerNumeroUsuariosPorVehiculo en consola
     * Case 3
     * @param {EmpresaTransporte} empresa
     */

    private static void mostrarNumeroUsuariosPorVehiculo(EmpresaTransporte empresa, Scanner scanner) {
        System.out.print("Ingrese la placa del vehículo de transporte: ");
        String placa = scanner.nextLine();
        int numeroUsuarios = empresa.obtenerNumeroUsuariosPorVehiculo(placa);
        System.out.println("Número de usuarios asociados al vehículo con placa " + placa + ": " + numeroUsuarios);
    }

    /**
     * Metodo para facilitar el uso del metodo obtenerNumeroUsuariosMayoresDe40 en consola
     * Case 4
     * @param {EmpresaTransporte} empresa
     */

    private static void mostrarNumeroUsuariosMayoresDe40(EmpresaTransporte empresa) {
        int numeroUsuarios = empresa.obtenerNumeroUsuariosMayoresDe40();
        System.out.println("Número de usuarios mayores de 40 años: " + numeroUsuarios);
    }
    
    /**
     * Metodo para permitir el uso del metodo contarUsuarios en RangoEdad
     * Case 5
     * @param {EmpresaTransporte} empresa
     * @param {Scanner} scanner
     */
    private static void mostrarNumeroUsuariosEnRangoDeEdad(EmpresaTransporte empresa, Scanner scanner) {
        System.out.print("Ingrese la edad mínima: ");
        int edadMin = scanner.nextInt();
        System.out.print("Ingrese la edad máxima: ");
        int edadMax = scanner.nextInt();
        
        int numeroUsuarios = empresa.contarUsuariosEnRangoDeEdad(edadMin, edadMax);
        System.out.println("Número de usuarios en el rango de edad de " + edadMin + " a " + edadMax + ": " + numeroUsuarios);
    }

    /**
     * Metodo para mostrar los usuarios que superan un valor de peso específico.
     * Case 6
     * @param {EmpresaTransporte} empresa
     * @param {Scanner} scanner
     */
    private static void mostrarUsuariosConPesoMayorA(EmpresaTransporte empresa, Scanner scanner) {
        System.out.print("Ingrese el valor de peso minimo: ");
        double peso = scanner.nextDouble();

        Collection<Usuario> usuariosConPesoMayor = empresa.obtenerUsuariosConPesoMayorA(peso);

        if (usuariosConPesoMayor.isEmpty()) { //Utilizamos "isEmpty" para verificar si la coleccion esta vacia
            System.out.println("\nNo hay usuarios con un peso mayor a " + peso + ".");
        } else {
            System.out.println("\nUsuarios con un peso mayor a " + peso + ":");
            for (Usuario usuario : usuariosConPesoMayor) {
                System.out.println("Nombre: " + usuario.getNombre() + ", Edad: " + usuario.getEdad() + ", Peso: " + usuario.getPeso());
            }
        }
    }

}