public class Rectangulo extends Figura implements Comparable<Rectagulo>{
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

    public int compareTo(Rectangulo rectPorComparar, Rectangulo numLados){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        int ladoPorComprar = numLados.returnLados();
        int misLados = this.returnLados();

        if(miArea==areaPorComparar && misLados == ladoPorComprar ){
            return 0;
        }
        else if (miArea > areaPorComparar && misLados > ladoPorComprar){
            return 1;
        }
        else{
            return -1;
        }
    }
}
