// Remove duplicates from a sorted array and return the new length(without extra space).
import java.util.*;
public class rem_dup_sorted 
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
        for(int i =1;i<n;i++)
        {
            if(arr[i] != arr[j])
            {
                j++;
                arr[j] = arr[i];
            }
        }
        System.err.println("The new length is : " + (j+1));

         System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < (j+1); i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
