
/**
 * Write a description of class Rice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rice
{
    // instance variables - replace the example below with your own
    private long iterations;
    private double weight;

    /**
     * Constructor for objects of class Rice
     */
    public Rice(long iterations, double weight)
    {
       this.iterations = iterations;
       this.weight = weight;
    }
    
    public long getAmount() {
        long amount = 1;
        for(int i = 1; i <= iterations; i++) {
            amount = amount * 2;
        }
        return amount;
    }
    
    public double getWeight() {
        return weight * getAmount();
    }
}
