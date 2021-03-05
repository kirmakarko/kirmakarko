public class Bed extends RoomObject {

    public Bed(){
        addTongue(1, PartsOfTheBed.SHEET.getName(), true);
        addTongue(1, PartsOfTheBed.BLANKET.getName(), true);
        addTongue(2, PartsOfTheBed.PILLOW.getName(), true);
    }
}
