public class specificValue {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9,10};
        int num = 6;
        boolean yes = false;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == num){
                yes = true;
                break;
            }
        }
        if(yes){
            System.out.println("founded");
        }else{
            System.out.println("not founded");
        }
    }
}

