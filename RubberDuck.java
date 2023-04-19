package mod;
class RubberDuck extends Duck implements Quackable {
    public void display() {
        System.out.println("I'm a rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {

    }

}


