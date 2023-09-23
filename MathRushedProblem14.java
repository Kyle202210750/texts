public class MathRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        // i = 2 lower with an upper of 5
        for (int i = 2; i <= 5; i++) {
            // Calculate the term (i + 2)
            int term = i + 2;
            // Accumulate the sum
            sum += term;
        }
        
        System.out.println(sum);
        // Output: 22
    }
}
