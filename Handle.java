public class Handle implements ComponentBehavior {

    private boolean position;

    public Handle(final boolean position){
        this.position = position;
    }

    public Handle(){
        position = false;
    }


    public void changePosition(){
        position = !position;
    }

    public boolean getHandlePosition(){
        return position;
    }

    @Override
    public void display() {
        System.out.println("*Ручка отображается*");
    }

    @Override
    public void hide() {
        System.out.println("*Ручка скрывается*");
    }
}
