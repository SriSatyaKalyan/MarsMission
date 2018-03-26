import javax.xml.crypto.dom.DOMCryptoContext;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {
    ArrayList<Item> items = new ArrayList<Item>();
    ArrayList<String> itemsNames= new ArrayList<String>();
    ArrayList<Double> itemsWeight = new ArrayList<Double>();
    Item U1item = new Item();
    Item U2item = new Item();
    U1 u1 = new U1();
    U2 u2 = new U2();

    public ArrayList loadItems(String path) throws Exception{
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            //System.out.println(line);
            String[] parts = line.split("=");
            Item item = new Item();
            item.name = parts[0];
            item.weight = Double.parseDouble(parts[1]);
            //itemsNames.add(item.name);
            //itemsWeight.add(item.weight);
            items.add(item);
        }
//        System.out.println(items);
//        System.out.println(itemsNames);
//        System.out.println(itemsWeight);
//        System.out.println();

//        for(Item item : items) {
//            System.out.println(item.name + "              " + item.weight);
//            //System.out.println(item.weight);
//        }

        return items;
    }

//    public ArrayList loadU1(ArrayList<Item> items) {
//        ArrayList<U1> Rockets1 = new ArrayList<U1>();
//        for (int i = 0; i <= 4; i++) {
//            System.out.println(items.get(i).name + "  " + items.get(i).weight);
//            if (u1.canCarry(items.get(i))) {
//                u1.carry(items.get(i));
//            } else {
//                Rockets1.add(u1);
//                System.out.println(Rockets1.get(i));
//                i--;
//                U1 u1 = new U1();
//            }
//        }
//        System.out.print(Rockets1);
//        return Rockets1;
//    }

    public ArrayList loadU1(ArrayList<Item> items) {
        ArrayList<U1> Rockets1 = new ArrayList<U1>();
        //for (int i = 0; i <= 4; i++) {
        //System.out.println(items.get(i).name + "  " + items.get(i).weight);
        int i = 0;
        while (i <= items.size()){
        System.out.println(items.size() + "  " + i);
        System.out.println(items.get(i).name + "  " + items.get(i).weight);
            if (u1.canCarry(items.get(i))) {
                u1.carry(items.get(i));
                i++;
            } else {
                Rockets1.add(u1);
                System.out.println(Rockets1.get(i));
                i--;
                U1 u1 = new U1();
            }
        }
        System.out.print(Rockets1);
        return Rockets1;
    }

    public ArrayList loadU2(ArrayList<Item> items){
        ArrayList<U2> Rockets2 = new ArrayList<U2>();
        for(int i = 0; i <= items.size(); i++) {
            System.out.println(items.get(i).name + "  " + items.get(i).weight);
            if (u2.canCarry(items.get(i))){
                u2.carry(items.get(i));
            }else{
                Rockets2.add(u2);
                i--;
                U2 u2 = new U2();
            }
        }
        return Rockets2;
    }



    public void runSimulation1(ArrayList<U1> Rockets){
        double totalbudgetU1 = 0;
        for (int r = 0; r <= Rockets.size(); r++){
            System.out.println("The rocket about to be released is " + Rockets.get(r));
            if(Rockets.get(r).launchdecide() && Rockets.get(r).landdecide()){
                System.out.println("This rocket succeeded");
                totalbudgetU1 += Rockets.get(r).cost;
            }else{
                System.out.println("This rocket failed");
                r--;
                totalbudgetU1 += Rockets.get(r).cost;
            }
        }
    }

    public void runSimulation2(ArrayList<U2> Rockets){
        double totalbudgetU2 = 0;
        for (int r = 0; r <= Rockets.size(); r++){
            System.out.println("The rocket about to be released is " + Rockets.get(r));
            if(Rockets.get(r).launchdecide() && Rockets.get(r).landdecide()){
                System.out.println("This rocket succeeded");
                totalbudgetU2 += Rockets.get(r).cost;
            }else{
                System.out.println("This rocket failed");
                r--;
                totalbudgetU2 += Rockets.get(r).cost;

            }
        }
    }
}
















