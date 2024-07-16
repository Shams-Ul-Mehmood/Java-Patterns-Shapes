
package h_pattern._form;

public class H_Pattern_Form 
{

    public static void main(String[] args)
    {
          System.out.println("\t--------------->>>> H Pattern Form <<<<--------------------");
        
          for( int row1 = 0; row1 < 9; row1++ )
          {
              for( int column1 = 0; column1 < 6; column1++ )
              {
                  if( ( column1 == 0 || column1 == 5 ) && row1 != 0  || ( row1 == 5 || row1 == 0 ) && ( row1 != 0 && column1 > 0 && column1 < 5 ) )
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
