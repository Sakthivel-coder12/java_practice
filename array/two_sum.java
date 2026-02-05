import java.util.*;
public class two_sum 
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
        System.out.print("Enter the target : ");
        int t = ni.nextInt();
        HashSet<Integer> map = new HashSet<>();
        for(int num : arr)
        {
            int need = t - num;
            if(map.contains(need))
            {
                System.out.println(need + " ,  " + num);
            }
            map.add(num);
        }
    }    
}
