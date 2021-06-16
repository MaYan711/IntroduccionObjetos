package src;

import java.util.Scanner;

public class Principal {


public static void main(String[] args) {

        Principal principal = new Principal();

}
public Principal() {
        Contador();
        Cuadrado();
        Circulo();
        Rectangulo();
        Libro();
        Fraccion();
    }

    Scanner sc = new Scanner(System.in);

       public void Contador(){
        Scanner sc = new Scanner(System.in);
       
        Contador contador1 = new Contador();
      
        int n;
        System.out.println("Introduce valores: ");                                     
        n = sc.nextInt();
       
        contador1.setCont(n);
        contador1.incrementar();
        System.out.println(contador1.getCont());
       
        contador1.incrementar();
        contador1.incrementar();
       
        System.out.println(contador1.getCont());
       
        contador1.decrementar();
       
        System.out.println(contador1.getCont());

        Contador contador2 = new Contador(10);
                                                   
        contador2.incrementar();
        System.out.println(contador2.getCont());
        contador2.decrementar();
        System.out.println(contador2.getCont());

        Contador contador3 = new Contador(contador2);

        System.out.println(contador3.getCont());
}

        public void Circulo(){

        Scanner sc = new Scanner(System.in);

        Circulo circulo = new Circulo(1);
        Circulo Aux = circulo;
        System.out.println("Radio: " + circulo.getRadio());
        Aux.setRadio(30.7);
        System.out.println("El valor nuevo es: ");
        System.out.println("Radio: " + circulo.getRadio());
        Aux.CalcularArea();
        Aux.CalcularPerimetro();
        System.out.println("El area del circulo es: " + circulo.getArea());
        System.out.println("El perimetro del circulo es: " + circulo.getPerimetro());
}


     public void Cuadrado(){{

        Scanner sc = new Scanner(System.in);

        Cuadrado cuadrado = new Cuadrado(1, 1);
        Cuadrado Aux = cuadrado;
        System.out.println(" Base: " + cuadrado.getBase() + "  Altura: " + cuadrado.getAltura());
        Aux.setBase(50);
        Aux.setAltura(30);
        System.out.println("Los valores nuevos son: ");
        System.out.println(" Base: " + cuadrado.getBase() + "  Altura: " + cuadrado.getAltura());
        Aux.area();
        Aux.perimetro();
        System.out.println("El area del cuadrado es: " + cuadrado.getArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.getPerimetro());
    }
}
    public void Rectangulo(){
        Rectangulo rectangulo = new Rectangulo(1, 1);
        Rectangulo Aux = rectangulo;
        Aux.area();
        Aux.perimetro();
        System.out.println("El area del rectangulo es: " + rectangulo.getArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.getPerimetro());

    }
    public void Libro(){
        Libro li = new Libro("Venom");
        Libro li2 = li;
        li2.setLibro("Humano");
        li.prestar();
        li.informacion();
        li2.devolver();
        li.informacion();
}
public void Fraccion(){
        System.out.print("Estamos viendo por que no da");
        //Fraccion n1 = new Fraccion(1,4);
        //Fraccion d1 = new Fraccion(1,2);
        //Fraccion n2 = new Fraccion();
        //Fraccion d2 = new Fraccion(4);

        //Fraccion suma = n1.sumar(n2);
        //Fraccion resta = n1.resta(d1);
        //Fraccion multiplicar = n1.multiplicar(d2);
        //Fraccion dividir = n1.dividir(n2);

        //System.out.println(n1 + " + " + n2 + " = " + suma);
        //System.out.println(n1 + " - " + n2 + " = " + resta);
        //System.out.println(n1 + " * " + n2 + " = " + multiplicar);
       // System.out.println(n1 + " / " + n2 + " = " + dividir);

        


}

}



