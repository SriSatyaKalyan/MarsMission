public class U1 extends Rocket {
    //static double cargocarried;
    double cost = 100000000;
    double rocketWeight = 10000;
    double maxWeight = 18000;
    //static double cargolimit = 18000;

    void U1(){
        rocketWeight = 10000;
        maxWeight = 18000;
    }

//    void U1(double cargocarried){           //method please
//        this.cargocarried = cargocarried;
//    }

    public boolean canCarry(Item item) {
        System.out.println("Entered canCarry in U1.java");
        System.out.println("The rocketWeight is "+rocketWeight);
        System.out.println("The totalWeight is "+totalWeight);
        System.out.println("The itemWeight is "+item.weight);
        totalWeight += (item.weight);
        if (totalWeight >= maxWeight){
            return false;
        }else{
            return true;
        }
    }

    public void carry(Item item) {
        System.out.println("Entered carry");
        cargoWeight = totalWeight;
    }


    public boolean launchdecide(){
        double launchexplosion = (0.05)*(cargoWeight/ maxWeight);
        if (launchexplosion > 0.05){
            launch = false;
        }
        return launch;
    }

    public boolean landdecide(){
        double landexplosion = (0.01)*(cargoWeight/ maxWeight);
        if (landexplosion > 0.01){
            land = false;
        }
        return land;
    }

}
