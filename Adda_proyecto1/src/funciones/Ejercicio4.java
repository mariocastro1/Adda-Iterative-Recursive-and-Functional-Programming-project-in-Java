package funciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio4 {

	
	public static String RecursivoSM(Integer a, Integer b) {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("a y b deben ser positivos");

		} else {
			if (a <= 4) {
				return a.toString() + "." + b.toString();
			} else if (b <= 4) {
				return b.toString() + "-" + a.toString();
			} else {
				return RecursivoSM(a / 2, b - 2) + "," + RecursivoSM(a - 2, b / 2) + ","
						+ RecursivoSM(a - 1, b - 1);
			}
		}
	}

	
	public static String RecursivoCM(Integer a, Integer b) {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("a y b deben ser positivos");
		}
		else {
			Map<String, String> ac = new HashMap<>();
			String key = a + "-" + b;
			if (ac.containsKey(key)) {
				return ac.get(key);
			}
			if (a<= 4) {
				return a + "." + b;
			}
			else if(b<=4) {
				return b + "-" + a;
			}
			String resultado = RecursivoCM(a/2,b-2) + "," + RecursivoCM(a-2, b/2) + "," 
					+ RecursivoCM(a-1, b-1);
			ac.put(key,resultado);
			return resultado;
		}
	}


	
	public static String IterativoI(Integer a, Integer b) {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("a y b deben ser positivos");
		}
		else {
			List<Integer> result = new ArrayList<>();
			String res = "";
			result.add(a);result.add(b);
			while (result.size() > 0) {
				a = result.get(0);b = result.get(1);
				result.remove(0);result.remove(0);
				if (a <= 4) {
					res += a + "." + b + ",";
				}
				else if (b <= 4){
					res += b + "-" + a + ",";
				}
				else {
					result.add(a/2);result.add(b-2);
					result.add(a-2);result.add(b/2);
					result.add(a-1);result.add(b-1);
				}
			}
			return res.substring(0, res.length() - 1);
		}
	}	

	
	
	
	
	
	
}
	
	
	


	
	
	

	
	

