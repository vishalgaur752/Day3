public class RemoveDuplicates {
    public static int removeDuplicates(int arr[]) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            if(i < arr.length - 1 && arr[i] == arr[i+1]) {
                continue;
            } else {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
    }
}
