import java.util.HashMap;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int count = 0;
        int[] solution = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int number : nums) {
            if (map.containsKey(number)) {
                map.put(number, map.getOrDefault(number, 0) + 1);
            } else {
                map.put(number, 1);
            }
        }
        for (int i = 0; i < k; i++){

        }
        return null;
    }
}
