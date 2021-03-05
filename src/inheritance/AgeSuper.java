package inheritance;

class AgeSuper {
    int age;

    AgeSuper(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of age in super class is: " + age);
    }
}
