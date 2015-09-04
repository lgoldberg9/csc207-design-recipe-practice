import java.util.Arrays;


public class DesignRecipePractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"Peter", "Osera"};
		String[] arr2 = {"Peter", "Osera"};
		String[] arr3 = {"Peter", "Osera"};
		String[] arr4 = {"Peter", "Osera"};
		String[] arr5 = {"Peter", "Osera"};
		String[] arr6 = {"Peter", "Osera"};
		String[] arr7 = {"Peter", "Osera"};
		String[] arr8 = {"Peter", "Osera"};
		System.out.println(Arrays.toString(intersperse(arr, "Michael")));
	}

	private static String[] intersperse(String[] arr, String foo) {
		if (arr != null) {
			if (arr.length > 1) {
				int newLen = 2*arr.length - 1;
				String[] ret = new String[newLen];	
				for (int i = 0; i < newLen; i++) {
					if (i % 2 == 0) {
						ret[i] = arr[i/2];
					} else {
						ret[i] = foo;
					}
				}
				return ret;
			}
		}
		return arr;
	}

}
