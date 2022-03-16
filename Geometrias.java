import java.util.Arrays;

 public class Geometrias {

 public static void main(String args[]) {

    Rectangulo[] rects = new Rectangulo[4];


    rects[0] = new Rectangulo(2.5, 3.0,4);
    rects[1] = new Rectangulo(1.7, 2.2,4);
    rects[2] = new Rectangulo(2.8, 3.1,4);
    rects[3] = new Rectangulo(3.5, 1.2,4);
    Arrays.sort(rects);

    Circulo[] circulos = new Circulo[4];


    circulos[0] = new Circulo(6);
    circulos[1] = new Circulo(4);
    circulos[2] = new Circulo(7);
    circulos[3] = new Circulo(9);
    Arrays.sort(rects);

    Triangulo[] triangulos = new Triangulo[4];


    triangulos[0] = new Triangulo(3.5, 3.8);
    triangulos[1] = new Triangulo(4.7, 5.2);
    triangulos[2] = new Triangulo(9.8, 8.1);
    triangulos[3] = new Triangulo(2.5, 1.9);
    Arrays.sort(rects);

    }
 }