package mathProblem;

import java.util.Arrays;

public class Find_Second_Largest_Number {
    public static void main(String[]args){
        int a[]={24,3,26,80,90,89,102,68};
        int b=a.length;
        Arrays.sort(a);
        System.out.println("secound largest number "+a[b-2]);
    }
}
