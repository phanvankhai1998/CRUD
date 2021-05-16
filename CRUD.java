package KITS.BUOI4752021;

/**
 * CRUD
 * C: Create: new add, regist
 * Retreive: show, search
 * Update: change some value
 * Delete:
 * 
 * CRUD: handling data
 * @author KITS_006
 *
 */
public class CRUD {
	
	//field
	static int[] list;	// variable, array name
	static int seq = 0;	
	public static void main(String[] args) {
		list = new int[10];
		insert(30);	//Create [0] -> 1
		insert(2);	//Create [1] -> 2
		insert(24);	//Create [2] -> 3
		showList();	//Retrieve
	}
	
	//RETRIEVE
	private static void showList() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i< list.length; i++) {
			System.out.println("Index thứ: " + i + ": " + list[i]);
		}
	}

	/***
	 *	Khi insert thực thi thì hàm main ở trạng thái wait
	 *	 
	 */
	//CREATE
	private static void insert(int arg) {
		// TODO Auto-generated method stub
		// add arg into list array
		// local variable be reset
		//list[seq] = arg;		//use index of element
		//seq += 1;
		/**
		 * ERROR	: NPE
		 * Exception in thread "main" java.lang.NullPointerException
		 *	at Java6721.CRUD.insert(CRUD.java:31)
		 *	at Java6721.CRUD.main(CRUD.java:20)
		 ***********************************NOTE************************
		 */
		
		//Check NPE
		if(list == null) {
			System.out.println("Can't insert");
			return;
		}
		//check index of bounds
		if(seq < list.length) {
			list[seq] = arg;	//use index of element
			seq += 1;			//autoincre
		}else {
			System.out.println("List full");
		}
	}
	
	
}
