package funciones;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;


public class Ejercicio2 {

	public static List<Integer> Iterativo(Integer a, Integer b) {
		List<Integer> res = new ArrayList<>();
	    while (!(a < 2 || b < 2)) {
	        if (a > b) {
	        	res.add(0,a);
	            a %= b;
	            b -= 1;
	        } else {
	        	res.add(0,b);
	            a -= 2;
	            b /= 2;
	        }
	    }
	    res.add(0 , a * b);
	    return res;
	}

	
	public static List<Integer> NotacionFuncional(int a, int b) {
        return (a < 2 || b < 2)? List.of(a * b):(a > b)? 
        		Stream.concat(NotacionFuncional(a % b, b - 1).stream(), Stream.of(a)).collect(Collectors.toList()):
        			Stream.concat(NotacionFuncional(a - 2, b / 2).stream(), Stream.of(b)).collect(Collectors.toList());
    }
	
	
	public static List<Integer> RecursivaNF(int a, int b) {
		List<Integer> res = new ArrayList<>();
		if (a < 2 || b < 2) {
			res.add(0, a * b);
		} else if (a > b) {
			res = RecursivaNF(a % b, b - 1);
			res.add(a);
		} else {
			res = RecursivaNF(a - 2, b / 2);
			res.add(b);
		}
		return res;
	}
	
	
	public static List<Integer> RecursivaF(int a, int b) {
		List<Integer> res = new ArrayList<>();
		return RecursivaF(a, b, res);
	}
	
	
	public static List<Integer> RecursivaF(int a, int b, List<Integer> ac) {
		if (a < 2 || b < 2) {
			ac.add(0, a * b);
			return ac;
		} else if (a > b) {
			ac.add(0, a);
			return RecursivaF(a % b, b - 1, ac);

		} else {
			ac.add(0, b);
			return RecursivaF(a - 2, b / 2, ac);
		}
	}
	
	
}
