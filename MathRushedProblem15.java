public class MathRushedProblem15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum = 0.0;
        
        // x = 1 lower with upper of 3
        for (int x = 1; x <= 3; x++) {
            // y = 0 lower with upper of 4
            for (int y = 0; y <= 4; y++) {
                // Calculate the term (x^y)
                double term = Math.pow(x, y); 
                // Accumulate the sum
                sum += term;
            }
        }
        
        System.out.println(sum);
        // Output: 157.0
    }
}
