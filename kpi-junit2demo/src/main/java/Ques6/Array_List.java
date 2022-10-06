package Ques6;
import java.util.ArrayList;

public class Array_List {

	public int check() {
		// TODO Auto-generated method stub
		boolean b = true;
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		System.out.println("List1"+list1);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("d");
		list2.add("e");
		list2.add("f");
		list2.add("g");
		list2.add("p");
		System.out.println("List2"+list2);
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("h");
		list3.add("i");
		list3.add("u");
		list3.add("i");
		System.out.println("List3"+list3);
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("k");
		list4.add("d");
		System.out.println("List4"+list4);
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("l");
		list5.add("m");
		list5.add("d");
		list5.add("s");
		System.out.println("List5"+list5);
		list1.retainAll(list2);
		list1.retainAll(list3);

		list1.retainAll(list4);

		list1.retainAll(list5);
		System.out.println("common elements"+list2);
		int pos = list3.indexOf("i");
		return pos;
	}
	
	public static void main (String[] args) {
		Array_List a1 = new Array_List();
		a1.check();
	}
	public int check1() {
		return 2;
	}
}
