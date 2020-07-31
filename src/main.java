public class main {
    public static void main(String[] args) {
        employee[] persArray = new employee[5];
        persArray[0] = new employee("Агнесса Басова", "Engineer", "itannylla-9489@yopmail.com", "892312312", 30000, 30);
        persArray[1] = new employee("Шарлотта Новакова", "Programmer", "ivuqoffoso-7835@yopmail.com", "892352321", 40000, 42);
        persArray[2] = new employee("Флорентий Щуров", "Director", "onaxazi-4864@yopmail.com", "892364523", 25000, 18);
        persArray[3] = new employee("Санан Мамедов", "Boss", "sanan@mail.ru", "896870080", 100000, 29);
        persArray[4] = new employee("Валерий Карницкий", "ExBoss", "ossizona-7963@yopmail.com", "892872982", 80000, 57);

        for (int i=0; i<persArray.length; i++){
            if(persArray[i].age > 40) {
                persArray[i].info();
            }
        }
    }
}
