import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution3 {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> seen = new HashMap<>();

    for (int num : nums){
        seen.put(num, seen.getOrDefault(num,0), + 1);
    }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> seen.get(a) - seen.get(b));
            for (int num : seen.keySet()){
                minHeap.add(num);
                    if (minHeap.size() > k ){
                        minHeap.poll();
                    }
            }

        int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()){
            result[i++] = minHeap.poll();
        }
        return result;
    }

/*
    Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]
*/
}
