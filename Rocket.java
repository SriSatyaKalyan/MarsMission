import java.util.ArrayList;

public class Rocket implements SpaceShip {
    //static ArrayList<Double> ItemsWeight = new ArrayList<Double>();
    //static ArrayList<Double> ItemsCarried = new ArrayList<Double>();
    static double rocketWeight;
    double maxWeight;
    double cargoWeight;
    double totalWeight = rocketWeight;

    boolean launch = true;
    boolean land = true;

    public boolean canCarry(Item item) {
        System.out.println("Entered canCarry in Rocket.java");
        return false;
    }
//        System.out.println("The rocketWeight is "+rocketWeight);
//        System.out.println("The totalWeight is "+totalWeight);
//        System.out.println("The itemWeight is "+item.weight);
//        totalWeight += (item.weight);
//        if (totalWeight >= maxWeight){
//            return false;
//        }else{
//            return true;
//        }
//    }
//
    public void carry(Item item) {
        System.out.println("Entered carry");
    }
//        System.out.println("Entered carry");
//        cargoWeight = totalWeight;
//    }
}