package com.company;

public class Main {

    public static void main(String[] args) {

        int[] nums = {23, 45, 1, 4, 567, 888, 888889, -765};
        int target = 567;
        int ans = linearsearch(nums, target);
        int ans2 = linearsearch2(nums, target);
        boolean ans3 = linearsearch3(nums, target);
        System.out.println(ans3);
        System.out.println(ans2);
        System.out.println(ans);


    }
    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }

        }
        // this line will execute if none of the above return statements
        //do not get executed
        return Integer.MAX_VALUE;//-1 is being replaced by Integer.MAX_VALUE to avoid confusion


    }
    //if the target is found this function is going to return the element itself
    static int linearsearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return element;
            }

        }
        // this line will execute if none of the above return statements
        //do not get executed
        return -1;


    }
    //this function is going to return true or false if the element is present or not
    static boolean linearsearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        //run a for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return true;
            }

        }
        // this line will execute if none of the above return statements
        //do not get executed
        return false;


    }
}
