package funciones;

public class Ejercicio1 {


	public static String Iterativo(Integer varA, Integer varB) {
		EnteroCadena elem = EnteroCadena.of(varA, "A");
		String res = "A";
		while (elem.a() + 3 < varB) {
			EnteroCadena newElem = EnteroCadena.of(elem.a() + 3, elem.a() % 2 == 0 ? elem.a() + "*" : elem.a() + "!");
			if (newElem.a() % 10 != 0) {
				res += "-" + newElem.s();
			}
			elem = EnteroCadena.of(newElem.a(), newElem.s());
		}
		return res;
	}

	
	public static String RecursivaF(Integer varA, Integer varB) {
		return RecursivaF(varA, varB, EnteroCadena.of(varA, "A"), "A");
	}

	
	public static String RecursivaF(Integer varA, Integer varB, EnteroCadena elem, String res) {
		if (elem.a() + 3 < varB) {
			EnteroCadena newElem = EnteroCadena.of(elem.a() + 3, elem.a() % 2 == 0 ? elem.a() + "*" : elem.a() + "!");
			if (newElem.a() % 10 != 0) {
				res += "-" + newElem.s();
			}
			res = RecursivaF(varA, varB, EnteroCadena.of(newElem.a(), newElem.s()), res);
		}
		return res;
	}

}