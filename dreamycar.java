import java.util.Scanner;
public class dreamycar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int result = 0;
        int n = scanner.nextInt();
        int[] features = new int[n];
        
        for(int num = 0; num < n; num++) {
            features[num] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
             
              
             
            if (((i + 1) * (n - i)) % 2 == 1) {
                result ^= features[i];
            }
        }
        
        System.out.println(result);
     
 
}}