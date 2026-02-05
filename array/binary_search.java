import java.util.*;
public class binary_search 
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        int n = ni.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ;i<n;i++)
        {   
            arr[i] = ni.nextInt();
        }
        System.out.println("Enter the element that you want to find : ");
        int f = ni.nextInt();
        int l = 0;
        int r = arr.length-1;
        int mid = (l+r)/2;
        boolean isfound = false;
        while(l<r)
        {
            if(arr[mid] == f)
            {
                isfound = true;
                break;
            }
            else if(f > arr[mid])
            {
                l = mid + 1;
                mid = (l+r)/2;
            }
            else
            {
                r = mid - 1;
                mid = (l+r)/2;
            }
        }
        if(isfound)
        {
            System.out.println("The element is found " + arr[mid]);
        }
        else
        {
            System.out.println("The element is not found ");
        }
    }    
}
