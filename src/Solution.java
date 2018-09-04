import java.util.Scanner;

public class Solution 
{
    public static boolean checkDivide(int weight)
    {
        if (weight == 0 || weight == 2)
        {
            return false;
        }
        else
        {
            return weight % 2 == 0;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        if (input.hasNextInt())
        {
            int weight = input.nextInt();
            
            if(checkDivide(weight))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
            input.close();
        }
        else
        {
            System.out.println("NO");
            input.close();
        }

    }
}
