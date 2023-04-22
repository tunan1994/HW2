public class Cat {
    private String name;
    private boolean satiety;
    private int appetite;

    public String getName() {return name;}

    public int getAppetite() {return appetite;}

    public boolean getSatiety() {return satiety;}

    public void setName(String name) {this.name = name;}

    public void setAppetite(int appetite) {this.appetite = appetite;}

    public void setSatiety(boolean satiety) {this.satiety = satiety;}

    public Cat(String name, int appetite) {
        this(name, appetite, false);
    }
    public Cat(String name, int appetite,boolean satiety ) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat() {
        System.out.println(name + " ест корм, еды достаточно");
    }

    public String toString(){
        return String.valueOf(name);
    }
}