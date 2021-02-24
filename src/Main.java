public class Main {
    public static void main(String[] args) {
       // Cars
       String[] someArray = new String[2];
       someArray[0] = "kek";
       someArray[1] = "lol";
       Engine engine = new Engine();
       engine.setPower(2000);
       engine.setWeight(1000);

       Cars cars = new Cars("BMW", "I3", 2000, someArray, 100,200);
       Cars cars1 = new Cars("BMW", "I3", 2000, someArray, engine);

       System.out.println(cars);
       System.out.println(cars1);
       // Cars End
       // People
       People people = new People("Sergey", "Bakush", 29, false);

       System.out.println(people);
       // People End
       // House
       House house = new House();
       String[] Tenants = new String[2];

       Tenants[0] = people.getFirstName();
       Tenants[1] = people.getLastName();

       house.setCity("Lviv");
       house.setSize(200);
       house.setTenants(Tenants);

       System.out.println(house);
       // House End
    }
}
