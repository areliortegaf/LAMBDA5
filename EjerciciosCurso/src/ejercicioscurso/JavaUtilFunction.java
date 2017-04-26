/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscurso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.UnaryOperator;

/**
 *
 * @author asortega
 */
public class JavaUtilFunction {
    //
    //1.Como crear el predicado
    //2.Consumer
    //3.Function
    //4.Suplier

    public static void main(String[] args) {
        //se crea el array y se llena
        List<tipo> listaTipo = Arrays.asList(
                new tipo("Tipo2", "String", "Comp"),
                new tipo("Tipo1", "Integer", "Comp"),
                new tipo("Tipo1", "Boolean", "Comp")
        );

        //PREDICADO (1)
        Predicate<tipo> miPredicado = t -> t.obtenerNombre().equalsIgnoreCase("Tipo1");
        System.out.println("\n-----------------Imprimir listaTipo---------------");
        listaTipo.stream()
                .filter(miPredicado)
                .forEach(System.out::println);

        //CONSUMER (2)
        Consumer<tipo> consumerTipo = t
                -> System.out.println("Nombre: " + t.obtenerNombre().equalsIgnoreCase("Tipo1") + ", Descripcion: " + t.obtenerDescripcion()
                        + ", Comportamiento: " + t.obtenerComportamiento());
        listaTipo.stream()
                .forEach(consumerTipo);

        System.out.println("\n-----------------Imprimir consumerTipo---------------");
        tipo tipito = new tipo("TipoO", "String", "Comp");
        consumerTipo.accept(tipito);

        //FUNCTION (3)
        Function<tipo, String> funcionTipo = (tipo e) -> {
            return e.obtenerNombre();
        };

        //se hace uso de listaTipo
        System.out.println("\n-----------------Imprimir funcionTipo---------------");
        List<String> listaString = convertir(listaTipo, funcionTipo);
        listaString.forEach(System.out::println);

        //SUPPLIER (4)
        tipo miTipo = new tipo("TipoO", "String", "Comp");
        Supplier<tipo> miSuplier = () -> miTipo;
        System.out.println("\n-----------------Imprimir miSuplier---------------");
        System.out.println(miSuplier.get());

        //INTERFACES PRIMITIVAS
        //1.ToDoubleFunction
        //2.DoubleFunction
        //3.BiPredicate
        //4.UnaryOperator
        System.out.println("\n-----------------INTERFACES PRIMITIVAS---------------");
        //TODOUBLEFUNCTION (1)
        ToDoubleFunction<Integer> i = (x) -> Math.sin(x);
        System.out.println("\n-----------------Imprimir ToDoubleFunction---------------");
        System.out.println(i.applyAsDouble(Integer.MAX_VALUE));

        //DOUBLE FUNCTION (2)
        DoubleFunction<String> df = (d) -> d + " cambio a string";
        System.out.println("\n-----------------Imprimir DoubleFunction---------------");
        System.out.println(df.apply(0.5));

        //BIPREDICADO (3)
        BiPredicate<Integer, Integer> bi = (x, y) -> x > y;

        BiPredicate<Integer, Integer> eq = (x, y) -> x - 2 > y;
        System.out.println("\n-----------------Imprimir BiPredicate---------------");
        System.out.println(bi.test(2, 3));
        System.out.println(bi.or(eq).test(2, 3));
        System.out.println(bi.or(eq).test(8, 3));

        //UnaryOperator (4)
        System.out.println("\n-----------------Imprimir UnaryOperator---------------");
        UnaryOperator<String> iz = (x) -> x.toUpperCase();
        System.out.println(iz.apply("cherryproject.net"));
    }

    //Metodo que se usa en FUNCTION
    public static List<String> convertir(List<tipo> listaTipo, Function<tipo, String> funcionTipo) {
        List<String> listaString = new ArrayList<String>();
        for (tipo emp : listaTipo) {
            listaString.add(funcionTipo.apply(emp));
        }
        return listaString;
    }
}
