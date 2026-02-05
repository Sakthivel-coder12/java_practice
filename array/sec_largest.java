import java.util.*;
public class sec_largest 
{
    public static void main(String[] args) 
    {
        Scanner ni = new Scanner(System.in);
        int n = ni.nextInt();
        int arr[] = new int[n];
        
        
        for(int i = 0 ;i<n;i++)
        {   
            arr[i] = ni.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondlarget = Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num > largest)
            {
                secondlarget = largest;
                largest = num;
            }
            else if(num > secondlarget && num != largest)
            {
                secondlarget = num;
            }
        }
        System.out.println("The second largest is  : " + secondlarget);
    }    
}
