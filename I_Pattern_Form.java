
package i_pattern_form;

public class I_Pattern_Form 
{

    public static void main(String[] args)
    {
        System.out.println("\t--------->>> I Pattern Form <<<------------");
        
        for( int row = 0; row < 8; row++ )
        {
            for( int column = 0; column < 5; column++ )
            {
                if( row == 0 || column == 2 || row == 7 )
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
    }
    
}
