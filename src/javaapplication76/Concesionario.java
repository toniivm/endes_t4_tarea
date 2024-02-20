package javaapplication76;

import java.util.ArrayList;
/**
 * La clase contiene 3 metodos
 * La clase Concesionario representa un Objeto con capacidad para listar agregar y imprimir autos.
 */
public class Concesionario {

    private ArrayList<Auto> autos;//Lista de coches en el concesionario
    /**
     * Constructor para crear un nuevo objeto Concesionario con una lista de autos.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }
    /**
     * * @param auto El auto a agregar.
     * Agrega un nuevo auto al concesionario de tipo auto.
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }
    /**
     * @return La lista de autos en el concesionario.
     * Obtiene una lista de todos los autos en el concesionario.
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }
    /**
     * Imprime los autos en el concesionario.
     */

    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}