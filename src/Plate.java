public class Plate {
    private int food;

    public void setFood(int food) {this.food = food;}

    public int getFood() {return food;}

    public Plate(int food) {this.food = food;}

    public void info() {System.out.println("Остаток корма в тарелке = " + food);}

    public int addFood(int addAdd){
        food = food + addAdd;
        return addAdd;
    }

    public String toString(){
        return String.valueOf(food);
    }
}