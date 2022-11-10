public class Main {
    public static void main(String[] args) {
        //Задание 2
        int save = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++){
            sum = sum + sum/100;
            sum = sum + save;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum + " рублей");
        }
    }
}