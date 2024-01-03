public class lesar {
    public static void main(String[] args) {
        String[] bank = {"111111111111111111111111110000000","100101000110000001001100000101110","000000001000100010001000100010001","000000000010000000000100000000001","101011000011110000111111001101101","000000001000001000001000001000001","100000000001000000000010000000000","100000100000100000100000100000000","000000000000001011000100000000000","000000000000000000000010000010010","000001001001001001001001001001001","100010001000100010001000100000000","111011111111111111111111011001100","000000001000100010001000100010001","000010101010101010101010101010101","100000001000100000100100000100010","000000001000100010001000100010001","000000100010001101010110100100110","100010001000100010001000100000000","100001000010000100001000010000000","101100010000001111000000100011000","100001000010000100001000010000000","000000001000001000001000001000001","000011111111111111111111111111111","100101111001011111111111110111000","000100000000000010001000100000100"};
            System.out.println(numberOfBeams(bank));
    }
    public static int numberOfBeams(String[] bank) {
        int total=0;
        int i=0;
        int pre=0;
        int curr=0;
       while (i<bank.length) {
        String s=bank[i];
        int no_1=find1(s);
        if (no_1!=0) {
        curr=no_1;
        total+=pre*curr;
        pre=curr;
        }
        i++;
       }
       return total;
        
}
private static int find1(String s) {
    int i=0;
    int count=0;
    while (i<s.length()) {
        if (s.charAt(i)=='1') {
            count++;
        }
        i++;
    }
    return count;
}
}

/*5. Number of Laser Beams in a Bank
Solved
Medium
Topics
Companies
Hint
Anti-theft security devices are activated inside a bank. You are given a 0-indexed binary string array bank representing the floor plan of the bank, which is an m x n 2D matrix. bank[i] represents the ith row, consisting of '0's and '1's. '0' means the cell is empty, while'1' means the cell has a security device.

There is one laser beam between any two security devices if both conditions are met:

The two devices are located on two different rows: r1 and r2, where r1 < r2.
For each row i where r1 < i < r2, there are no security devices in the ith row.
Laser beams are independent, i.e., one beam does not interfere nor join with another.

Return the total number of laser beams in the bank.

 

Example 1:


Input: bank = ["011001","000000","010100","001000"]
Output: 8
Explanation: Between each of the following device pairs, there is one beam. In total, there are 8 beams:
 * bank[0][1] -- bank[2][1]
 * bank[0][1] -- bank[2][3]
 * bank[0][2] -- bank[2][1]
 * bank[0][2] -- bank[2][3]
 * bank[0][5] -- bank[2][1]
 * bank[0][5] -- bank[2][3]
 * bank[2][1] -- bank[3][2]
 * bank[2][3] -- bank[3][2]
Note that there is no beam between any device on the 0th row with any on the 3rd row.
This is because the 2nd row contains security devices, which breaks the second condition. */
