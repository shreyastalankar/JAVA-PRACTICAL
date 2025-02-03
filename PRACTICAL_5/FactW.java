public class FactW{
    public static int fact(int n){
        int i = 1;
        int count = 1;

        while(i<=n){
            count = count * i;
            i++;
        }
        return count;
    }
    public static void main(String[] args){
        int n = 6;
        int result = fact(n);
        System.out.println(result);
    }
}