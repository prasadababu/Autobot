import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Listtest {

    public static void main(String args[]) {
        System.out.println();
        System.out.println();
        System.out.println();

        LinkedList<String> list = new LinkedList<String>();

        list.add("Yellow");
        list.add("Blue");
        list.add("white");
        list.offerFirst("PPPPPP");

        try {
            System.out.println(list.get(5));
        } catch (Exception e) {
            System.out.println(e);        }
        

        // Iterator<String> p=list.iterator();

        // while (p.hasNext()) {
        // System.out.println(p.next());
        // }

    }

}