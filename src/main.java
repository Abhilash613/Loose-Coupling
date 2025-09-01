public class main {
    public static void main(String[] args) {
        Engine engine=FactoryEngine.getEngine("Disel");
        Car car=new Car(engine);
        car.drive();

    }
}
