public class aperaOne {
    public static void main(String[] args) {
        int arr [] = {34,34,5,5,3,4,4};
        int ref = 0;
        for(int i = 0;i < arr.length;i++){
           ref = ref ^ arr[i];
        }  
        System.out.println(ref);
    }
}
