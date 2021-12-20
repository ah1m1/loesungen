public class Rice
{
    private long iterations;
    private double weight;
    
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
