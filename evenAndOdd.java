public class evenAndOdd {
    public static void main(String[] args) {
        int arr [] = {2,4,6,5,3,1,7,9,8,0};
        for(int i = 0;i < arr.length;i++){
            if(arr[i] % 2 == 0){
                System.out.print( "event number  = " + arr[i] + " ");
            }else{
               System.out.print("odd number = " +arr[i] + " ");
            }
        }
    }
}
