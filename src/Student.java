public class Student {
    String name;
    int age;
    boolean isJunior;
    char gender;

    public Student(){
        name = " ";
        age = 0;
        isJunior = false;
        gender = 'm';
    }

    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Junior: " + isJunior);
        System.out.println("Gender: " + gender);
    }
}
