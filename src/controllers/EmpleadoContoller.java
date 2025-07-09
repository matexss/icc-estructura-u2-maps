package controllers;
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