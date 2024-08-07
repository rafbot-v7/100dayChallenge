import  java.util.*;
class moachasAlienDictionary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String s = scanner.nextLine();

         
        int n = scanner.nextInt();
        scanner.nextLine();  

        
        Set<String> dictionary = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dictionary.add(scanner.nextLine());
        }

        
        boolean canSegment = canSegmentString(s, dictionary);

    
        System.out.println(canSegment ? "true" : "false");
    }

    private static boolean canSegmentString(String s, Set<String> dictionary) {
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;  

        
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dictionary.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;  
                }
            }
        }

        return dp[length];
         
    }
}