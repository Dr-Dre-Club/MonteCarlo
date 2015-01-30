import java.util.Random;
/**
 * MonteCarlo class for estimating the exact value of pie.
 * 
 * @author Tyler Jackson
 * @version 1/30/15 v1.8
 */
public class MonteCarlo
{
    public double dh = 0;
    public double dk = 0;
    public double dr = 0;
    Random rndm = new Random(); 
    private double rambo = rndm.nextDouble();  
    
   public void MonteCarlo(double h, double k, double r){
       dh = h;
       dk = k;
       dr = r;
    }
    
   public double nextRainDrop_x(){
       double x = 0;
       x = (dh - dr) + (dr * 2) * rambo;
       return x; 
    }
    
   public double nextRainDrop_y(){
       double y = 0;
         y = (dk - dr) + (dr * 2) * rambo;
       return y;
    }
    
   public boolean insideCircle(double x, double y){
       double t = 0;
        t = Math.pow(2, (x - dh)) + Math.pow(2, (y - dk));
        t = Math.sqrt(t); 
        if(t <= Math.sqrt(dr)){
            return true;
        }
        else{
            return false;
        }
    }
}
