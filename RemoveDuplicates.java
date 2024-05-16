public class RemoveDuplicates {
    public static int removeDuplicates(int arr[]) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            count++;
            if(i < arr.length - 1 && arr[i] == arr[i+1]) {
                count--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
    }
}
