
package a_pattern_form;

import java.util.Scanner;

public class A_Pattern_Form
{

    public static void main(String[] args) 
    {
          System.out.println("\t---------->>>> A Pattern Form <<<<---------------");
          
          for( int row = 0; row < 9; row++ )
          {
              for( int column = 0; column < 6; column++ )
              {
                  if( row == 5 || ( column == 0 && row != 0 ) || ( column == 5 && row != 0 ) || ( row == 0 && ( column > 0 && column < 5 ) ) )
                  {
                      System.out.print("?");
                  }
                  else
                  {
                      System.out.print(" ");
                  }
              }
              System.out.println("");
          }
          
          System.out.println("\n\n 2nd Logic \n\n");
          
          // 2nd Method.
          
          Scanner hacker = new Scanner(System.in);
          
          int rowNumber , columnNumber;
          
          System.out.print("Please enter the number of row = ");
          
          rowNumber = hacker.nextInt();
          
          System.out.print("Please enter the number of column = ");
          
          columnNumber = hacker.nextInt();
          
          for( int row1 = 0; row1 < rowNumber; row1++ )
          {
              for( int column1 = 0; column1 < columnNumber; column1++ )
              {
                  if( ( ( column1 == 0 || column1 == columnNumber - 1 ) && row1 != 0 ) || ( row1 == rowNumber / 2 || row1 == 0 ) && (column1 > 0 && column1 < columnNumber - 1 )  )
                  {
                      System.out.print("#");
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
