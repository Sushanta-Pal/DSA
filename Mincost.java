import java.util.HashMap;

public class Mincost {
    public static void main(String[] args) {
        String colors = "abaac";
        int[] neededTime={1,2,3,4,5};
        System.out.println(minCost(colors, neededTime));
    }
    public static int minCost(String colors, int[] neededTime) {
        int time=0;
  HashMap<Character,Integer> hs= new HashMap<>();
            for(int i=0;i<neededTime.length;i++){
                if (hs.containsKey(colors.charAt(i))) {
                    if (hs.get(colors.charAt(i)) >neededTime[i]) {
                        time+=neededTime[i];
                    }
                    else {
                        time+=hs.get(colors.charAt(i));
                        hs.put(colors.charAt(i), neededTime[i]);
                    }
                }
                else{
                    hs.clear();
                    hs.put(colors.charAt(i), neededTime[i]);
                }
            }
        return time;
    }
}
/*Minimum Time to Make Rope Colorful
Solved
Medium
Topics
Companies
Hint
Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.

Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help. Bob can remove some balloons from the rope to make it colorful. You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.

Return the minimum time Bob needs to make the rope colorful.

 

Example 1:


Input: colors = "abaac", neededTime = [1,2,3,4,5]
Output: 3
Explanation: In the above image, 'a' is blue, 'b' is red, and 'c' is green.
Bob can remove the blue balloon at index 2. This takes 3 seconds.
There are no longer two consecutive balloons of the same color. Total time = 3. */
