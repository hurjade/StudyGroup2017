package seunghyun;

public class app {
	public static void main(String[] args) {
		MyArrayList<Integer> myArr=new MyArrayList<>();
		
		myArr.add(1);
		myArr.add(2);
		myArr.add(3);
		myArr.add(4);
		myArr.add(5);
		myArr.add(6);
		myArr.add(7);
		myArr.add(8);
		myArr.add(9);
		myArr.add(10);
		myArr.add(11);
		System.out.println(myArr.get(9));
		System.out.println(myArr.get(10));
	}
}
