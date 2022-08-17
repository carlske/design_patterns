
public class DuckMock {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println("Empezamos la ejecución del programa");

    }
}