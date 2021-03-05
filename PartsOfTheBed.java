public enum PartsOfTheBed {

    SHEET("Простыня"),
    BLANKET("Одеяло"),
    PILLOW("Подушка");

    private String name;

    PartsOfTheBed(final String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
