public class employee {
    String name;
    String employed;
    String eMail;
    String phoneNumber;
    int salary;
    int age;

    public employee(String name, String employed, String eMail, String phoneNumber, int salary, int age) {
        this.name = name;
        this.employed = employed;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.printf("name %s employed %s eMail %s phoneNumber %s salary %d age %d\n", name, employed, eMail, phoneNumber, salary, age);

    }


}
