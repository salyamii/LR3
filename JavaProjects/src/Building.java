public class Building{
    private final Places place;
    public Building(Places place){
        this.place = place;
    }
    public Places getPlace (Building b){
        return b.place;
    }
}
