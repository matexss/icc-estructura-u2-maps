import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHashMap = new controllers.EmpleadoDAOHashMap();
        EmpleadoDAO empleadoDAOTreeMap = new controllers.EmpleadoDAOTreeMap();
        
        EmpleadoContoller empleadoController1 = new EmpleadoContoller(empleadoDAOHashMap);
        EmpleadoContoller empleadoController2 = new EmpleadoContoller(empleadoDAOTreeMap);

        // Agregar empleados
        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");
        empleadoController1.addEmpleado(emp1);
        empleadoController1.addEmpleado(emp2);
        empleadoController1.addEmpleado(emp3);
        empleadoController1.addEmpleado(emp4);
        empleadoController1.addEmpleado(emp5);
        
        // Listar empleados
        System.out.println("Empleados en HashMap:");
        empleadoDAOHashMap.listarEmpleados();

        empleadoController2.addEmpleado(emp1);
        empleadoController2.addEmpleado(emp2);
        empleadoController2.addEmpleado(emp3);
        empleadoController2.addEmpleado(emp4);
        empleadoController2.addEmpleado(emp5);
        // Listar empleados
        System.out.println("Empleados en TreeMap:");
        empleadoDAOTreeMap.listarEmpleados();
    }

    private static void runMapExamlpe() {
        // Puedes agregar aquí ejemplos de uso de la clase Mapa si lo deseas
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();
            System.out.println("---------------------------ANAGRAMAS-------------------------------");
        // Ejemplo de uso de areAnagrams (método estático)
        System.out.println("¿'listen' y 'silent' son anagramas? " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("¿'hello' y 'bello' son anagramas? " + Ejercicios.areAnagrams("hello", "bello"));
           
        
        System.out.println("---------------------------SUMATORIAS-------------------------------");

        // Ejemplo de uso de sumatoriaDeDos
            System.out.println("\nEjemplo 2: sumatoriaDeDos");
        int[] numsA = {9, 2, 3, 6};
        int objetivoA = 5;
        int[] resultadoA = ejercicios.sumatoriaDeDos(numsA, objetivoA);
        if (resultadoA != null) {
            System.out.println("nums = [9,2,3,6], objetivo = 5 => Indices: [" + resultadoA[0] + "," + resultadoA[1] + "]");
        } else {
            System.out.println("nums = [9,2,3,6], objetivo = 5 => No hay solución.");
        }

        int[] numsB = {9, 2, 3, 6};
        int objetivoB = 10;
        int[] resultadoB = ejercicios.sumatoriaDeDos(numsB, objetivoB);
        if (resultadoB != null) {
            System.out.println("nums = [9,2,3,6], objetivo = 10 => Indices: [" + resultadoB[0] + "," + resultadoB[1] + "]");
        } else {
            System.out.println("nums = [9,2,3,6], objetivo = 10 => No hay solución.");
        }
        System.out.println("---------------------------FRECUENCIA DE CARACTERES-------------------------------");
        // Ejemplo de uso de contarCaracteres
        System.out.print("Frecuencia de caracteres en 'hola': ");
        ejercicios.contarCaracteres("hola");

        // Ejemplo de uso de sonAnagramas
        System.out.println("¿'roma' y 'amor' son anagramas? " + ejercicios.sonAnagramas("roma", "amor"));
    }
}