class Practical_6{
    public static void Letter_S(int size)
    {
        int column = 2*size + 1;
        int row = 2*size + 3;
        int mid = row / 2 + 1;
        int mid_column = column / 2 + 1; 

// ==> this is for Letter "S" 
        for (int line = 1; line <= row; line++) //for row's
        {
            for (int straight = 1; straight <= column; straight++) //for column's
            {
                if ( (line == 1) || ((straight ==1) && (line < mid)) || (line == mid) || ((straight == column) && (line > mid)) || (line == row) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            System.out.println();

// ==> this is for letter "H"
        for (int line = 1; line <= row; line++) //for row's
        {
            for (int straight = 1; straight <= column; straight++) //for column's
            {
                if ( (straight == 1) || (straight == column) || (line == mid))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
                    System.out.println();

// ==> this is for letter "R"
      for (int line = 1; line <= row; line++) //for row's
        {
            for (int straight = 1; straight <= column; straight++) //for column's
            {
                if ( (straight == 1) || ((line == 1) && (straight < column)) || ((line < mid)&& (line>1) && (straight == column)) || ((line == mid) && (straight < column)) || ((line>mid) && (straight == column)) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            System.out.println();  
// ==> this is for letter "E"
      for (int line = 1; line <= row; line++) //for row's
        {
            for (int straight = 1; straight <= column; straight++) //for column's
            {
                if ((line == 1) || (straight == 1) || ((line == mid) && (straight < column)) || (line == row) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            System.out.println();  
// ==> this is for letter "Y"
      for (int line = 1; line <= row; line++) //for row's
        {
            for (int straight = 1; straight <= column; straight++) //for column's
            {
                if( ( (line < mid) && (( straight == 1) || ( straight == column ))) || (line == mid ) || ((line > mid ) && (straight == mid_column)) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();  
// ==> this is for letter "A"
      for (int line = 1; line <= row; line++) //for row's
        {
            for (int straight = 1; straight <= column; straight++) //for column's
            {
                if( ((line == 1) && (straight != 1) && (straight != column)) || (( line > 1) && ( ( straight == 1) || ( straight == column ))) || (line == mid) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
                    System.out.println();

        // ==> this is for Letter "S" 
        for (int line = 1; line <= row; line++) //for row's
        {
            for (int straight = 1; straight <= column; straight++) //for column's
            {
                if ( (line == 1) || ((straight ==1) && (line < mid)) || (line == mid) || ((straight == column) && (line > mid)) || (line == row) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
}       

    

    public static void main(String[] args)
    {
        // String size1 = args[0];
        // int size2 = Integer.parseInt(size1);
        Letter_S(1);
    }
}