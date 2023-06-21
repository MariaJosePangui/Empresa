package com.mycompany.empresa;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private List<Empleado> empleados;
    
    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.empleados = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    public List<Empleado> getEmpleados() {
        return empleados;
    }
    
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Proyecto ABC", "Descripción del proyecto");
        
        Empleado empleado1 = new Empleado("Juan Perez", 450000.0, "Analista");
        Empleado empleado2 = new Empleado("María Gómez", 350000.0, "Desarrollador");
        Empleado empleado3 = new Empleado("Carlos Ruiz", 370000.0, "Diseñador");
       
        proyecto.agregarEmpleado(empleado1);
        proyecto.agregarEmpleado(empleado2);
        proyecto.agregarEmpleado(empleado3);
        
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Descripción: " + proyecto.getDescripcion());
        System.out.println("\nEmpleados en el proyecto:");
        for (Empleado empleado : proyecto.getEmpleados()) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println("Cargo: " + empleado.getCargo());
            System.out.println("-----------------------------");
        }
    }
}
