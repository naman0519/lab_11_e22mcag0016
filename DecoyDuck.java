package mod;

class DecoyDuck extends Duck implements Quackable, Flyable {
    public void display() {
        System.out.println("I'm a decoy duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack ");
    }

    public void fly() {
        System.out.println("Flying...");
    }
}

