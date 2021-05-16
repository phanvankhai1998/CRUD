package KITS.BUOI4752021;

import java.awt.List;
import java.util.Scanner;

/**
 * [(4433)][][][][][][][][][][][]
 * 
 * in
 * 
 * 	(4433)
 * 
 * out 
 * 
 * 	(4433)
 * 
 * in_time
 * out_time
 * price
 * +
 * 
 * tody's study
 * planning ParkingStationStation programming each team 
 * 
 * @param args
 */
public class ParkingStation {
	
	public static void main(String[] args) {
		//parking station (bike parking free)
		int[] station = new int[10];	//bike's number
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("cmd > ");
			String cmd = sc.nextLine();
			
			showList(station);
			
			if(cmd.equals("new")) {
				break;
			}
			
			if(cmd.equals("in")) {
				//find empty
				int idx = -1;
				for(int i = 0 ; i < station.length ; i++) {
					//search value 0 in array
					if(station[i] == 0) {
						idx = i;	//index of station, empty còn trống
						break;		//found empty
					}
					if(idx == -1) {
						System.out.println("Full station!!");
					}else {
						//chỗ còn trống //parking bike
						System.out.println("Parking bike ?");
						cmd = sc.nextLine();
						
						int bikeNumber = Integer.parseInt(cmd);//String '4433' -> int 4433
						station[idx] = bikeNumber;	//parked this bike
					}
				}
				
			}
			
			if(cmd.equals("out")) {
				System.out.println("Outgoing bike ?");
				cmd = sc.nextLine();
				
				int bikeNumber = Integer.parseInt(cmd);
				
				/**
				 * NOTE
				 */
				//find index
				int idx = -1;
				for(int i = 0; i < station.length; i++) {
					if(station[i] == bikeNumber) {
						idx = i;
						break;
					}
				}
				
				//clean
				if(idx != -1) {
					station[idx] = 0;	//xóa để trống chỗ đó be empty
				}else {
					//idx == -1
					System.out.println("Không có bike");
				}
				/**
				 * NOTE
				 */
			}
			
			if(cmd.equals("quit")) {
				break;
			}
			
			sc.close();
			System.out.println("Byee~~~~");
		}
	}
	
	public static void main02(String[] args) {
		//parking station (bike parking free)
		int[] station = new int[10];	//bike's number
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("cmd > ");
			String cmd = sc.nextLine();
			if(cmd.equals("quit")) {
				break;
			}
		}
		sc.close();
		System.out.println("Byee Byee Byee");
		/**
		 * OUT:
		 * 		cmd > in
				cmd > out
				cmd > quit
				Byee Byee Byee
		 */
	}
	
	//field
	public static void main01(String[] args) {
		//array pass, return
		int[] score = {10,30,21,40,70};		//local -> 
		showList(score);	//have to local array
		System.out.println(score);	
		
		int[] result = lessthan(score, 50);//return int[]
		System.out.println(result);
	}

	private static int[] lessthan(int[] list, int lt) {
		// TODO Auto-generated method stub
		//STEP1.  length ??????????????
		int size = 0;
		for(int i = 0 ; i < list.length; i++) {
			if(list[i] < lt) {
				size += 1;	//counting
			}
		}
		//STEP 2 copy to result
		int[] result = new int[size];
		int k = 0;
		for(int i = 0; i< list.length; i++) {
			if(list[i] < lt) {
				result[k] = list[i];//counting
				k+=1;
			}
		}
		return result;	//need length when new array
	}

	private static void showList(int[] score) {
		// TODO Auto-generated method stub
		String str = "[";
		for(int i = 0 ; i < score.length; i++) {
			str += score[i];
			if(i < score.length) {		//OUT: [0,0,0,0,0,0,0,0,0]
				str += ",";
			}
		}
		str += "]";
		System.out.println(str);	//once for high speed
		//đặt ngoài vòng for sẽ nhanh hơn
	}
}
