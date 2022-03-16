public class Rectangulo extends Figura implements Comparable<Rectangulo>{
    private double base;
    private double altura;
    private int lados;

    public Rectangulo(double pBase, double pAltura, int nLados){
        base = pBase;
        altura = pAltura;
        lados = nLados;
    }

    public double calcularArea(){
        return base * altura;
    }

    public int returnLados(){
        return lados;
    }

    public int compareTo(Rectangulo rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        int misLados = this.returnLados();

        if(miArea==areaPorComparar && misLados == lados ){
            return 0;
        }
        else if (miArea > areaPorComparar && misLados > lados){
            return 1;
        }
        else{
            return -1;
        }
    }
}
