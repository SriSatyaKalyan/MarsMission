public class U2 extends Rocket {
    //static double cargocarried;
    static double cost = 120000000;
    //static double cargolimit = 29000;

    void U1(){
        rocketWeight = 18000;
        maxWeight = 29000;
    }
//
//    void U2(double cargocarried){
//        this.cargocarried = cargocarried;
//    }

    public boolean launchdecide(){
        double launchexplosion = (0.04)*(cargoWeight/ maxWeight);
        if (launchexplosion > 0.04){
            launch = false;
        }
        return launch;
    }

    public boolean landdecide(){
        double landexplosion = (0.08)*(cargoWeight / maxWeight);
        if (landexplosion > 0.08){
            land = false;
        }
        return land;
    }

}
