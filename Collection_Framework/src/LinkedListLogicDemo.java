
public class LinkedListLogicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListLogic<Integer> ls = new LinkedListLogic<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(80);
		System.out.println("before deletion");
		ls.display();
		ls.delete();
		System.out.println("after deletion");
		ls.display();
	}

}
