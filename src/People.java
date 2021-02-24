public class People {
    private String firstName;
    private String lastName;
    private int age;
    private boolean child;

    public People(){
    }

    public People(String firstName, String lastName, int age, boolean child){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.child = child;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setChild(boolean child) {
        this.child = child;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isChild() {
        return child;
    }

    @Override
    public String toString() {
        return "People{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", child=" + child +
                '}';
    }
}
