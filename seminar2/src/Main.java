import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        ex1();
        //ex2();
        //ex3();
        //ex4();
    }

    public static void ex1(){
        //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
        // вместо этого, необходимо повторно запросить у пользователя ввод данных.

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            float result = getFloatFromUser(bufferedReader);
            bufferedReader.close();
            System.out.println(result);
        }catch (IOException ex){
            System.out.println("Возникла ошибка при работе с файлом");
            return;
        }

    }

    public static void ex2(){
        //Если необходимо, исправьте данный код
        //        try {
        //            int d = 0;
        //            double catchedRes1 = intArray[8] / d;
        //            System.out.println("catchedRes1 = " + catchedRes1);
        //        } catch (ArithmeticException e) {
        //            System.out.println("Catching exception: " + e);
        //        }



        try {
             int d = 0;
             int[] intArray = new int[10];
             double catchedRes1 = intArray[8] / d;
             System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
             System.out.println("Catching exception: " + e);
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Catching exception: " + e);
         }

    }

    public static void ex3(){
        //Если необходимо, исправьте данный код
        //
        //        try {
        //            int a = 90;
        //            int b = 3;
        //            System.out.println(a / b);
        //            printSum(23, 234);
        //            int[] abc = { 1, 2 };
        //            abc[2] = 9;
        //        } catch (ArithmeticException ex) {
        //            System.out.println("Деление на ноль!");
        //        } catch (NullPointerException ex) {
        //            System.out.println("Указатель не может указывать на null!");
        //        } catch (ArrayIndexOutOfBoundsException ex) {
        //            System.out.println("Индекс массива выходит за пределы допустимого диапазона!");
        //        } catch (Exception ex) {
        //            System.out.println("Что-то пошло не так...");
        //        }

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }catch (ArithmeticException ex) {
            System.out.println("");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }catch (Exception ex) {
        System.out.println("Что-то пошло не так...");
        }
    }

    public static void ex4(){

        //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            boolean isContinue = true;
            while (isContinue){
                try {
                    System.out.println("Введите строку");
                    String text = getTextFromUser(bufferedReader);
                    System.out.println(text);
                    isContinue = false;
                }catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Возникла ошибка при работе с консолью");
        }

    }

    public static String getTextFromUser(BufferedReader bufferedReader) throws IOException{
        String text = bufferedReader.readLine();

        if (text.isEmpty()){
            throw new RuntimeException("Введена пустая строка");
        }

        return text;
    }

    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }

    public static float getFloatFromUser(BufferedReader bufferedReader){
        System.out.print("Введите число: ");
        float result;
        try {
            result = Float.parseFloat(bufferedReader.readLine());
        }catch (NumberFormatException e){
            System.out.println("Произошла ошибка при преобразовании введенного значения в число с плавающей точкой");
            return getFloatFromUser(bufferedReader);
        } catch (Exception e){
            System.out.println("Произошла ошибка при получении числа");
            return getFloatFromUser(bufferedReader);
        }

        return result;
    }

}