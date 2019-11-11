package ten.practise09;

import java.util.Comparator;

public class SortByPrice implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (((Book) o1).getPrice() > ((Book) o2).getPrice()) {
            return 1;
        }
        return 0;
    }

}

