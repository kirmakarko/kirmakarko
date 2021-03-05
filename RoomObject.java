import java.util.ArrayList;
import java.util.Objects;

public abstract class RoomObject implements  RoomObjectBehavior, ComponentBehavior {

    private int positionInRoom;
    private double capacity;
    private String nameObject;
    private ArrayList<Tongue> Tongues = new ArrayList<Tongue>() {};

    protected void addTongue(final int cost, final String inscription, final boolean position){
        Tongues.add(new Tongue(cost, inscription, position));
    }
    @Override
    public void display(){
        for (Tongue tongue : Tongues) {
            tongue.display();
        }
    }

    @Override
    public void hide(){
        for (Tongue tongue : Tongues) {
            tongue.hide();
        }
    }

    public Tongue getTongue(final int i){
        return Tongues.get(i);
    }

    @Override
    public void movingAnObject() {

    }

    @Override
    public void assembleObject() {

    }

    @Override
    public void disassembleObject() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomObject that = (RoomObject) o;
        return positionInRoom == that.positionInRoom &&
                Double.compare(that.capacity, capacity) == 0 &&
                Objects.equals(nameObject, that.nameObject) &&
                Objects.equals(Tongues, that.Tongues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionInRoom, capacity, nameObject, Tongues);
    }

    @Override
    public String toString() {
        return "RoomObject{" +
                "positionInRoom=" + positionInRoom +
                ", capacity=" + capacity +
                ", nameObject='" + nameObject + '\'' +
                ", Tongues=" + Tongues +
                '}';
    }


}
