import java.util.*;
/*
Name: David Bruno
Start Date: 05/18/2019
File: p971.java
Solve Date: 05/18/2019
Runtime: 52ms
Memory: 37.2 MB
*/

/*
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
*/

class p997{
    public static int[] sortedSquares(int[] A) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i : A){
            list.add(i*i);
        }
        Collections.sort(list);

        if(list.isEmpty()){
            return new int[]{};
        }
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(A)));

        int[] B = {1,1,1,1,1,1,1};
        System.out.println(Arrays.toString(sortedSquares(B)));

        int[] C = {};
        System.out.println(Arrays.toString(sortedSquares(C)));

        
        
    }
}