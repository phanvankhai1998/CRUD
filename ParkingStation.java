package KITS.BUOI4752021;

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
		//array pass, return
		int[] score = {10,30,21,40,70};		//local -> 
		showList(score);	//have to local array
		System.out.println(score);

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
