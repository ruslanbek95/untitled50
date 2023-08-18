import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        Random randomb = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(randomb.nextInt(0, 2));
            list.add(randomb.nextInt(0, 2));
            Collections.sort(list);
        }
        System.out.println(arrayList);
        System.out.println(list);
    }
}
