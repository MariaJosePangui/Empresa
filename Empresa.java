package com.mycompany.empresa;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;
    private List<Proyecto> proyectos;
    
    public Empresa() {
        empleados = new ArrayList<>();
        proyectos = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    public List<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }
    
    public List<Proyecto> getProyectos() {
        return proyectos;
    }
    
    public void asignarEmpleadoAProyecto(Empleado empleado, Proyecto proyecto) {
        if (empleados.contains(empleado) && proyectos.contains(proyecto)) {
            proyecto.agregarEmpleado(empleado);
        } else {
            System.out.println("El empleado o el proyecto no existen en la empresa.");
        }
    }
    
    public double calcularTotalSalarios() {
        double totalSalarios = 0.0;
        for (Empleado empleado : empleados) {
            totalSalarios += empleado.getSalario();
        }
        return totalSalarios;
    }
    
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        Empleado empleado1 = new Empleado("Juan Pérez", 450000.0, "Analista");
        Empleado empleado2 = new Empleado("María Gómez", 350000.0, "Desarrollador");
        Empleado empleado3 = new Empleado("Carlos Ruiz", 370000.0, "Diseñador");
        
        Proyecto proyecto1 = new Proyecto("Proyecto ABC", "Descripción del proyecto 1");
        Proyecto proyecto2 = new Proyecto("Proyecto XYZ", "Descripción del proyecto 2");
       
        
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);
        
        empresa.agregarProyecto(proyecto1);
        empresa.agregarProyecto(proyecto2);
        
        empresa.asignarEmpleadoAProyecto(empleado1, proyecto1);
        empresa.asignarEmpleadoAProyecto(empleado2, proyecto1);
        empresa.asignarEmpleadoAProyecto(empleado3, proyecto2);
        
        System.out.println("Empleados en la empresa:");
        for (Empleado empleado : empresa.getEmpleados()) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println("Cargo: " + empleado.getCargo());
            System.out.println("-----------------------------");
        }
        
        System.out.println("\nProyectos de la empresa:");
        for (Proyecto proyecto : empresa.getProyectos()) {
            System.out.println("Nombre: " + proyecto.getNombre());
            System.out.println("Descripción: " + proyecto.getDescripcion());
            System.out.println("Empleados asignados:");
            for (Empleado empleado : proyecto.getEmpleados()) {
                System.out.println("- " + empleado.getNombre());
            }
            System.out.println("-----------------------------");
        }
        
        System.out.println("\nTotal de salarios pagados: " + empresa.calcularTotalSalarios());
    }
}
