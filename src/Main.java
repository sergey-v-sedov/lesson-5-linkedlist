import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long startMills = System.currentTimeMillis();

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1, 3);

        list.addFirst(4);
        list.addLast(5);

        list.set(2, 6);

        int value = list.get(2);
        System.out.println(value);

        int first = list.getFirst();
        System.out.println(first);

        int last = list.getLast();
        System.out.println(last);

        list.remove(3);

        Integer firstValueLink = list.removeFirst();
        System.out.println(list);

        System.out.println(firstValueLink);
        System.out.println(firstValueLink);
        System.out.println(firstValueLink);

        long endMills = System.currentTimeMillis();

        System.out.println("Программа работала: " + (endMills - startMills));
    }
}