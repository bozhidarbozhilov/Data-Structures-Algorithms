package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static int[] sort(int[] input){
        List<Integer>[] buckets = new List[10];

        // fill buckets ascending order based on most significant digit
        for (int i = 0; i < input.length; i++) {
            int hashedValue = hash(input[i]);
            if(buckets[hashedValue] == null){
                buckets[hashedValue] = new ArrayList<Integer>();
            }
            buckets[hashedValue].add(input[i]);
        }

        // sorting each bucket
        for (List<Integer> bucket:buckets){
            if(bucket!=null) Collections.sort(bucket);
        }

        // merging all buckets together into source array
        int j = 0;
        for(List<Integer> bucket:buckets){
            if(bucket != null){
                for (int i = 0; i < bucket.size(); i++) {
                    input[j++] = bucket.get(i);
                }
            }
        }
        return input;
    }

    private static int hash(Integer value){
        int valueLength = value.toString().length();
        return value / (int) Math.pow(10,valueLength  - 1);
    }
}
