import java.util.*;
public class freqeunce 
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
        int count = 0;
        System.out.println("Enter for which element you want to find number of occurance : ");
        int f = ni.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i] == f)
            {
                count++;
            }
        }
        System.out.println("The frequence of the number " +f + " is " + count);
    }    
}
