import java.util.*;
public class basicEncoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < q; i++) {
            int count = scanner.nextInt();
            int number = scanner.nextInt();
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + count);
        }
        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        int minFrequency = Collections.min(frequencies);
        int maxFrequency = Collections.max(frequencies);
        Set<Integer> minFrequencyNumbers = new HashSet<>();
        Set<Integer> maxFrequencyNumbers = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == minFrequency) {
                minFrequencyNumbers.add(entry.getKey());
            }
            if (entry.getValue() == maxFrequency) {
                maxFrequencyNumbers.add(entry.getKey());
            }
        }
        int maxDifference = 0;
        for (int minNum : minFrequencyNumbers) {
            for (int maxNum : maxFrequencyNumbers) {
                maxDifference = Math.max(maxDifference, Math.abs(maxNum - minNum));
            }
        }
        System.out.println(maxDifference);
    }
}
