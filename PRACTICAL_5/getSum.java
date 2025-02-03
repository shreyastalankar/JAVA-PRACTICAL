public class getSum {
    static int getSum(int[] number, int index) {
        if (index == number.length) {
            return 0;
        }
        return number[index] + getSum(number, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getSum(arr, 0));
         
        int[] shreyas = {11,22,33,44};
        System.out.println(getSum(shreyas, 0));
        }
    }

