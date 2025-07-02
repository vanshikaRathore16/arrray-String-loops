public class Bruteforce {
    public static void main(String [] args){
        int arr[]= {4,6,3,2,6,8,1,3,5,5,5,3,2};

        for(int i = 0;i < arr.length-1;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[i]== arr[j]){
                    System.out.print(arr[i]+ " ");
                }
            }
        }


    }
}
