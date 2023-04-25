import java.util.Random;

/**
 * Создание массива со случайной длиной от 4 до 5 и заполнение случайными числами от 0 до 9
 */
public class GenerateArray {
	public int [] generateArray() {
		Random random = new Random();
		int [] arr = new int[random.nextInt(2) + 4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
		}
		return arr;
	}
}
