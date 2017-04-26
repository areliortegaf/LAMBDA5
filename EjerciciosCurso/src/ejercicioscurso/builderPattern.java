/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscurso;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author asortega
 */
public class builderPattern {
    
    //
    //Since Java 8, List inherits a default "forEach" method which you can combine with the method reference "System.out::println"
    //
    public static void main(String[] args) {
       
        List <tipo> listaTipo = Arrays.asList(
        new tipo("Tipo2", "String", "Comp"),
        new tipo("Tipo1", "Integer", "Comp"),
        new tipo("Tipo1", "Boolean", "Comp")
        );
        //Permite la creacion de objetos usando el metodo encadenado
       
        listaTipo.stream()
                .filter(t -> t.obtenerNombre().equalsIgnoreCase("Tipo2") )
                .forEach(System.out::println);//nueva forma de imprimir/NO ES NECESARIO AGREGAR TOSTRING
                
    }
}
