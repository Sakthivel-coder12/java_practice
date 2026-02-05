//Check whether an array is sorted in non-decreasing order.

import java.util.Scanner;

public class non_decreasing_order {
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        int n = ni.nextInt();
        int arr[] = new int[n];
        
        
        for(int i = 0 ;i<n;i++)
        {   
            arr[i] = ni.nextInt();
        }
        boolean isnondec = true;
        for(int i = 0 ;i<n-1;i++)
        {
            if(arr[i+1] >= arr[i])
            {
                isnondec = false;
                break;
            }
            
        }
        if(isnondec)
        {
            System.err.println("Yes the array is in non decreasing order : ");
        }
        else
        {
            System.err.println("No the array is in non decreasing order :");
        }
    }
}

