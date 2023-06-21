package com.mycompany.empresa;
import java.util.ArrayList;
import java.util.List;

public class Desarrollador extends Empleado {
    private List<String> lenguajesDominados;
    
    public Desarrollador(String nombre, double salario, String cargo) {
        super(nombre, salario, cargo);
        lenguajesDominados = new ArrayList<>();
    }
    
    public void agregarLenguaje(String lenguaje) {
        lenguajesDominados.add(lenguaje);
    }
    
    public List<String> getLenguajesDominados() {
        return lenguajesDominados;
    }
    
    public static void main(String[] args) {
        Desarrollador desarrollador1 = new Desarrollador("Juan Perez", 450000.0, "Desarrollador");
        desarrollador1.agregarLenguaje("Java");
        desarrollador1.agregarLenguaje("Python");
        
        Desarrollador desarrollador2 = new Desarrollador("Maria Gomez", 350000.0, "Desarrollador");
        desarrollador2.agregarLenguaje("C#");
        desarrollador2.agregarLenguaje("JavaScript");
        
         Desarrollador desarrollador3= new Desarrollador("Carlos Ruiz", 370000.0, "Desarrollador");
        desarrollador3.agregarLenguaje("Python");
        desarrollador3.agregarLenguaje("JavaScript");
        
        Desarrollador desarrollador4= new Desarrollador("Sofia Lopez", 400000.0, "Desarrollador");
        desarrollador4.agregarLenguaje("Python");
        desarrollador4.agregarLenguaje("C#");
        
        System.out.println("Desarrollador 1:");
        System.out.println("Nombre: " + desarrollador1.getNombre());
        System.out.println("Salario: " + desarrollador1.getSalario());
        System.out.println("Cargo: " + desarrollador1.getCargo());
        System.out.println("Lenguajes dominados: " + desarrollador1.getLenguajesDominados());
        
        System.out.println("\nDesarrollador 2:");
        System.out.println("Nombre: " + desarrollador2.getNombre());
        System.out.println("Salario: " + desarrollador2.getSalario());
        System.out.println("Cargo: " + desarrollador2.getCargo());
        System.out.println("Lenguajes dominados: " + desarrollador2.getLenguajesDominados());
        
        System.out.println("\nDesarrollador 3:");
        System.out.println("Nombre: " + desarrollador3.getNombre());
        System.out.println("Salario: " + desarrollador3.getSalario());
        System.out.println("Cargo: " + desarrollador3.getCargo());
        System.out.println("Lenguajes dominados: " + desarrollador3.getLenguajesDominados());
        
        System.out.println("\nDesarrollador 4:");
        System.out.println("Nombre: " + desarrollador4.getNombre());
        System.out.println("Salario: " + desarrollador4.getSalario());
        System.out.println("Cargo: " + desarrollador4.getCargo());
        System.out.println("Lenguajes dominados: " + desarrollador4.getLenguajesDominados());
    }
}
