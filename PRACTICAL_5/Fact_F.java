
public class Fact_F{
    public static int fact(int num) {
        int fact = 1;
        if (num < 2) { //for 0 or 1
            return 1;
        }
        for (int i = 2; i <= num; i++) { 
            fact *= i;
        }
        return fact; // Return the calculated factorial
    }

    public static void main(String[] args) {
        int num = 6; 
        int result = fact(num);//call the factorial
        System.out.println(result); // Print result
    }
}