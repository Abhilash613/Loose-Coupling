public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    //    Engine engine=new PetrolEngine();
    //Here we are using but still the code is HardCodded
    public void drive(){
        engine.start();
        System.out.println("The car is on the driving stage");
    }
}
