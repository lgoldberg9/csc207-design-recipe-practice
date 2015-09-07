import java.util.Arrays;


public class DesignRecipePractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"Peter", "Osera"};
		String str1 = "Michael";
		
		String[] arr2 = {};
		String str2 = "Michael";
		
		String[] arr3 = {"Peter"};
		String str3 = "Michael";
		
		String[] arr4 = null;
		String str4 = "Michael";
		
		String[] arr5 = {"Peter", "Osera"};
		String str5 = "";
		
		String[] arr6 = {"Peter", "Osera"};
		String str6 = null;
		
		String[] arr7 = {"Peter", "Osera", "Peter", "Osera"};
		String str7 = "Michael";
		
		String[] arr8 = null;
		String str8 = null;
		
		System.out.println("1: " + Arrays.toString(intersperse(arr1, str1)));
		System.out.println("2: " + Arrays.toString(intersperse(arr2, str2)));
		System.out.println("3: " + Arrays.toString(intersperse(arr3, str3)));
		System.out.println("4: " + Arrays.toString(intersperse(arr4, str4)));
		System.out.println("5: " + Arrays.toString(intersperse(arr5, str5)));
		System.out.println("6: " + Arrays.toString(intersperse(arr6, str6)));
		System.out.println("7: " + Arrays.toString(intersperse(arr7, str7)));
		System.out.println("8: " + Arrays.toString(intersperse(arr8, str8)));
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
