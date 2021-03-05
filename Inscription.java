public class Inscription implements ComponentBehavior{

    private String name;

    public Inscription(final String name){
        this.name = name;
    }

    public void flickers(){
        //мерцает
        name = name + " *Мерцает*";
    }

    public void doesNotFlickers(){
        //не мерцает
        name = name + " *Не мерцает*";
    }


    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public void hide() {
        System.out.println("скрываем надпись");
    }
}
