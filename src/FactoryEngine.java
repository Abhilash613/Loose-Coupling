public class FactoryEngine {
    public static Engine getEngine(String type){
        if (type.equalsIgnoreCase("Petrol")) {
            return new PetrolEngine();
        } else if (type.equalsIgnoreCase("Disel")) {
            return new DiselEngine();
        }else{
            throw new IllegalArgumentException("Invalid Engine Type");
        }
    }
}
