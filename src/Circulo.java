package src;

import java.util.*;

public class Circulo {
     
    private double radio;
    private double area;
    private double perimetro;
    
    public Circulo(double radio){
        this.radio = radio;
    }

    
    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public double getArea(){
        return area;
    }

    public double getPerimetro(){
        return perimetro;
    }

    public void CalcularArea(){
        this.area = (Math.PI)*(this.radio*this.radio);
    }

    public void CalcularPerimetro(){
        this.perimetro = (2*3.1416)*(this.radio);
    }
}