import java.util.ArrayList;
import java.util.List;
public class BakingCompetition {

    static List panel = new ArrayList<>();

    public static void main(String[] args) {
        Thread.currentThread().setName("BakingCompetetion");

        Thread t1=  new Thread(new Finalist(), "Finalist 1" );

        Thread t2=  new Thread(new Finalist(), "Finalist 2");
        Thread t3=    new Thread(new Finalist(), "Finalist 3");

        t1.start();
        t2.start();
        t3.start();
//        long endTime = System.currentTimeMillis() + 60000;
//        while (System.currentTimeMillis() < endTime){
//            System.out.println(System.currentTimeMillis());
//            System.out.println(endTime);
//            new Thread(new Voters(), "Voters "+j).start();
//            j++;
//        }


    }
}
