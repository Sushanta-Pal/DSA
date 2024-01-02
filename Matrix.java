import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Matrix {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(findMatrix(nums));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        while (!mp.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            for (Integer key : new ArrayList<>(mp.keySet())) {
                if (mp.get(key) > 0) {
                    l.add(key);
                    mp.put(key, mp.get(key) - 1);
                }
                if (mp.get(key) == 0) {
                    mp.remove(key);
                }
            }
            list.add(l);
        }

        return list;
    }
}


/*2610. Convert an Array Into a 2D Array With Conditions
Solved
Medium
Topics
Companies
Hint
You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:

The 2D array should contain only the elements of the array nums.
Each row in the 2D array contains distinct integers.
The number of rows in the 2D array should be minimal.
Return the resulting array. If there are multiple answers, return any of them.

Note that the 2D array can have a different number of elements on each row.

 

Example 1:

Input: nums = [1,3,4,1,2,3,1]
Output: [[1,3,4,2],[1,3],[1]]
Explanation: We can create a 2D array that contains the following rows:
- 1,3,4,2
- 1,3
- 1
All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
It can be shown that we cannot have less than 3 rows in a valid array. */