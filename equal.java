public class equal {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,7,8,9,10};
        int arr2 [] = {1,2,3,4,7,8,9,10};
        boolean yes = false;
         if(arr.length != arr2.length){
            System.out.println("array are not equals");
            return;
        }
        for(int i = 0; i < arr.length;i++){
           
            if(arr[i] != arr2[i]){
             yes = true;
            }
        }
        if(yes){
            System.out.println("not  equals");
        }else{
            System.out.println(" equals");
        }
    }
}
