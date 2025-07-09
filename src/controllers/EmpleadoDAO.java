package controllers;

import models.Empleado;

public interface EmpleadoDAO {

    void addEmpleado(Empleado empleado);
    void listarEmpleados();
    void eliminarEmpleado(int id);
    

    
}