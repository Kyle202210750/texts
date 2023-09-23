public class MathRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double value = 250.0;
        double base = 5.0;

        // Calculate the logarithm base 5 of 250
        double num1 = Math.log(value) / Math.log(base);
        // Rewrite 250 as 5^logResult using the power rule
        double num2 = Math.pow(base, num1);
        
        System.out.println("Logarithm : " + num1);
        System.out.println("Expression : " + num2);
        System.out.println("Identity : " + value);
        // Output:
        // Logarithm : 3.430676558073393
        // Expression : 249.99999999999994
        // Identity : 250.0
    }
}
