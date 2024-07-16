
package hollow.slice.pattern.form;

import java.util.Scanner;

public class HollowSlicePatternForm 
{

    public static void main(String[] args) 
    {
          System.out.println("\t------------------->>> Hollow Slice Pattern Form <<<-----------------------");
          
          for( int row = 0; row <= 4; row++ )
          {
              for( int column = 0; column <= 4; column++ )
              {
                  if( row == 0 || column == 4 || row == column )
                  {
                      System.out.print("+");
                  }
                  else
                  {
                      System.out.print(" ");
                  }
              }
              System.out.println("");
          }
          
          ///////////////////////////////////////////////////////////////////////////////
          
          Scanner scanner = new Scanner(System.in);
          
          int rowNumber;
          
          System.out.print("Please enter the number or row = ");
          
          rowNumber = scanner.nextInt();
          
          for( int row = 0; row < rowNumber; row++ )
          {
              for( int column = 0; column < rowNumber; column++ )
              {
                  if( row == 0 || column == rowNumber - 1 || row == column )
                  {
                      System.out.print("o ");
                  }
                  else
                  {
                      System.out.print("  ");
                  }
              }
              System.out.println("");
          } 
          
          
    }
    
}
