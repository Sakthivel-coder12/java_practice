// Find the first non-repeating character in a string.

import java.util.*;

public class first_non_repeating_char 
{
    public static void main(String[] args) 
    {
        Scanner ni = new Scanner(System.in);
        String str1 = ni.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : str1.toCharArray())
        {
            map.put(c,map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet() )
        {
            System.out.println(entry);
        }
        boolean isfound = false;
        for(char c : str1.toCharArray())
        {
            if(map.get(c) == 1)
            {
                System.out.println("First non-repeating character is : " + c);
                isfound = true;
                break;
            }
        }
        if(!isfound)
        {
            System.out.println("All characters are repeating");
        }
    }    
}
