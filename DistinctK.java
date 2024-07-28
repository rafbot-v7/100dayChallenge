/*
Problem Statement
You wish to help Ashish, who possesses a collection of N strings, some of which may be duplicated, and has been assigned the task of finding the kth unique string.

If the number of unique strings is less than k, he needs to display an empty string. Considering you are Ashish's best friend can you assist him with this challenge?

Input Format
The first line contains an integer N denoting the number of strings.
The next N lines contain strings.
The next line contains an integer k.
Output Format
The output contains the kth distinct string. If there are less than k unique string display an empty string.
*/
import java.util.*;
public class DistinctK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int n = s.nextInt();
        List<String> string = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            string.add(s.next());
            
        }
        System.out.println("enter k");
        int k = s.nextInt();
        Map<String,Integer> map = new HashMap<>();
        List<String> order = new ArrayList<>();
        for (String str : string) {
            if(map.containsKey(str))map.put(str, map.get(str)+1);
            else{
                map.put(str, 1);
                order.add(str);
            }
        }
        
        List<String> unique = new ArrayList<>();
        for (String str : order) {
            if(map.get(str)==1) unique.add(str);
        }
        
        if(k<=unique.size())
        System.out.println(unique.get(k-1));
        else
        System.out.println("");

    }
}
