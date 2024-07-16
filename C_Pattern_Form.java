
package c_pattern_form;

import java.util.Scanner;

public class C_Pattern_Form
{

    public static void main(String[] args)
    {
           System.out.println("\t---------------->>>> C Pattern Form <<<<-------------------");
           
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
                   if( ( column == 0 && ( row != 0 && row != rowNumber - 1 ) ) || ( ( row == 0 || row == rowNumber - 1 ) && column != 0 ) )
                   {
                       System.out.print("c ");
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
