public class Doorman extends Person{
    private final Position p;

    Doorman(String name, Position p){
        super(name);
        this.p = p;
    }

    public void answer(YoungLady y){
        if(y.getKnock(y) && y.getPosition(y) == Position.OUTSIDE){
            System.out.println("Doorman: There is no point in knocking, because we're both outside and it's noisy inside.");
        }
        else if(y.getKnock(y) && y.getPosition(y) == Position.INSIDE){
            System.out.println("*Doorman hear the knock and opens the door*\n*Young lady went out*");
        }
        else{
            System.out.println("*Nothing happened*");
        }
    }
    @Override
    public String toString() {
        return "Doorman: " + getName();
    }
}