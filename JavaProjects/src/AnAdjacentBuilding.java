public class AnAdjacentBuilding extends Building{
    private String styleOfBuilding;
    private BehindTheDoor behindTheDoor;
    private InFrontOfTheDoor inFrontOfTheDoor;
    public AnAdjacentBuilding(Places place, String styleOfBuilding){
        super(place);
        this.styleOfBuilding = styleOfBuilding;
    }
    public void setBehindTheDoor(BehindTheDoor b, AnAdjacentBuilding a){
        a.behindTheDoor = b;
    }
    public void setInFrontOfTheDoor(InFrontOfTheDoor i, AnAdjacentBuilding a){
        a.inFrontOfTheDoor = i;
    }
}
