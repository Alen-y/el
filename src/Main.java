import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> Person = new ArrayList<Person>();

        Person group1 = new Person();
        group1.setName("faker");
        group1.setId(1);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("faker", 2);
        Set<String> keySet = map.keySet();

        Person p1 = new Person("jack", 1);
        Person p2 = new Person("rose", 2);
        Person p3 = new Person("jack", 1);

        Iterator<Person> it = Person.iterator();

            while (it.hasNext())

                System.out.print(it.next());

            if (group1.equals(p2)) {
                System.out.println("p1.equals p2");
            }
            if (p1.equals(p3)) {
                System.out.println("p1.equals p3");
            }

        }

}