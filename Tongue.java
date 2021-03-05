public class Tongue implements ComponentBehavior{

    private int cost;
    private Handle handle;
    private Inscription inscription;

    public  Tongue(final int cost, final String Inscription, final boolean position){
        this.cost = cost;
        handle = new Handle(position);
        inscription = new Inscription(Inscription);
    }

    //Тут добавил unchecked-исключение
    public void checkCost(final int inputMoney){
        if(inputMoney <= 0){
            throw new CostException("Отрицательное кол-во монет");
        } else if(inputMoney >= cost){
            System.out.println("Оплачено");
        } else {
            System.out.println("Не оплачено");
        }
    }

    @Override
    public void display() {
        inscription.flickers();
        inscription.display();
        handle.display();
        System.out.println("Стоимость " + cost);
    }

    @Override
    public void hide() {
        inscription.hide();
        handle.hide();
    }
}
