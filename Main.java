import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);

        Bed bed = new Bed();
        TV tv = new TV();

        Human human = null;
        Human human1 = null;
        try {
            human = new Human(14, "м", "Козлик");
        } catch (NameException e) {
            System.out.println(e.getMessage());
        }
        try{
            human1 = new Human(14, "м", null);
        } catch (NameException e) {
            System.out.println(e.getMessage());
        }

        bed.display();

        human.payItem(1, 1, bed);
        human.payItem(2,1, bed);
        human.payItem(3,2,bed);

//        try{
//            human.payItem(1,-1,tv);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        human.payItem(1,-1,tv);
        human.payItem(1,1,tv);

        human.lieOnBed(bed);
        human.getOutBed(bed);

        human.watchTv(tv);

    }
}
