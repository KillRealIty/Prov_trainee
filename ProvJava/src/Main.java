import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Привет, ");


        while (true){
            System.out.println("Какой алгоритм хотите выбрать?");
            System.out.println("Введите цифру 1, если со словом 'Привет'");
            System.out.println("Введите цифру 2, если сравнить с именем");
            System.out.println("Введите цифру 3, если с массивом");
            System.out.println("Введите цифру 0, если хотите выйте");

            int num = scanner.nextInt();
            if (num == 0){
                break;
            }

            switch (num){
                case 1:
                    System.out.println("Введите число: ");
                    int num1 = scanner.nextInt();
                    hello(num1);
                    break;
                case 2:
                    System.out.println("Введите имя: ");
                    String name = scanner.next();
                    name(name);
                    break;
                case 3:
                    System.out.println("Введите длинну массива: ");
                    int size = scanner.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
                    int array[] = new int[size]; // Создаём массив int размером в size

                    System.out.println(number_array(array, size));
                    System.out.println();
                    break;
            }


        }


    }
    public static void hello(int number){
        if(number > 7) {
            System.out.println("Привет");
            System.out.println();
        }else{
            System.out.println("Число не больше 7");
            System.out.println();
        }
    }

    public static void name(String name){
        String LowerName = name.toLowerCase();
        if(LowerName.equals("вячеслав")){
            System.out.println("Привет, Вячеслав");
            System.out.println();
        }
        else {
            System.out.println("Нет такого имени");
            System.out.println();
        }
    }

    public static ArrayList<Integer>  number_array(int [] Numbers, int size){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");

        Numbers = new int[size];
        for (int i = 0; i < size; i++ ){
            Numbers[i] = scanner.nextInt();
        }

        ArrayList <Integer> MultiplesOfThree = new ArrayList<Integer>();
        for (int Num : Numbers) {
            if ( Num % 3 == 0){
                MultiplesOfThree.add(Num);
            }
        }
        System.out.print("Элемнеты массива, кратные 3: ");
        return MultiplesOfThree;

    }

    public static ArrayList<Integer>  number_array1(int [] Numbers){    //метод без считывания с консоли
        ArrayList <Integer> MultiplesOfThree = new ArrayList<Integer>();
        for (int Num : Numbers) {
            if ( Num % 3 == 0){
                MultiplesOfThree.add(Num);
            }
        }
        return MultiplesOfThree;
    }
}
