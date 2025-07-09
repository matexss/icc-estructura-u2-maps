package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {
    

    private EmpleadoDAO empleadoDAO;
    



    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;

    }

    public void addEmpleado(Empleado empleado) {
        empleadoDAO.addEmpleado(empleado);
    }


}