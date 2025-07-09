package controllers;

import java.util.Map;

import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    Map<Empleado, Empleado> empleados = new java.util.HashMap<>();
    public EmpleadoDAOHashMap() {
        // Constructor
    }
    
    public EmpleadoDAOHashMap(Map<Empleado, Empleado> empleados) {
        this.empleados = empleados;
    }
        @Override
       public void addEmpleado(Empleado empleado){
            empleados.put(empleado, empleado);
        }
        public void listarEmpleados(){
             
            for (Empleado empleado : empleados.keySet()) {
                System.out.println(empleado);
            }

        }
        public void eliminarEmpleado(int id){
            empleados.remove(id);
        }
}