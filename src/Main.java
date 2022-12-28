public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1 ");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName +  firstName +  middleName;
        System.out.print( "ФИО сотрудника - " +  fullName);
    }
    public static void task2 () {
        System.out.println(" Задача 2 ");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName +  firstName +  middleName;
        String s = fullName;
        String s1 = s.toUpperCase();
        System.out.print( "ФИО сотрудника - " +  s1);
    }
    public static void task3() {
        System.out.println(" Задача 3 ");
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName +  firstName +  middleName ;
        String s = fullName.replace('ё', 'е');
        System.out.print( "ФИО сотрудника - " +  s);
    }
    }