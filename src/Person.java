package ListPeopleApp.src;

public class Person {
    private int id_;
    private String name;
    private String phone;
    private String email;
    private static int numberOfPeople = 0;

    // Empty Constructor
    public Person(){
        this.id_ = ++Person.numberOfPeople;
    }

    // Constructor with Data (Sobrecarga de constructores --> Hay más de dos constructores en la clase)
    public Person(String name, String phone, String email) {
        this(); // Se manda a llamar el constructor vacío (llamada explícita), también se podría no hacerlo y sería considerado una llamada implícita
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getId(){
        return this.id_;
    }
    public void setId(int id){
        this.id_ = id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + 
        "id=" + this.id_ +
        ", name='" + this.name + "'" +
        ", phone'" + this.phone + "'" +
        ", email'" + this.email + "\'" +
        "}" + super.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jorge Ramos", "12312412521", "jorge@mail.com");
        System.out.println(person1);
    }
}
