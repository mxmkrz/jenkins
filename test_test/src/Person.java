public class Person {
    private String name;
    private int age;

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
