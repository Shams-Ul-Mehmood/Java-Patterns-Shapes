
package inverted.pyramidcal.pattern.form;

public class InvertedPyramidcalPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t!!!!!!!!!!!!!! Inverted Pyramidical Pattern Form !!!!!!!!!!!!!!!!!!!!!!1");
        
        for( int row = 1; row <= 7; row++ )
        {
            for( int column = 1; column <= row; column++ )
            {
                System.out.print(" ");
            }
            for( int colu = row; colu <= 7; colu++ )
            {
                System.out.print(" +");
            }
            System.out.println("");
        }
        
        // 2nd Method.
        
         for( int kk = 1; kk <= 10; kk++ )
         {
             for( int ll = 1; ll <= kk; ll++ )
             {
                 System.out.print(" ");
             }
             for( int mm = 10; mm >= kk; mm-- )
             {
                 System.out.print("< ");
             }
             System.out.println("");
         }
        
        // 3rd Method.
         
        for( int c = 1; c <= 10; c++ )
        {
            for( int ll = 1; ll <= c; ll++ )
            {
                System.out.print(" ");
            }
            for( int d = 10; d >= c; d-- )
            {
                System.out.print("P ");
            }
            System.out.println("");
        } 
        
        // 4th Method.
        
        for( int row = 1; row <= 7; row++ )
        {
            for( int columnSpace = 1; columnSpace <= 7; columnSpace++ )
            {
                  if( columnSpace < row )
                  {
                      System.out.print(" ");
                  }
                  else
                  {
                      System.out.print("$ ");
                  }
            }
                 System.out.println("");             
        }
         
    }
    
}
