import java.util.Arrays;

public class Cars {
    private String producer;
    private String model;
    private int price;
    private String[] someArray;
    private Engine engine;

    public Cars(){}

    public Cars(String producer, String model, int price, String[] someArray, int power, int weight){
        this.producer = producer;
        this.model = model;
        this.price = price;
        this.someArray = someArray;
        this.engine = new Engine(power,weight);
    }

    public Cars(String producer, String model, int price, String[] someArray, Engine engine){
        this.producer = producer;
        this.model = model;
        this.price = price;
        this.someArray = someArray;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", someArray=" + Arrays.toString(someArray) +
                ", engine=" + engine +
                '}';
    }
}
