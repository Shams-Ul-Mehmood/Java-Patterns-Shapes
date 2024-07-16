
package pkg7.pattern.form;

public class PatternForm 
{

    public static void main(String[] args) 
    {
         System.out.println("\t-------------->>> 7 Pattern Form <<<------------------");
         
        for( int aa = 1; aa <= 7; aa++ )
        {
            for( int bb = aa; bb <= 7; bb++ )
            {
                if( aa >= 2 && bb >= 2 && aa <= 6 && bb<=6 )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("P");
                }
            }
            
            System.out.println("");
        }
         
    }
    
}
