package KITS.BUOI4752021;

public class ExArray001 {
	
	public static void main06(String[] args) {
		int[] list = {91,34,2,14,25,8,21,46,8,36};
		int[] copied = list;
		int[] copy = new int[list.length];

		System.out.println("List : " + list);		//OUT : List : [I@36baf30c
		System.out.println("Copied : " + copied);	//OUT : Copied : [I@36baf30c
		System.out.println("Copy : " + copy);		//OUT : Copy : [I@7a81197d
		
		// is different for Object Oriented Programming
		System.arraycopy(list, 0, copy, 0, copy.length);
		
		list[0] = 100;
		// copy == list
		String str  = "[";
		for(int i = 0; i < copy.length; i++) {
			str += copy[i];
			if(i < copy.length - 1) {
				str += ",";
			}
		}
		str += "]";
		System.out.print(str);
	}
	
	//Sắp xép mảng từ lớn đến nhỏ
		//selection sorting
		// 1. find max or mix
		// 2. swap
		//repeate up to all elements	
	public static void main05(String[] args) {
		int[] list = {91,34,2,14,25,8,21,46,8,36};
		
		//repeat all them
		for(int i = 0; i < list.length; i++) {
			int max = i;	//start index to search index of list
			//find max
			for(int k = i + 1; k < list.length; k++){
				if(list[max] < list[k]) {
					max = k;
				}
			}
			//swapping
			int temp = list[i];
			list[i] = list[max];
			list[max] = temp;
		}
		
		String str  = "[";
		for(int i = 0; i < list.length; i++) {
			str += list[i];
			if(i < list.length - 1) {
				str += ",";
			}
		}
		str += "]";
		System.out.print(str);
	}
	
	//SX max => min
	public static void main04(String[] args) {
		int[] list = {91,34,2,15,8,21,25};
		//list copy to sorted [0]Big -> []Small
		int[] sorted =  new int[list.length];
		System.out.print("Ta có list ban đầu là: ");
		for(int i = 0; i < sorted.length; i++) {
			System.out.print(" " + list[i]);
		}	
		//seq : index of sorted array
		for(int seq = 0; seq < sorted.length; seq++) {
			//index of max value
			int max = 0;	
			for(int i = 1; i < list.length; i++) {
				if(list[max] < list[i]) {
					max = i;	//index of array
				}
			}
			sorted[seq] = list[max];
			list[max] = 0;				// means remove
		}	

		System.out.print("\nList sau khi sắp xếp: ");
		String str = "[";
		for(int i=0; i < sorted.length; i++) {
			str += sorted[i];
			if(i < sorted.length -1) {
				str += ",";
			}
		}
		str += "]";
		System.out.println(str);	// once for high speed
	}
	
	public static void main03(String[] args) {
		//initialized array
		int[] list = {1,34,20,14,25};	
		
		//find max value and index
		int max_value = list[0];
		int max_index = 0;
		int min_value = list[0];
		int min_index = 0;
		
		//search for max
		System.out.println("Số pt trong mảng = "+list.length);
		System.out.print("Ta có list là:");
		
		for(int i = 0; i < list.length; i++) {
			if(max_value < list[i]) {
				max_index = i;
				max_value = list[i];
			}		
			if(min_value > list[i]) {
				min_index = i;
				min_value = list[i];
			}
			
			System.out.print(" " + list[i]);
		}

		System.out.println("\nPhần tử max nhất có index [" + max_index + "]: "+ max_value);
		System.out.println("Phần tử min nhất có index [" + min_index + "]: "+ min_value);
	}
	
	//last input , recently ? newest ? 
	/**
	 * [0] add 2021-0505
	 * [1] add 2021-0506
	 * [last] add 2021-0507
	 * 
	 * 
	 * @param args
	 */
	public static void main02(String[] args) {
		int[] score = new int[10];
		//use for statement, because has index(int type)
		int last = 0;	//index have to over 0  tức >=0
		
		//add(save)
		for(int i = 0; i< score.length; i++) {
			score[last] = i * 10 + 1;	//sample data no means
			last += 1;					//last is index of last added
		}
		
		//print out
		for(int i = 0; i < last; i++) {
			System.out.println(score[i]);
		}
		
		//ngược lại 10 -> 0: reverse
		for(int i = last - 1; i >= 0; i--) {
			System.out.println(score[i]);
		}
	}
	
	/**
	 * ---- Structure---------
	 * [elememt][element][][][][][][][][][] <- linear
	 * 
	 * all element's type is name
	 * 
	 * each element has index from 0 to length -1
	 * 
	 * length is 10, last index is 9
	 * 
	 * 		length is numbers of elements
	 * 
	 * ArrayIndexOutoBoundsException
	 * 
	 * 
	 * @author KITS_006
	 *
	 */	
	// 1. define int Array length 10 
			// int 10 cay
	public static void main(String[] args) {
		//int[] list = {12,32,14,31,21,1,3};
		
		int[] array_name = new int[10];	//is reference variable;
		int n = 0;						//is primitive variable;
		
		System.out.println(n);					//OUT: 0
		System.out.println(array_name);			//OUT: [I@36baf30c
		System.out.println(array_name.length);	//OUT: 10
//		OUT: [I@5d22bbb7 là reference value, 
//		'I' is 'Integer': DataType , 
//		'@' is 'at' , 
//		'5d22bbb7' is 'memory address'
// 		=> DataType@MemoryAddress
//		array_name. => 'dấu .' là tham chiếu tới địa chỉ I@36baf30c
		
		//ERROR
		//array_name[index of element]
		//array_name[ 12 ] = 1; //last index is (length - 1)
		/**	OUT:
		 * 	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		 * 	Index 12 out of bounds for length 10 at 
		 * coeding.java.com.ExArray001.main(ExArray001.java:14)
		 */
	}
}
