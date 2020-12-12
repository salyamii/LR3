public class BuildingWithTheDoor extends Building{
    private String styleOfBuilding;
    private BehindTheDoor behindTheDoor;
    private InFrontOfTheDoor inFrontOfTheDoor;
    public BuildingWithTheDoor(Places place, String styleOfBuilding){
        super(place);
        this.styleOfBuilding = styleOfBuilding;
    }
    public void setBehindTheDoor(BehindTheDoor b, BuildingWithTheDoor bu){
        bu.behindTheDoor = b;
    }
    public void setInFrontOfTheDoor(InFrontOfTheDoor i, BuildingWithTheDoor bu){
        bu.inFrontOfTheDoor = i;
    }
    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject)
            return true;
        if(otherObject == null)
            return false;
        if(getClass() != otherObject.getClass())
            return false;
        BuildingWithTheDoor other = (BuildingWithTheDoor) otherObject;
        return styleOfBuilding.equals(other.styleOfBuilding)
                && getPlace(this).equals(getPlace(other));
    }

    @Override
    public int hashCode() {
        return 7 * styleOfBuilding.hashCode() + 11 * getPlace(this).hashCode();
    }
}
