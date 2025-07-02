public class FirstDuplicate {
    public static void main(String[] args) {
        int arr [] = {23,4,65,65,32,87,43,34,32};
        boolean temp = false;
        for(int i = 0;i < arr.length-1;i++){
           
            for(int j = i + 1; j < arr.length;j++){
                if(arr[i] == arr[j]){
                   System.out.print(arr[i]+" ");
                   temp = true;
                   break;
                }
                
            }
            if(temp)
                    break;
                
        }
    }
}
