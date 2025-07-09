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
    }

    private static void runEjerccios() {

    }
}