public class Rectangulo extends Figura implements Comparable<Figura>{
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

    public int compareTo(Figura rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        //int misLados = this.returnLados();
        
        if(miArea==areaPorComparar){

            int misLados = this.returnLados();
            if(lados==misLados){
                return 0;
            }
            else if (misLados > lados){
                return 1;
            }
            else{
                return -1;
            }

        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
}
