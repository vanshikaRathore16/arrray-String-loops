import java.util.*;
public class SetDuplicate {
     public static void main(String[] args) {
        int arr[] = {2,4,4,4};
        Set s = new HashSet<>();
        for(int no : arr){
            if(s.add(no) == false){
                System.out.print(no);
            }
        }

     }
}
