package mathProblem;

public class pyramid {
    public static void main(String[] args) {
        for(int a=0;a<9;a++){
            for(int b=0;b<10-a;b++){
                System.out.println(" ");
            }
            for(int c=0;c<=a;c++){
                System.out.println(" *");
            }
            System.out.println();

        }


    }
}
