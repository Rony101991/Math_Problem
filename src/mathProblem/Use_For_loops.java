package mathProblem;

public class Use_For_loops {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7};
        int b=a[0];
        for(int x=0;x<a.length;x++){
            if(a[x]>b){
                b=a[x];
            }
        }
            System.out.println("largest number is :"+b);

    }
}
