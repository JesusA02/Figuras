public class Circulo extends Figura implements Comparable<Figura>{
    private double radio;
    private int lados;

    public Circulo(double nRadio, int nLados){
        radio = nRadio;
        lados = nLados;
       
    }

    public double calcularArea(){
        return 3.14 * radio;
    }

    public int returnLados(){
        return lados;
    }

    public int compareTo(Figura cirPorComparar){
        double areaPorComparar = cirPorComparar.calcularArea();
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