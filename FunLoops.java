  //Milind Pathiyal

// Find LCM, Reverse number chain, find magic squares
import java.util.*; 
public class FunLoops
{
    public void start()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter two numbers and I will find the least common multiple");
        int first = keys.nextInt();
        int second = keys.nextInt();
        int lcm = findLCM(first, second);
        System.out.println("The LCM of " + first + " and " + second + " is " + lcm);
        
        System.out.println("Enter an integer to be reversed");
        int forward = keys.nextInt();
        int backward = reverse(forward);
        System.out.println("" + forward + " reversed is " + backward);
        
        System.out.println("How many magic squares do you want to find?");
        int number = keys.nextInt();
        printMagicSquares(number);
   }

   //LCM Project
    public int findLCM(int one, int two)
    {
        int answer= 0;
        int lcm = 0;
        int x = 1;
        while (x <= two)
        {
            answer = x * one;
            if(answer % two==0)
            {
                lcm = answer;
                break;
            }
            x++;
        }        
        return lcm;        
   }
    
   //Reverse Number Project
    public int reverse(int forward)
    {
        int backward = 0;
        while (forward != 0)
        {
            backward = (forward % 10) + (backward * 10);
            forward = forward / 10;
            
        }
        return backward;
   }
    
   //MagicSquares Project
    public int printMagicSquares(int number)
    {
        int magicSquare = 0;
        int sum = 0;   
        for ( int i = 0; i < number ; ++i)
            {
                sum +=i;
                
            for( int j = 0; j< number ; ++j)
        {
            magicSquare = j* j;
             
            if ( magicSquare == sum)
            {
                System.out.println("Magic Square "+ magicSquare);
            }
            
        } 
            
    }   
        return number;
   }
}


/*
Enter two numbers and I will find the least common multiple
6
2
The LCM of 6 and 2 is 6
Enter an integer to be reversed
12345
12345 reversed is 54321
How many magic squares do you want to find?
100
Magic Square 0
Magic Square 1
Magic Square 36
Magic Square 1225
*/