public class Main {
    public static void main(String[] args) {
        //task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф.И.О сотрудника - " + fullName);

        //task 2
        System.out.println("Данные Ф.И.О сотрудника для запонения отчёта = " + fullName.toUpperCase());

        //task 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Ф.И.О сотрудника - " + fullName);
        System.out.println("Данные Ф.И.О сотрудника для запонения отчёта = " + fullName.toUpperCase());
    }
}