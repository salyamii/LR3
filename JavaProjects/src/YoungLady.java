import javafx.geometry.Pos;

public class YoungLady extends Person{

    private Position p;
    private boolean k;

    public YoungLady(String name, boolean k, Position p){
        super(name);
        this.k = k;
        this.p = p;
    }
    public void knock(YoungLady y){
        if(!y.k && y.getPosition(y) == Position.OUTSIDE){
            System.out.println(getName() + " made a few steps to the door and knocked at the door.");
            y.k = true;
        }
        else if(!y.k && y.getPosition(y) == Position.INSIDE){
            System.out.println((getName() + " came through the crowd and knocked at the door."));
            y.k = true;
        }
        else{
            System.out.println(getName() + " knocks again...");
        }
    }
    public boolean getKnock(YoungLady y){
        return y.k;
    }
    public Position getPosition(YoungLady y){
        return y.p;
    }
    @Override
    public String toString(){
        return "Young lady: " + getName();
    }
}