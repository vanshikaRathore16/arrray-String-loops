public class concatanate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr2[] = {5,6,7,8};
        int result[] = new int[arr.length + arr2.length];
        for(int i = 0;i < arr.length;i++){
            result[i] = arr[i];
        }
        for(int j = 0;j < arr2.length;j++){
            result[arr.length + j] = arr2[j];
        }
        for(int num : result){
            System.out.print(num);
        }
    }
}
