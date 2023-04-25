/**
 * Task_1:
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен разности элементов
 * двух входящих массивов в той же ячейке. Если длины массивов не равны,
 * необходимо как-то оповестить пользователя.
 * Task_2:
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен частному элементов двух
 * входящих массивов в той же ячейке. Если длины массивов не равны,
 * необходимо как-то оповестить пользователя.
 * Важно: При выполнении метода единственное исключение,
 * которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class Program {
	public static void main(String[] args) {
		// task1();
		task2();
	}

	/**
	 * Задание № 1
	 * Блок try
	 * Создаём два массива случайной длины от 4 до 5, заполняем их случайными числами
	 * от 0 до 9, после чего создаём новый массив result в который запишем результат выполнения
	 * экземпляра метода arraysDifference с нашими двумя массивами arr1 и arr2
	 * выводим в консоль массив arr1 и arr2, а затем результирующий массив.
	 * Блок catch
	 * Если массивы arr1 и arr2 имеют разную длину, то выводим CustomArraySizeException,
	 * который говорит нам, что массивы должны быть одинаковой длины и выводим в консоль длину
	 * каждого массива.
	 */
	static void task1(){
		try {
			int [] arr1 = new GenerateArray().generateArray();
			int [] arr2 = new GenerateArray().generateArray();
			int [] result = new ProcessArray().arraysDifference(arr1, arr2);
			for (int a1 : arr1) System.out.printf("%d\t", a1);
			System.out.println();
			for (int a2 : arr2) System.out.printf("%d\t", a2);
			System.out.println();
			System.out.println("Разница элементов двух массивов равна:");
			for (int i : result) System.out.printf("%d\t", i);
		} catch (ProcessArray.CustomArraySizeException e) {
			System.out.println(e.getMessage());
			System.out.printf(
					"Длина первого массива: %d\nДлина второго массива: %d\n",
					e.getLength1(), e.getLength2());
		}
	}

	/**
	 * Задание № 2 аналогично первому, только добавили CustomDivideException который отрабатывает
	 * при попытке деления на ноль.
	 */
	static void task2(){
		try {
			int [] arr1 = new GenerateArray().generateArray();
			int [] arr2 = new GenerateArray().generateArray();
			int [] result = new ProcessArray().arraysDivide(arr1, arr2);
			for (int a1 : arr1) System.out.printf("%d\t", a1);
			System.out.println();
			for (int a2 : arr2) System.out.printf("%d\t", a2);
			System.out.println();
			System.out.println("Частное элементов двух массивов равна:");
			for (int i : result) System.out.printf("%d\t", i);
		} catch (ProcessArray.CustomArraySizeException e) {
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
			System.out.printf(
					"Длина первого массива: %d\nДлина второго массива: %d\n",
					e.getLength1(), e.getLength2());
		} catch (ProcessArray.CustomDivideException e) {
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
			System.out.printf("Элемент по индексу %d равен нулю", e.getElement());
		}
	}
}
