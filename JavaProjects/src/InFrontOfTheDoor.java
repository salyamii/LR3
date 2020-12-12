public class InFrontOfTheDoor implements BirdsNoise, CarsNoise, Silence{
    InFrontOfTheDoor() {

    }

    public void makingNoise(Places place){
        if(place == Places.TOWN){
            car();
        }
        else if(place == Places.FOREST){
            bird();
        }
        else{
            silence();
        }
    }

    @Override
    public void bird() {
        System.out.println("Noise outside: *the babblement of birds* ");
    }

    @Override
    public void car() {
        System.out.println("Noise outside: *hum of passing automobiles* ");
    }

    @Override
    public void silence() {
        System.out.println(("Noise outside: *conciliative silence* "));
    }
}