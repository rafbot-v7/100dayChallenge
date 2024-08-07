 
import java.util.*;
 
class magic {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         String st = s.next();
         int arr[]={0,0};
         for(int i = 0 ; i<n;i++){
            if(st.charAt(i)=='U')arr[0]+=1;
            if(st.charAt(i)=='D')arr[0]-=1;
            if(st.charAt(i)=='L')arr[1]+=1;
            if(st.charAt(i)=='R')arr[1]-=1;

         }
         if(arr[0]==0&arr[1]==0)System.out.println("YES");
         else System.out.println("NO");
    }
}