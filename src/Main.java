class Machine {
    protected String brand = "Samsung";
    public void wash() {
        System.out.println("Initiating Gentle-Wash Task");
    }
}
public class Main extends Machine {
    private String modelName = "Top Load Washing Machine";
    public static void main(String[] args) {

        Main washmachine = new Main();
        washmachine.wash();
        System.out.println(washmachine.brand + " - " + washmachine.modelName);
    }
}