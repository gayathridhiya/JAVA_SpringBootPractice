import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.toArray());

        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for(Integer i  : arrayList){
            System.out.println(i);
        }

    }
}
