public class Human {

    private int age;
    private String gender;
    private String name;

    Human(final int age, final String gender, final String name) throws NameException{
        this.age = age;
        this.gender = gender;
        this.name = name;
        if(this.name == null) throw new NameException("Пустое имя");
    }

    public void payItem(final int numberTongue, final int cost, final RoomObject roomObject){
        roomObject.getTongue(numberTongue - 1).checkCost(cost);
    }

    public void lieOnBed(final Bed bed){
        System.out.println("Лег на кровать\n*уснул*");
    }

    public void watchTv(final TV tv){
        System.out.println("смотрит телевизор");
    }

    public void getOutBed(final Bed bed){
        System.out.println("Встал с кровати");
        bed.hide();
    }
}
