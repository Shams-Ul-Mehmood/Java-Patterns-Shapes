
package box.pattern.form;

public class BoxPatternForm 
{

    public static void main(String[] args)
    {
          System.out.println("\t---------->>> Box Pattern Form <<<---------------");
          
          // Box Pattern Form derived from Square Pattern Form.
          
          for( int row = 0; row <= 10; row++ )
          {
              for( int column = 0; column <= 10; column++ )
              {
                  if( row >= 1 && column >= 1 && row <= 9 && column <= 9 )
                  {
                      System.out.print(" ");
                  }
                  else
                  {
                      System.out.print("#");
                  }
              }
              System.out.println("");
          }
          
          // 2nd Method.
          
          for( int row = 1; row <= 9; row++ )
          {
              for( int column = 1; column <= 9; column++ )
              {
                  if( row >= 2 && column >= 2 && row <= 8 && column <= 8 )
                  {
                      System.out.print(" ");
                  }
                  else
                  {
                      System.out.print("o");
                  }
              }
              System.out.println("");
          }
          
          // 3rd Method.
          
          for( int x = 1; x <= 20; x++ )
          {
              for( int y = 1; y <= 20; y++ )
              {
                  if( x == 1 || y == 1 || x == 20 || y == 20 )
                  {
                      System.out.print("s");
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
