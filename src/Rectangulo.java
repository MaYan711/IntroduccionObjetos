package src;

import java.util.Scanner;

public class Rectangulo {

    Scanner sc = new Scanner(System.in);
    private int base;
    private int altura;
    private int area;
    private int perimetro;
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        System.out.println("Ingrese Ancho: ");
        base = sc.nextInt();
        System.out.println("Ingrese Altura: ");
        altura = sc.nextInt();
        this.base = base;
        this.altura = altura;
        if (altura == base) {
            System.out.println("Los datos forman un cuadrado , debe ser un rectangulo");
        } 
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
      /**
     * Metodos para calcular el area y el perimetro del cuadrado
     */
    public void area() {
        this.area = this.base * this.altura;
    }

    public void perimetro() {
        this.perimetro = (this.base * 2) + (this.altura * 2);
    }

}