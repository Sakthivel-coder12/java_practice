import java.util.*;
public class first_repeating_element_in_array 
{
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the n elements : ");
        int n = ni.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = ni.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        int firstRepeating = -1;

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            if (set.contains(arr[i])) 
            {
                firstRepeating = arr[i];
            } 
            else 
            {
                set.add(arr[i]);
            }
        }
        System.out.println(firstRepeating);
    }
}

