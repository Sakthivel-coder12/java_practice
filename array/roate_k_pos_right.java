import java.util.*;
class rotate{
    void print_arr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    void rotate_k(int left,int right,int arr[])
    {
        while(left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
public class roate_k_pos_right 
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
        rotate r = new rotate();
        System.out.println("Enter K positions you want to rotate");
        int k = ni.nextInt();
        k = k % arr.length;
        r.rotate_k(0,n-1, arr); // to rotate right , if you want to rotate left we have reverse the entire array atlast 
        r.rotate_k(0, k-1, arr);
        r.rotate_k(k, n-1, arr);
        // r.rotate_k(0,n-1, arr);  to rotate left 
        r.print_arr(arr);
    }
}
