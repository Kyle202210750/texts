public class MathRushedProblem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = factorial(5) / (factorial(3) * factorial(2));
        
        System.out.println(num1);
        // Output: 10
    }
    
    static int factorial(int value) {
        if (value == 0 || value == 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }
}
