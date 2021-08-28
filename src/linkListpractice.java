import java.util.Iterator;
import java.util.LinkedList;

public class linkListpractice {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<String>();
//        System.out.println(names.size());
        names.add("Mercury");
        names.add("Venus");
        names.add("Earth");
        names.add("Mars");
        names.add("Jupiter");
        names.add("Saturn");
        names.add("Uranus");
        names.add("Neptune");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.get(5));
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }
        names.add(8, "Pluto");
        System.out.println(names);

        names.remove(8);
        System.out.println(names);


    }
}
