/**
 * Chris Farley
 */
public class SomeLoops 
{
    public static void main(String[] args)
    {
        for(int x = 0; x < 1000; x++)
        {
            System.out.println("The current value of x is " + X);
        }       
        
        for(int y = 0; y < 1000; y++)
        {
            if(y%3 == 0 && y%5 == 0)
            {
                System.out.print("fizzbuzz");
            }
            else if(y%3 == 0)
            {
                System.out.print("fizz");
            }
            else if(y%5 == 0)
            {
                System.out.print("buzz");
            }
            else
            {
                System.out.print(y);
            }
        }
             
    }
}
