import java.util.*;
public class cityBiker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        
        int n = Integer.parseInt(s.nextLine());
        int [] alt = new int[n];
        String ns = s.nextLine();
        String [] nums = ns.split(" ");
        for(int i=0; i<n; i++){
            sum += Integer.parseInt(nums[i]); 
            alt[i]=sum;
        }
        int max = alt[0];
        for (int idx = 0; idx < alt.length; idx++) {
            if(max<alt[idx])
            max  = alt[idx];
            
        }
        if(max>=0)
        System.out.println(max);
        else
        System.out.println(0);
    }
}
