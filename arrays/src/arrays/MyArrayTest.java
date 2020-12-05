package arrays;

public class MyArrayTest {
	public static void main(String[] args) {
		String[] carros = new String[10];
		
		var car = "Fusca";
		
		
		for(var i = 0; i < carros.length ; i++) {
			
			carros[i] = car;
			
			if(carros[i] != null) {
				System.out.println(carros[i]);
			}
		}
		
		
		
	}
	

}
