import java.util.*;

public class freq_each_ele 
{
    public static void main(String[] args) 
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = ni.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = ni.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            System.out.print(entry + " ");
        }
    }    
}