import java.util.*;

public class sum{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.print("Enter the number to find sum of the digits : ");
        int a = ni.nextInt();
        int sum = 0;
        while(a > 0)
        {
            sum += a % 10;
            a = a/10;
        }
        
        System.out.println("The sum of the digits is "  + sum);
        System.out.println(4%3);
    }
}