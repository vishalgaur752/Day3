public class MissingNumber {
    public static int findMissingNum(int nums[]) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i<nums.length; i++) {
            sum = sum + nums[i];
        }
        int actualSum = (n* ( n + 1))/ 2;
        int missingNum = actualSum - sum;
        return missingNum;
    }
    public static void main(String[] args) {
        int nums[] = {0, 2, 3, 7, 5, 4, 6};
        System.out.println(findMissingNum(nums));
    }
}
