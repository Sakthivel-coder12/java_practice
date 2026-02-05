
import java.util.*;
public class anagram 
{
    public static void main(String[] args) 
    {
        Scanner ni = new Scanner(System.in);
        String str1 = ni.nextLine();
        String str2 = ni.nextLine();

        HashMap<Character,Integer> s1 = new HashMap<>();
        HashMap<Character,Integer> s2 = new HashMap<>();

        for(char c:str1.toCharArray())
        {
            s1.put(c,s1.getOrDefault(c, 0)+1);
        }
        for(char c:str2.toCharArray())
        {
            s2.put(c,s2.getOrDefault(c, 0)+1);
        }

        if(s1.equals(s2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }    
}


// public class anagram 
// {
//     public static void main(String[] args) 
//     {
//         int freq[] = new int[26];
//         Scanner ni = new Scanner(System.in);
//         String str1 = ni.nextLine();
//         String str2 = ni.nextLine();    

//         for(char c : str1.toCharArray())
//         {
//             freq[c - 'a']++;
//         }
//         for(char c : str2.toCharArray())
//         {
//             freq[c - 'a']++;
//         }
//         boolean isanagram = true;
//         for(int f : freq)
//         {
//             if(f != 0)
//             {
//                 isanagram = false;
//             }
//         }
//         if(isanagram)
//         {
//             System.out.println("The strings are anagram");
//         }
//         else
//         {
//             System.out.println("The strings are not anagram");
//         }
//     }
// }