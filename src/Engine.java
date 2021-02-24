public class Engine{
    private int weight;
    private int power;

    public Engine(){

    }

    public Engine(int weight, int power){
        this.weight = weight;
        this.power = power;
    }

    public int getWeight(){
        return this.weight;
    }

    public int getPower(){
        return this.power;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setPower(int power){
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" + "weight=" + weight + ", power=" + power + '}';
    }
}
