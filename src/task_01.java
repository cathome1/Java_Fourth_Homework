//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.Arrays;
import java.util.LinkedList;
public class task_01 {
    public static void main(String[] args) {
        LinkedList<Integer> new_arr = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(revert(new_arr));
        System.out.println(revertV2(new_arr));
    }
    public static LinkedList<Integer> revert(LinkedList<Integer> arr){
        int j = arr.size()-1;
        for (int i = 0; i < (Math.ceil(arr.size()/2)); i++) {
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            j--;
        }
        return arr;
    }
    public static LinkedList<Integer> revertV2(LinkedList<Integer> arr){
        LinkedList<Integer> arr2 = new LinkedList<>();
        for (int i = 0; i < arr.size(); i++) {
            arr2.addLast(arr.pollLast());
            i--;
        }
        return arr2;
    }
}
