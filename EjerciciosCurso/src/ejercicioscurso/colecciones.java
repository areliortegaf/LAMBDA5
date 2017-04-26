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
public class colecciones {

    //
    //Collections -> forEch
    //
    public static void main(String[] args) {
        List<tipo> listaTipo = Arrays.asList(
                new tipo("Tipo1", "String", "Comp"),
                new tipo("Tipo2", "Integer", "Comp"),
                new tipo("Tipo3", "Boolean", "Comp")
        );
        //IMPRIME EL TIPO

        System.out.println("\n-----------------Imprimir ListaTipo---------------");
        listaTipo.forEach((t) -> {
            System.out.println(t.toString());
        });

        //IMPRIME EL STRING
        ArrayList<String> otraLista = new ArrayList<>();
        otraLista.add("String1");
        otraLista.add("String2");
        otraLista.add("String3");
        otraLista.add("String4");

        System.out.println("\n-----------------Imprimir otraLista---------------");
        otraLista.forEach((t) -> {
            System.out.println(t);
        });

    }

}
