public class Main {
    public static void main(String[] args) {
        //Задание 1
        int save = 29000;
        int sum = 0;
        for (int i = 0; i <= 12; i++){
            sum = sum + save;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum + " рублей");
        }
    }
}