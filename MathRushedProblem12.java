public class MathRushedProblem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double value = 1024.0;
        double base = 2.0;

        // Calculate the logarithm base 2 of 1024
        double num1 = Math.log(value) / Math.log(base);
        // Rewrite 1024 as 2^logResult using the power rule
        double num2 = Math.pow(base, num1);
        // Apply the identity rule: 2^logResult = 1024
        
        System.out.println("Logarithm : " + num1);
        System.out.println("Expression : " + num2);
        System.out.println("Identity : " + value);
        // Output:
        // Logarithm : 10.0
        // Expression : 1024.0
        // Identity : 1024.0
    }
}
