package studies;

public class Kata0208 {

	public static void main(String[] args) {
		System.out.println(enough(20,5,5));
		
	}
	public static int enough(int cap, int on, int wait){
		  
		if (wait + on > cap) {
		
		return (wait+on)-cap;
		}
		else {
			return 0;
		}
	}
}