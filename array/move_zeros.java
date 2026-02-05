// Move all zero elements to the end while maintaining relative order of others.
import java.util.*;
public class move_zeros 
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

        int j = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] != 0)
            {
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<n)
        {
            arr[j] = 0;
            j++;
        }
        for(int i = 0 ;i<n;i++)
        {   
            System.out.print(arr[i] + ",");
        }
 
    }    
}
