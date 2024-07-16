
package g_pattern_form;

import java.util.Scanner;

public class G_Pattern_Form
{

    public static void main(String[] args)
    {
        System.out.println("\t----------->>> G Pattern Form <<<----------------");
        
        for( int row = 0; row < 9; row++ )
        {
            for( int column = 0; column < 7; column++ )
            {
                if( ( row == 0 && ( column != 0 && column != 6 ) ) || ( column == 0 && ( row > 0 && row < 8 ) ) || ( row == 8 && ( column != 0 && column != 5 ) ) || 
                        ( row == 5 && column != 1 ) || ( column == 4 && ( row >= 5 && row <= 8 ) ) || ( column == 6 && ( row > 0 && row < 3 ) ) || 
                           ( column == 6 && ( row >= 5 && row <= 8 ) ) )
                {
                    System.out.print("%");
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
