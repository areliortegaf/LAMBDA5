/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscurso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author asortega
 */
public class streamAndFilter {
    
    //
    //->Stream
    //->Filter
    //
    public static void main(String[] args) {
        
        List <tipo> listaTipo = Arrays.asList(
        new tipo("Tipo1", "String", "Comp"),
        new tipo("Tipo2", "Integer", "Comp"),
        new tipo("Tipo2", "Boolean", "Comp")
        );
        tipo tipito = new tipo("TipoO", "String", "Comp");
        
        System.out.println("\n-----------------Imprimir ListaTipo---------------"); 
        listaTipo.stream()
                .filter(t -> t.obtenerNombre().equalsIgnoreCase("Tipo2") )
                .forEach(t -> tipito.imprimir(t));
        
        System.out.println("\n-----------------Imprimir otraLista---------------"); 
        ArrayList<String> otraLista = new ArrayList<>();
        otraLista.add("Tipo1");
        otraLista.add("Tipo2");
        otraLista.add("Tipo3");
        otraLista.add("Tipo2");
        
        otraLista.stream()
                .filter(t -> t.equalsIgnoreCase("Tipo2") )
                .forEach(t -> System.out.println(t.toString()));
        
    }
}
