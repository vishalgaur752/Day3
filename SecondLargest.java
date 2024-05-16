public class SecondLargest {
    public static int secondLarge(int arr[]) {
        int maxNum = -1;
        int secondMax = -1;
        for(int i = 0; i<arr.length; i++) {
            if(maxNum < arr[i]) {
                secondMax = maxNum;
                maxNum = arr[i];
            } else if(arr[i] > secondMax && arr[i] != maxNum) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int arr[] = {22, 22, 2};
        System.out.println(secondLarge(arr));
    }
}