package ejercicioscurso;

import java.util.function.Consumer;

public class tipo {

    public String nombre;
    public String descripcion;
    public String comportamiento;

    public tipo(String nom, String desc, String comp) {
        this.nombre = nom;
        this.descripcion = desc;
        this.comportamiento = comp;
    }

    public void cambiarNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public void cambiarDescripcion(String pDescripcion) {
        this.descripcion = pDescripcion;
    }

    public void cambiarComportamiento(String pComportamiento) {
        this.comportamiento = pComportamiento;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    public String obtenerComportamiento() {
        return comportamiento;
    }

    //imprime cadena comun
    public void imprimir(String cadena) {
        System.out.println(cadena);
    }

    //imprime el tipo
    void imprimir(tipo t) {
        System.out.println(t);
    }

    //EDITANDO EL METODO TOSTRING PARA IMPRIMIR EL ARRAY
    @Override
    public String toString() {
        return "Nombre " + nombre + ", Descripcion:" + descripcion + ", Comportamiento:" + comportamiento;
    }

    public void valoresPorDefecto() {

        System.out.println("1" + "2" + "3");
    }

}
