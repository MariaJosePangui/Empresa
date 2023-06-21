package com.mycompany.empresa;
import java.util.ArrayList;
import java.util.List;

public class GerenteProyecto extends Empleado {
    private List<String> proyectosManejados;
    
    public GerenteProyecto(String nombre, double salario, String cargo) {
        super(nombre, salario, cargo);
        proyectosManejados = new ArrayList<>();
    }
    
    public void agregarProyecto(String proyecto) {
        proyectosManejados.add(proyecto);
    }
    
    public List<String> getProyectosManejados() {
        return proyectosManejados;
    }
    
    public static void main(String[] args) {
        GerenteProyecto gerente1 = new GerenteProyecto("Juan Perez", 500000.0, "Gerente de Proyecto");
        gerente1.agregarProyecto("Proyecto A");
        gerente1.agregarProyecto("Proyecto B");
        
        GerenteProyecto gerente2 = new GerenteProyecto("Maria Gomez", 600000.0, "Gerente de Proyecto");
        gerente2.agregarProyecto("Proyecto C");
        gerente2.agregarProyecto("Proyecto D");
        
        GerenteProyecto gerente3 = new GerenteProyecto("Carlos Ruiz", 630000.0, "Gerente de Proyecto");
        gerente2.agregarProyecto("Proyecto E");
        gerente2.agregarProyecto("Proyecto F");
        
        System.out.println("Gerente de Proyecto 1:");
        System.out.println("Nombre: " + gerente1.getNombre());
        System.out.println("Salario: " + gerente1.getSalario());
        System.out.println("Cargo: " + gerente1.getCargo());
        System.out.println("Proyectos manejados: " + gerente1.getProyectosManejados());
        
        System.out.println("\nGerente de Proyecto 2:");
        System.out.println("Nombre: " + gerente2.getNombre());
        System.out.println("Salario: " + gerente2.getSalario());
        System.out.println("Cargo: " + gerente2.getCargo());
        System.out.println("Proyectos manejados: " + gerente2.getProyectosManejados());
        
         System.out.println("\nGerente de Proyecto 3:");
        System.out.println("Nombre: " + gerente3.getNombre());
        System.out.println("Salario: " + gerente3.getSalario());
        System.out.println("Cargo: " + gerente3.getCargo());
        System.out.println("Proyectos manejados: " + gerente3.getProyectosManejados());
        
        
    }
}
