package DataStructures.ComparatorAndComparator;

import java.util.Comparator;

/**
 * @author : Sudeep Narkar
 * @since : 1/23/2021, Sat, 10:05 AM
 **/

public class LaptopComapator implements Comparator<Laptop> {
    @Override
    public int compare(Laptop laptop1, Laptop laptop2) {
        if (laptop1.getProductId() > laptop2.getProductId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
