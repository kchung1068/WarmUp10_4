/* Create a String array with the names of four of
 * your friends. Create a method that will be sent
 * the array and a name. The method will send back
 * true or false as to whether the name is in the array.
 * Then create another method that is sent the same
 * arguments, but this time returns the position of the
 * name in the array. If there is no name in the array,
 * return -1.
 */

public class WarmUp10_4 {
	static String[] names = {"Thomas", "Mary", "Billy", "Bella"};
	public static void main(String[] args) {
		System.out.println("Is Thomas in names? " + isInArray(names,"Thomas") );
		System.out.println("Hello");
		System.out.println("Is Ella in names? " + isInArray(names, "Ella"));
		System.out.println("Thomas is in position " + positionInArray(names,"Thomas") + " in names.");
		System.out.println("Ella is in position " + positionInArray(names,"Ella") + " in names.");
	}
	public static boolean isInArray(String[] names, String name) {
		for (int x = 0; x < names.length; x += 1) {
			if (names[x].equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;

	}
	public static int positionInArray(String[] names, String name) {
		int position = 0;
		for (int y = 0; y < names.length; y += 1) {
			if (names[y].equalsIgnoreCase(name)) {
				return y;
			}
		}
		return -1;
	}




}
