import java.util.*;
public class kthCharector {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String [] part = input.split(" ");
        int n = Integer.parseInt(part[0]);
        int k = Integer.parseInt(part[1]);
        String chr = s.nextLine();
        System.out.println(chr.charAt((n-k)));
        

    }
}
