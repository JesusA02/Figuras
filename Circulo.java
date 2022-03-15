public class Circulo extends Figura implements Comparable<Circulo>{
    private double radio;

    public Circulo(double nRadio){
        radio = nRadio;
       
    }

    public double calcularAreaC(){
        return 3.14 * radio;
    }

    public int compareTo(Circulo cirPorComparar){
        double areaPorComparar = cirPorComparar.calcularAreaC();
        double miArea = this.calcularAreaC();

        if(miArea==areaPorComparar){
            return 0;
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }

}