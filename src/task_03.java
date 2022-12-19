import java.util.*;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//a+(d*3) - истина
//\[a+(1*3) - ложь
//\[6+(3*3)] - истина
//{a}\[+\]{(d*3)} - истина
//<{a}+{(d*3)}> - истина
//{a+]}{(d*3)} - ложь
public class task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        check_parentheses(str);
    }
    public static void check_parentheses(String s){
        Deque<Character> st = new LinkedList<>();
        String chars_open = "{([<";
        String chars_close = "})]>";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (chars_open.indexOf(arr[i])>=0) {
                st.addLast(arr[i]);
            }
            if (!st.isEmpty() && chars_close.indexOf(arr[i]) == chars_open.indexOf(st.peekLast())) {
                st.pollLast();
            }
            else if (chars_close.indexOf(arr[i])>=0 ){
                st.addLast(arr[i]);
            }
        }
        if (st.isEmpty()) System.out.println("Истина");
        else System.out.println("Ложь");
    }
}
