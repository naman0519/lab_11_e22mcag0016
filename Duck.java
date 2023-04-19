package mod;

abstract class Duck {
    Flyable flyBehaviour;

    public void swim() {
        System.out.println("Swimming...");
    }
    public  void Quack(){

    }
    public void setFlyBehaviour(Flyable flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public abstract void display();

    public abstract void quack();

    public abstract void fly();
}

