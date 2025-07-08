package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
    }

    /**
     * Muestra ejemplos de uso de HashMap con países, capitales y empleados.
     */
    public void ejemploConHashMap() {
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Perú", "Lima");
        capitales.put("Colombia", "Bogotá");
        for(String pais : capitales.keySet()) {
            System.out.println("Pais " + pais + " Capital " + capitales.keySet());
        }   

        String capitalEcuador = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: " + capitalEcuador);

        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3,new Empleado(3, "Pedro", "Tester"));
        empleados.put(1,new Empleado(4, "Ana", "Dev"));
        empleados.put(2,new Empleado(5, "Luis", "Diseñador"));

        for(Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println("clave: " +entry.getKey() + ", Valor : " + entry.getValue());
        }
    

         Map<Empleado, Integer> empleados2 = new HashMap<>();
        Empleado emp1 = new Empleado(1, "Pedro", "Tester");
        Empleado emp2 = new Empleado(2, "Ana", "Dev");
        Empleado emp3 = new Empleado(3, "Luis", "Diseñador");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");

        empleados2.put(emp1, 1000);
        empleados2.put(emp2,    1200);
        empleados2.put(emp3, 1500);
        empleados2.put(emp4, 2000); 

        for(Map.Entry<Empleado, Integer> entry : empleados2.entrySet()) {
            System.out.println(entry.getKey() + "=> " + entry.getValue());
        }
    
        



    }

    /**
     * Muestra cómo usar LinkedHashMap para almacenar productos y precios manteniendo el orden de inserción.
     */
    public void ejemploConLinkedHashMap() {
        LinkedHashMap<String, Double> productos = new java.util.LinkedHashMap<>();
        productos.put("Manzana", 0.50);
        productos.put("Banana", 0.30);
        productos.put("Naranja", 0.60);

        for (String producto : productos.keySet()) {
            System.out.println("Producto: " + producto + " Precio: " + productos.get(producto));
        }

        Double precioManzana = productos.get("Manzana");
        System.out.println("El precio de la Manzana es: " + precioManzana);
    }

    /**
     * Demuestra el uso de TreeMap para almacenar personas y edades ordenando automáticamente las claves.
     */
    public void ejemploConTreeMap() {
        TreeMap<String, Integer> personas = new java.util.TreeMap<>();
        personas.put("Carlos", 20);
        personas.put("Ana", 22);
        personas.put("Luis", 19);

        for (String estudiante : personas.keySet()) {
            System.out.println("Estudiante: " + estudiante + " Edad: " + personas.get(estudiante));
        }

        Integer edadAna = personas.get("Ana");
        System.out.println("La edad de Ana es: " + edadAna);

        // Ejemplo de uso de TreeMap con empleados
          TreeMap<Empleado, Integer> empleados2 = new TreeMap<>();
        Empleado emp1 = new Empleado(1, "Pedro", "Tester");
        Empleado emp2 = new Empleado(2, "Ana", "Dev");
        Empleado emp3 = new Empleado(3, "Luis", "Diseñador");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");

        empleados2.put(emp1, 1000);
        empleados2.put(emp2,    1200);
        empleados2.put(emp3, 1500);
        empleados2.put(emp4, 2000); 

        for(Map.Entry<Empleado, Integer> entry : empleados2.entrySet()) {
            System.out.println(entry.getKey() + "=> " + entry.getValue());
        }

    }
}