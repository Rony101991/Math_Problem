package mathProblem;

public class Swape_Numbers_Without_Third_Variable {
    public static void main(String []args){
        int a=5;
        int b=15;
        a=a+b;//a=5+15=20;
        b=a-b;//b=20-15=5; because new value of a is 20
        a=a-b;//a=20-5=15; because new value of b is 15
        System.out.println("swape value of a="+a);
        System.out.println("swape value of b="+b);
    }
}
