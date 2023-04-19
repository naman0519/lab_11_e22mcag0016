package mod;

class ReadHeadDuck extends Duck implements Flyable {
    public void display() {
        System.out.println("I'm a redhead duck");
    }

    @Override
    public void quack() {
        System.out.println("Quacking");
    }

    public void fly() {
        System.out.println("Flying...");
    }
}
