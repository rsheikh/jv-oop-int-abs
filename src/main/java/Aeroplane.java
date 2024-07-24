public class Aeroplane extends Vehicle implements Flyable {

    @Override
    void move() {
        System.out.println("The aeroplane is on the move!!");
        fly();
    }

    @Override
    public void fly() {
        System.out.println("The plane is about to take off!");
    }
}
