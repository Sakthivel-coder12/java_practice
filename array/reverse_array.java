// Reverse an array in place without using extra space
import java.util.*;
class reverse{

    void letreverse(int arr[])
    {
        int s = 0;
        int e = arr.length-1;
        while(s<=e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        System.out.println("The reversed array : ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
public class reverse_array 
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
            
            reverse a = new reverse();
            a.letreverse(arr);
    }

}
