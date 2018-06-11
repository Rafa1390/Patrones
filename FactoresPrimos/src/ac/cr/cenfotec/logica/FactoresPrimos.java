package ac.cr.cenfotec.logica;

import java.util.ArrayList;

public class FactoresPrimos {

	public ArrayList<Integer> generate(int number) {
		int divisor = 2;
		
		ArrayList<Integer> listaPrimos = new ArrayList<Integer>();
		
		while(divisor <= number) {
			if((number % divisor) == 0) {
				number = number / divisor;
				listaPrimos.add(divisor);
			}else {
				divisor++;
			}
		};
		
		
		return listaPrimos;
	}
}
