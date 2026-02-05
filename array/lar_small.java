// Find the largest and smallest element in an array in one traversal.
import java.util.*;
public class lar_small 
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
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("The max value  : "  + max);
        System.out.println("The min value : "  + min);
    }    
}
