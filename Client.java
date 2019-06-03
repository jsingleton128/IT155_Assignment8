
public class Client {

	public static void main(String[] args) {

		int[] data = {11, -7, 3, 42, 3, 0, 14, 3 };
		
		ArrayIntList list = new ArrayIntList();
		
		for (int n : data) {
			list.add(n);
		}

		ArrayIntListIterator i = list.iterator();
		
	//	int product = 1;
		//while(i.hasNext()) {
			//int n = i.next();
			//if (n == 0) {
				//i.remove();
			//} else {
				//product *=n;
			//}
		//}
		
		System.out.println("list: " + list);
		i.replaceAll(3, 999);
		System.out.println("list now: " + list);
		
	}

}
