public class Person {
    private String name;
    private int age;

    //public get method
    public String getName() {
        return name;
    }

    //Public set method
    public void setName(String name) {
        this.name = name;
    }

    //public get method
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public void write() {
        System.out.println("Person's Age is: " + this.age + " years old & name is: " + this.name);
    }

}
