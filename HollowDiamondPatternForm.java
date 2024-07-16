
package hollow.diamond.pattern.form;

public class HollowDiamondPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t---------->>> Hollow Diamond Pattern Form <<<---------------");
        
        for( int row = 0; row < 5; row++ )
        {
            for( int column = 0; column < 5; column++ )
            {
                if( row + column == 2 || column - row == 2 || row - column == 2 || row + column == 6 )
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
         
        //////////////////////////////////////
        
       for( int row = 0; row <= 8; row++ )
       {
           for( int column = 0; column <= 8; column++ )
           {
               if( row + column == 12 || row + column == 4 || column - row == 4 || row - column == 4 )
               {
                   System.out.print("O");
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
