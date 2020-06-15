import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
    
    public static int removeDuplicates(int[] nums) {
        List<Integer> numList = new ArrayList<>(nums.length);
        for (int n : nums)
            numList.add(n);
        // Collections.addAll(numList, nums);
        // int length = numList.size();
        // System.out.println(numList);
        for (int i = 0; i < numList.size() - 1; i++) {
            if (numList.get(i) == numList.get(i + 1)) {
                numList.remove(i);
            }
        }
        return numList.size();
    }

    
}