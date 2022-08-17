public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.print("I'm Mallard Duck");
    }

}
