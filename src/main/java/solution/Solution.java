package solution;

public class Solution {

    public int jumpingOnClouds(int[] arr) {
        int count = 0;
        int i = 0;

        while (i < arr.length - 1) {
            if (i < arr.length - 2 && arr[i + 2] == 0) {
                i++;
            }
            if (i != arr.length - 1) {
                count++;
            }
            i++;
        }
        return count;
    }

}
