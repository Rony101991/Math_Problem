package mathProblem;

public class Make_Pyramid_If_Else_Loops {
    public static void main(String[]args){
        for(int i=1; i<=6;i++){
            for(int j=6; j>=1; j--){
                if(j>i){
                    System.out.print(" ");
                }else{
                    System.out.print(" *");
                }

            }
            System.out.println();

        }

    }
}
