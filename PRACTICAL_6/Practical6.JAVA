public class Practical6 {
    public static void main(String[] args) {
        Practical6 p = new Practical6();
        p.displayPattern1(3);  // the diamond pattern for size = 3
        p.displayPattern2(3);
        p.displayPattern3(3);
    }
    
    public void displayPattern1(int size) {
        // upper half with middle line
        for (int row = 1; row <= size; row++) 
        {
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }

            for (int plus = 1; plus <= (2 * row - 1); plus++) 
            {
                System.out.print("+");
            }
            System.out.println();
            
        }
        
        // FOR the lower half pattern
        for (int row = 1; row < size; row++) {
            for (int space = 1; space <= row; space++)
            {
                System.out.print(" ");
            }
            for (int plus = 1; plus <= (2 * (size - row) - 1); plus++) 
            {
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void displayPattern2(int size ){
        for(int row=1;row<=size;row++){
            for(int space=1;space<=size-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=((2*row)-1);star++){
                if(star%2==0){
                    System.out.print(" ");
                }
                else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
        for(int row=1;row<size;row++){
            for(int space=1;space<=row;space++){
                System.out.print(" ");
            }
            for(int star=((size-1)*2-1);star>=((row*2)-1);star--){
                if(star%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    public void displayPattern3(int size){
        for(int row=1; row<=size;row++){
            for(int space=1; space <= size-row; space++)
            {
                System.out.print(" ");
            }
            for(int symbol=1;symbol<=2*row-1;symbol++)
            {
                if(((row + symbol) % 2 == 0))
                {
                    System.out.print("+");
                }
                else 
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int row=1; row<=size; row++)
        {
            for(int space=1; space < row; space++)
            {
                System.out.print(" ");
            }
            for(int symbol = ((size*2)-1); symbol >= ((row*2)-1); symbol--)
            {
                if(symbol%2==0)
                {
                    System.out.print("+");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
