package controllers;

import java.util.Map;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    Map<Empleado, Empleado> empleados = new java.util.HashMap<>();
    
    public EmpleadoDAOTreeMap() {
        // Constructor
    }
    
    public EmpleadoDAOTreeMap(Map<Empleado, Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public void addEmpleado(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void listarEmpleados() {
        for (Empleado empleado : empleados.keySet()) {
            System.out.println(empleado);
        }
    }

    @Override
    public void eliminarEmpleado(int id) {
        Empleado empleadoTemp = new Empleado(id);
        empleados.remove(empleadoTemp);
    }
}