package mathProblem;

public class Find_Max_Min_Number {
    public static void main(String[]args){
        int a[]={10,25,26,24,28,45,97,102,10};
        int c;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
            System.out.println(a[i]);
        }
        System.out.println("Second largest number is :"+ a[1]);
    }
}
