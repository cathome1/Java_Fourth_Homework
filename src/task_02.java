import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
public class task_02 {
    public static void main(String[] args) {
        Queue<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int sos = 1;
        while (sos!=0) {
            System.out.println("Состояние очереди");
            System.out.println(ll+"\n");
            System.out.println("Выберите тип операции: ");
            System.out.println("1) Поместить  элемент в конец очереди");
            System.out.println("2) Вернуть первый элемент из очереди и удалить его");
            System.out.println("3) Вернуть первый элемент из очереди, не удаляя.");
            System.out.println("\n0) Закрыть программу");
            int varik = sc.nextInt();
            switch (varik){
                case 1:
                    enqueue(ll);
                    break;
                case 2:
                    dequeue(ll);
                    break;
                case 3:
                    first(ll);
                    break;
                case 0:
                    sos = 0;
                    break;
                default:
                    System.out.println("Введен некорректный вариант, попробуйте снова");
                    break;
            }

        }
    }
    public static void enqueue(Queue<Integer> l){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число: ");
        int ch = scn.nextInt();
        l.add(ch);
    }
    public static void dequeue(Queue<Integer> l){
        System.out.println(l.poll());
    }
    public static void first(Queue<Integer> l){
        System.out.println(l.peek());
    }
}
