package mathProblem;

public class UseOfA {
    public static void main(String[] args) {


        String a[] = {"Saturday", "sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday,", "Sunday", "Monday" +
                 "Tuesday", "Wednesday", "Thursday", "Friday"};

        for(int x=0;x<=a.length;x++) {
            if (a[x] == "Monday") {
                continue;
            }

            System.out.println(a[x]);

        }
    }
}
