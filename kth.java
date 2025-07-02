public class kth{
    public static void main(String [] args){
        int arr [] = {24,43,3,23,6,43};
        int kth = 2;
        
        for(int i = 0;i < arr.length - 1;i++){
            int temp = 0;
            for(int j = i+1;j < arr.length;j++){
                if(arr[i] < arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
            if (i == kth-1){
                System.out.println("kth value is = " + arr[i]);
            }
        }
        for(int k = 0;k < arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }
}