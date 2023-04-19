package mod;
class MallardDuck extends Duck implements Quackable, Flyable {
    public void display() {
        System.out.println("I'm a mallard duck");
    }

    @Override
    public void quack() {

    }

    public void fly() {
        System.out.println("Flying...");
    }
}

