import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Doorman p1 = new Doorman("Slowthai", Position.OUTSIDE);
        YoungLady p2 = new YoungLady("Alisa", false, Position.INSIDE);
        System.out.println(p1 + "\n" + p2);
        System.out.println("What type of building?"); // for comparing
        String type = in.nextLine();
        System.out.print("Choose the place for the building (1 - Forest, 2 - Town, 3 - Quiet place): ");
        int x = in.nextInt();
        Places place = null;
        if(x == 1){
            place = Places.FOREST;
        }
        else if(x == 2){
            place = Places.TOWN;
        }
        else if(x == 3){
            place = Places.QUIETPLACE;
        }
        else{
            System.out.println("Error");
            System.exit(0);
        }
        BuildingWithTheDoor b1 = new BuildingWithTheDoor(place, type);
        BuildingWithTheDoor b2 = new BuildingWithTheDoor(Places.QUIETPLACE, type);
        BehindTheDoor bd1 = new BehindTheDoor(Noises.CRACKANDRING);
        InFrontOfTheDoor ifd1 = new InFrontOfTheDoor();
        b1.setBehindTheDoor(bd1, b1);
        b1.setInFrontOfTheDoor(ifd1, b1);
        ifd1.makingNoise(b1.getPlace(b1));
        bd1.makingNoises(bd1);
        p2.knock(p2);
        p1.answer(p2);
        System.out.println("b1.equal(b2): " + b1.equals(b2));
        System.out.println("Hashcode of b1: " + b1.hashCode());
    }
}

