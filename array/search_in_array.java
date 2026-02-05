import java.util.Scanner;

public class search_in_array{
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        boolean isfound = false;
        int ele = Integer.MAX_VALUE;
        int arr[];
        System.out.print("Enter the number of elements that you want to insert : ");
        int n = ni.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = ni.nextInt();
        }
        System.out.println("Enter the element that you want to find : ");
        int k = ni.nextInt();
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == k)
            {
                isfound = true;
                ele = arr[i];
            }
        }
        if(isfound)
        {

            System.out.println("The element " + ele + "found");
        }
        else
        {
            System.out.println("The element " + k +  "is not found");
        }
    }
}