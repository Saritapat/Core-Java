public class SumOfFirstFive {
    public static void main(String[] args) {
        int sum = 0;

        
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;  
        }

        System.out.println("Sum of first 5 numbers = " + sum);
    }
}
