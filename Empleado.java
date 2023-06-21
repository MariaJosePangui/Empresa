package com.mycompany.empresa;

public class Empleado {
    private String nombre;
    private double salario;
    private String cargo;
    
    public Empleado(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Perez", 450000.0, "Analista");
        Empleado empleado2 = new Empleado("Maria Gomez", 350000.0, "Gerente");
        Empleado empleado3 = new Empleado("Carlos Ruiz", 370000.0, "Diseñador");
       
        System.out.println("Empleado 1:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Salario: " + empleado1.getSalario());
        System.out.println("Cargo: " + empleado1.getCargo());
        
        System.out.println("\nEmpleado 2:");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Salario: " + empleado2.getSalario());
        System.out.println("Cargo: " + empleado2.getCargo());
        
        System.out.println("\nEmpleado 3:");
        System.out.println("Nombre: " + empleado3.getNombre());
        System.out.println("Salario: " + empleado3.getSalario());
        System.out.println("Cargo: " + empleado3.getCargo());
  
    }
}
