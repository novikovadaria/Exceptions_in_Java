/**
 * Проверка на совпадение длин массивов. Если один или оба ассива пустые, то выводим соответвующее
 * сообщение. Если длины не совпадают, то выводим соответвующеесообщение,
 * если совпадают, то продолжаем работу с массивами.
 */
public class ProcessArray {
	public int[] arraysDifference(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null) {
			throw new NullPointerException("Оба массива должны существовать.");
		}
		if (arr1.length != arr2.length) {
			throw new CustomArraySizeException("Кол-во элементов массива должно быть одинаково.",
			                                   arr1.length, arr2.length);
		}
		int[] result = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i] - arr2[i];
		}
		return result;
	}


	public int[] arraysDivide(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null) {
			throw new NullPointerException("Оба массива должны существовать.");
		}
		if (arr1.length != arr2.length) {
			throw new CustomArraySizeException("Кол-во элементов массива должно быть одинаково.",
			                                   arr1.length, arr2.length);
		}
		int[] result = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			if (arr2[i] == 0) {
				throw new CustomDivideException("Делить на ноль нинада !", i);
			}
			result[i] = arr1[i] / arr2[i];
		}
		return result;
	}

	


	class CustomArraySizeException extends RuntimeException {

		int length1;
		int length2;

		public int getLength1() {
			return length1;
		}

		public int getLength2() {
			return length2;
		}

		public CustomArraySizeException(String message, int length1, int length2) {
			super(message);
			this.length1 = length1;
			this.length2 = length2;
		}
	}

	class CustomDivideException extends ArithmeticException {
		int element;

		public int getElement () {
			return element;
		}

		public CustomDivideException(String message, int element) {
			super(message);
			this.element = element;
		}
	}
}
