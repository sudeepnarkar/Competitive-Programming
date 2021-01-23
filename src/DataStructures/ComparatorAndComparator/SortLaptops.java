package DataStructures.ComparatorAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 1/23/2021, Sat, 9:58 AM
 **/

public class SortLaptops {

    public static void main(String[] args) {

        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Lenovo", 1, 1000));
        list.add(new Laptop("Dell", 2, 500));
        list.add(new Laptop("Samsung", 3, 800));

        System.out.println("Sorting using default sorting implemented by Comparable for price:");
        //Sorting using default sorting implemented by Comparable for price

        Collections.sort(list);

        for (Laptop laptop : list) {
            System.out.println(laptop);
        }

        System.out.println("Sorting using custom comparator for productId:");
        //Sorting using custom comparator for productId

        Collections.sort(list, new LaptopComapator());


        for (Laptop laptop : list) {
            System.out.println(laptop);
        }

        System.out.println("Sorting using custom comparator for brand:");
        //Sorting using custom comparator for productId

        Collections.sort(list, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop laptop1, Laptop laptop2) {
                if (laptop1.getBrand().compareTo(laptop2.getBrand()) > 1) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        for (Laptop laptop : list) {
            System.out.println(laptop);
        }
    }
}
