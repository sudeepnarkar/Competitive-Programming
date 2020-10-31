package DataStructures.HashMap;

import java.util.Arrays;

/**
 * @author : Sudeep Narkar
 * @since : 10/30/2020, Fri, 8:53 AM
 **/

public class HashMapByFixedSizedArray {

    static int[] arr = new int[1000000];

    int get(int key) {
        return arr[key];
    }

    void put(int key, int val) {
        arr[key] = val;
    }

    void remove(int key) {
        arr[key] = -1;
    }

    public static void main(String[] args) {
        Arrays.fill(arr, -1);
        HashMapByFixedSizedArray hashMapByFixedSizedArray = new HashMapByFixedSizedArray();
        hashMapByFixedSizedArray.put(1, 2);
        System.out.println(hashMapByFixedSizedArray.get(1));
        hashMapByFixedSizedArray.put(1, 4);
        System.out.println(hashMapByFixedSizedArray.get(1));
        hashMapByFixedSizedArray.put(11, 12);
        System.out.println(hashMapByFixedSizedArray.get(11));
        System.out.println(hashMapByFixedSizedArray.get(100));
    }
}
