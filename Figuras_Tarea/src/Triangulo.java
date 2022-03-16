public class Triangulo extends Figura implements Comparable<Figura>{
    private double base;
    private double altura;
    private int lados;
    

    public Triangulo(double pBase, double pAltura, int nLados){
        base = pBase;
        altura = pAltura;
        lados = nLados;
    }

    public double calcularArea(){
        return base * altura/2;
    }

    public int returnLados(){
        return lados;

    }
    

    public int compareTo(Figura triPorComparar){
        double areaPorComparar = triPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if(miArea==areaPorComparar){
            
            if(miArea==areaPorComparar){

                int misLados = this.returnLados();
                if(lados==misLados){
                    return 0;
                }
                else if (lados > misLados){
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
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
}