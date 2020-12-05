package experimento;

import java.text.DateFormat;
import java.util.*;

public class Experimento {
	public static void main(String[] args) {
		java.util.Date d = new Date();
		
		String dStr =java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
		
		//System.out.println(dStr);
		
		String[] str = new String[10];
		
		str[0] = "4 de dez. de 2020";
		
		
		for(var i = 0 ; i < str.length; i++) {
			if(str[i] == null) {
				str[i] = dStr;
				
			}
			System.out.println(str[i]);
		}
		
	}

}
