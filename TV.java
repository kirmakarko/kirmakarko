public class TV extends RoomObject {

    private ConsolePanel consolePanel = new ConsolePanel("Пульт");

    public TV(){
        addTongue(1, "Телевизор", true);
    }

    private class ConsolePanel{

        private String name;

        private ConsolePanel(String name){
            this.name = name;
        }

    }
}
