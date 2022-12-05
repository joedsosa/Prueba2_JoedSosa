/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_joedsosa2;

/**
 *
 * @author joeds
 */
public class Figura {

    private float largo, ancho, alto;
    private String tipoFigura;

    public Figura(float largo, float ancho, float alto, String tipoFigura) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.tipoFigura = tipoFigura;
        this.tipoFigura = this.tipoFigura.toLowerCase();
    }

    public Figura() {
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "Tipo de Figura: " + this.tipoFigura + "\nMedidas\tAlto:" + this.alto + "\n\tAncho: " + this.ancho + "\n\tLargo: " + this.largo;
    }

    public float Area() {
        float valorReturn = 0;
        switch(this.tipoFigura){
            case "cuadrado":
            case "rectangulo":
                valorReturn = this.largo * this.ancho;
                break;
            case "triangulo":
                valorReturn =(this.largo*this.ancho)/2;
                break;        
        
        }
        return valorReturn;
    }
    public float Volumen(){
    float valorReturn = 0;
    switch(this.tipoFigura){
            case "cuadrado":
            case "rectangulo":
                valorReturn = this.largo * this.ancho*this.alto;
                break;
            case "triangulo":
                valorReturn =(this.alto*this.ancho*this.largo)/3;
                break;        
        
        }
        return valorReturn;    
    }

}
