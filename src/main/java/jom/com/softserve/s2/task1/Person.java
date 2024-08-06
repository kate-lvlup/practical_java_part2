package jom.com.softserve.s2.task1;

class Person {
    private int age;
    private String healthInfo;
    private String name;

    public Person(int age, String name, String healthInfo) {
        this.age = age;
        this.name = name;
        this.healthInfo = healthInfo;
    }

    public String getHealthStatus() {
        return name + " " + healthInfo;
    }
}