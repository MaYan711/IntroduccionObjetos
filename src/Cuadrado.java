package src;


import java.util.Scanner;

public class Cuadrado {

    private int base;
    private int altura;
    private int area;
    private int perimetro;

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

   
    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public int getArea() {
        return area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    
    public void area() {
        this.area = this.base * this.altura;
    }

    public void perimetro() {
        this.perimetro = this.base + this.altura + this.base + this.altura ;
    }

}