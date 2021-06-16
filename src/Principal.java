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
        //Rectangulo();
        //Libro();
        //Fraccion();
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

    public void Rectangulo(){

        Scanner sc = new Scanner(System.in);

        

    }

}
}


