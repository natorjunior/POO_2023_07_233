import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class DistanciaEuclidiana{
    int xi, yi, xii, yii;
    public double calcula(int xi,int yi,int xii, int yii){
        return sqrt(pow((xi - xii),2) + pow((yi - yii),2));
    }
}