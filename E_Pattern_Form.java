
package e_pattern_form;

import java.util.Scanner;

public class E_Pattern_Form 
{

    public static void main(String[] args)
    {
        System.out.println("\t------------->>>> E Pattern Form <<<<---------------------");
         
        Scanner scanner = new Scanner(System.in);
        
        int rowNumber , columnNumber;
        
        System.out.print("Please enter the number of row = ");
        
        rowNumber = scanner.nextInt();
        
        System.out.print("Please enter the number of column = ");
        
        columnNumber = scanner.nextInt();
        
        for( int row = 0; row < rowNumber; row++ )
        {
            for( int column = 0; column < columnNumber; column++ )
            {
                if( column == 0 || row == 0 || row == rowNumber - 1 / 2 || row == rowNumber - 1 || ( row == 3 && column != columnNumber - 1 / 2 ) )
                {
                    System.out.print("!");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
