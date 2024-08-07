import java.math.BigInteger;
import java.util.Scanner;

public class goodpudding {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         for(int i =0;i<n;i++){
            BigInteger m = s.nextBigInteger();
            if (m.mod(BigInteger.TEN).equals(BigInteger.ZERO))System.out.println('0');
            else System.out.println('1');
         }
    }
}
