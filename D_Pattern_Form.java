
package d_pattern_form;

import java.util.Scanner;

public class D_Pattern_Form
{

    public static void main(String[] args)
    {
          System.out.println("\t-------------->>>> D Pattern Form <<<<----------------");
          
          for( int row = 0; row <= 6; row++ )
          {
              for( int column = 0; column <= 4; column++ )
              {
                  if( column == 0 || row == 0 || row == 6 || column == 4 )
                  {
                      System.out.print("B");
                      
                      column++;
                  }
                  else
                  {
                      System.out.print(" ");
                  }
              }
              System.out.println("");
          }
          
          // 2nd Method.
          
          Scanner scanner = new Scanner(System.in);
          
          int rowNumber , columnNumber;
          
          System.out.print("Please enter the number of row = ");
          
          rowNumber = scanner.nextInt();
          
          System.out.print("Please enter the number of column = ");
          
          columnNumber = scanner.nextInt();
          
          for( int row1 = 0; row1 <= rowNumber; row1++ )
          {
              for( int column1 = 0; column1 <= columnNumber; column1++ )
              {
                  if( column1 == 0 || ( ( row1 == 0 || row1 == rowNumber ) && ( column1 > 0 && column1 < columnNumber ) ) || ( column1 == columnNumber && ( row1 != 0 && row1 != rowNumber ) ) )
                  {
                      System.out.print("P");
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
