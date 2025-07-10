import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;

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
        System.out.println();
        System.out.println("------------------------ EJERCICIOS ------------------------");
        System.out.println();
        // Ejercicio 1
        System.out.println("----- Ejercicio 1: -----");
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Palabra 1: " + str1);
        System.out.println("Palabra 2: " + str2);
        System.out.println("Son anagramas: " + ejercicios.sonAnagramas(str1, str2));

        // Ejercicio 2 
        System.out.println("----- Ejercicio 2: -----");
        int[] nums = { 9, 2, 3, 6 };
        int objetivo = 5;
        System.out.println("Nums: " + "[" + nums[0] + ", " + nums[1] + ", " + nums[2] + ", " + nums[3] + "]");
        System.out.println("Objetivo: " + objetivo);
        int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
        if (resultado != null) {
            System.out.println("Resultado: " + "[" + resultado[0] + ", " + resultado[1] + "]");
        }
        // Ejercicio 3
        System.out.println("----- Ejercicio 3: -----");
        String texto = "hola";
        System.out.println("Texto: " + texto);
        ejercicios.contarCaracteres(texto);

        // Ejercicio 4
        System.out.println("----- Ejercicio 4: -----");
        String palabra1 = "roma";
        String palabra2 = "amor";
        System.out.println("Palabra 1: " + palabra1);
        System.out.println("Palabra 2: " + palabra2);
        System.out.println("Son anagramas: " + ejercicios.sonAnagramas(palabra1, palabra2));
        

    }
}