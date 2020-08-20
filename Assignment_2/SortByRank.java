package com.Assignment_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SortByRank {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 70, 8,9,2};

        System.out.println("Array before:");
        for(int el:arr){
            System.out.print(el+" ");
        }
        rankSort(arr);

        System.out.println("\nArray after assigning its rank: ");
        for(int el:arr){
            System.out.print(el+" ");
        }
    }
    private static void rankSort(int[] arr) {

        int [] temp = Arrays.copyOfRange(arr,0,arr.length);

        Arrays.sort(temp);
        // creating a map to assignning the rank
        Map<Integer,Integer> map = new HashMap<>();

        int rank =1;

        for(int i=0;i<temp.length;i++){
            int x = temp[i];

            if(map.get(x)==null){
                map.put(x,rank);
                rank++;
            }
        }

        System.out.println("\nElement"+"   Rank");
        if(!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while(it.hasNext()) {
                Map.Entry obj = (Map.Entry)it.next();

                System.out.println(obj.getKey()+"\t\t\t" +obj.getValue());
            }
        }

        // updating the rank in the array

        for(int i=0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
    }
}
