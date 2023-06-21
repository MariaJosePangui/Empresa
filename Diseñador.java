package com.mycompany.empresa;
import java.util.ArrayList;
import java.util.List;

public class Diseñador extends Empleado {
    private List<String> herramientasDominadas;
    
    public Diseñador(String nombre, double salario, String cargo) {
        super(nombre, salario, cargo);
        herramientasDominadas = new ArrayList<>();
    }
    
    public void agregarHerramienta(String herramienta) {
        herramientasDominadas.add(herramienta);
    }
    
    public List<String> getHerramientasDominadas() {
        return herramientasDominadas;
    }
    
    public static void main(String[] args) {
        Diseñador diseñador1 = new Diseñador("Juan Pérez", 450000.0, "Diseñador");
        diseñador1.agregarHerramienta("Photoshop");
        diseñador1.agregarHerramienta("Illustrator");
        
        Diseñador diseñador2 = new Diseñador("María Gómez", 350000.0, "Diseñador");
        diseñador2.agregarHerramienta("Sketch");
        diseñador2.agregarHerramienta("InDesign");
        
         Diseñador diseñador3 = new Diseñador("Carlos Ruiz", 370000.0, "Diseñador");
        diseñador3.agregarHerramienta("Sketch");
        diseñador3.agregarHerramienta("Photoshop");
        
        System.out.println("Diseñador 1:");
        System.out.println("Nombre: " + diseñador1.getNombre());
        System.out.println("Salario: " + diseñador1.getSalario());
        System.out.println("Cargo: " + diseñador1.getCargo());
        System.out.println("Herramientas dominadas: " + diseñador1.getHerramientasDominadas());
        
        System.out.println("\nDiseñador 2:");
        System.out.println("Nombre: " + diseñador2.getNombre());
        System.out.println("Salario: " + diseñador2.getSalario());
        System.out.println("Cargo: " + diseñador2.getCargo());
        System.out.println("Herramientas dominadas: " + diseñador2.getHerramientasDominadas());
        
        System.out.println("\nDiseñador 3:");
        System.out.println("Nombre: " + diseñador3.getNombre());
        System.out.println("Salario: " + diseñador3.getSalario());
        System.out.println("Cargo: " + diseñador3.getCargo());
        System.out.println("Herramientas dominadas: " + diseñador3.getHerramientasDominadas());
        
      }
}

    

