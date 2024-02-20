package javaapplication76;

/**
 * La clase Auto representa un vehículo con una marca y un modelo.
 */
public class Auto {


    private String marca; //Marca del auto


    private String modelo; //Modelo del auto

    /**
     * Constructor para crear un nuevo objeto Auto con la marca y el modelo especificados.
     * @param marca La marca del auto.
     * @param modelo El modelo del auto.
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * @return La marca del auto.
     * Método para obtener la marca del auto es un String y no tiene parametros.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para establecer la marca del auto.
     * @param marca La nueva marca del auto definido como un String.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para obtener el modelo del auto.
     * @return El modelo del auto.
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Método para establecer el modelo del auto.
     * @param modelo El nuevo modelo del auto.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método que devuelve la cadena de este objeto Auto.
     * @return Cadena que representa el objeto Auto,teniendo la marca y el modelo.
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}


