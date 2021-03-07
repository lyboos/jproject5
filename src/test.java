import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] listone = {"24/7", "multiTier", "B-to-B", "web-based"};
        String[] listtwo = {"empowered", "centric", "branded", "cooperative"};
        String[] listthree = {"process", "accommodate", "config", "plugins", "paradigm"};

        int onelen = listone.length;
        int twolen = listtwo.length;
        int threelen = listthree.length;


        int a = 0;
        while (true) {
            a = sc.nextInt();
            int rand1 = (int) (Math.random() * onelen);
            int rand2 = (int) (Math.random() * twolen);
            int rand3 = (int) (Math.random() * threelen);
            if (a == 0)
                break;
            String ly = listone[rand1] + " " + listtwo[rand2] + " " + listthree[rand3];
            System.out.println("What we need is " + ly);
        }
    }
}
