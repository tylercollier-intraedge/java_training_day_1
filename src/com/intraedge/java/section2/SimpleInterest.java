/**
 * Evaluate a simple interest equation to find the accrued amount that includes
 * principal plus interest. The formula for the accrued amount is A = P(1 + rt)
 * P = principal amount
 * r = rate of interest in %
 * t = time in years
 * Get these three values from the user as command line arguments and calculate the accrued amount
 */
public class SimpleInterest {
	public static void main(String[] args) {
    	float p = Float.parseFloat(args[0]);
    	float r = Float.parseFloat(args[1]);
    	float t = Float.parseFloat(args[2]);

    	Float a = p * (1 + r * t);
    	System.out.println("Result " + a);
	}
}