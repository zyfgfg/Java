package ten.practise;

import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        TreeSet<Person> sc=new TreeSet<>();
        sc.add(new Person("sefrs","23"));
        sc.add(new Person("sffsg","24"));
        sc.add(new Person("rgeds","25"));
        sc.add(new Person("rgheh","26"));
        sc.add(new Person("erghe","27"));
        System.out.println(sc.equals(sc));
    }
}
