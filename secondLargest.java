public class secondLargest {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        int largest = arr[0];
        int secondlargest = arr[0];
        for(int i = 0;i <arr.length;i++){
           if(arr[i] > largest){
            secondlargest = largest;
            largest = arr[i];
           }else if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];
           }
        }
        if(secondlargest == arr[0] && arr.length > 1){
            System.out.println("not foundd");
        }else{
            System.out.println(secondlargest);
        }
    }
}
