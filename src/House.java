import java.util.Arrays;

public class House {
    private int size;
    private String city;
    private String[] tenants;

    public House() {
    }

    public House(int size, String city, String[] tenants) {
        this.size = size;
        this.city = city;
        this.tenants = tenants;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    public void setTenants(String[] tenants){
        this.tenants = tenants;
    }

    public String[] getTenants(){
        return this.tenants;
    }

    @Override
    public String toString() {
        return "House{" +
                "size=" + size +
                ", city='" + city + '\'' +
                ", tenants=" + Arrays.toString(tenants) +
                '}';
    }
}
