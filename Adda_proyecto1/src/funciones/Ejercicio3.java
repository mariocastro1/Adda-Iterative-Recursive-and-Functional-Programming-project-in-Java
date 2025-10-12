package funciones;

import java.util.List;
import us.lsi.common.Files2;
import java.util.ArrayList;
import java.util.Iterator;


public class Ejercicio3 {

	public static List<String> Iterativa(String file1, String file2){
		List<String> resultado = new ArrayList<String>();
		Iterator<String> lineasFichero1 = Files2.linesFromFile(file1).iterator();
		Iterator<String> lineasFichero2 = Files2.linesFromFile(file2).iterator();
		
		while(lineasFichero1.hasNext() || lineasFichero2.hasNext()) {
			if (lineasFichero1.hasNext()) {
				resultado.add(lineasFichero1.next());
				if (lineasFichero1.hasNext()) {
					resultado.add(lineasFichero1.next());
				}
			}
			if (lineasFichero2.hasNext()) {
				resultado.add(lineasFichero2.next());
				if (lineasFichero2.hasNext()) {
					resultado.add(lineasFichero2.next());
				}
			}
		}
		return resultado;
	}
	
	
	public static List<String> Recursiva(String file1, String file2) {
        Iterator<String> lineasFichero1 = Files2.linesFromFile(file1).iterator();
        Iterator<String> lineasFichero2 = Files2.linesFromFile(file2).iterator();
        
        return Recursiva(lineasFichero1, lineasFichero2, new ArrayList<>());
    }
    
    private static List<String> Recursiva(Iterator<String> lineasFichero1, Iterator<String> lineasFichero2, List<String> resultado) {
        if (!lineasFichero1.hasNext() && !lineasFichero2.hasNext()) {
            return resultado;
        }
        
        if (lineasFichero1.hasNext()) {
            resultado.add(lineasFichero1.next());
            if (lineasFichero1.hasNext()) {
                resultado.add(lineasFichero1.next());
            }
        }
        
        if (lineasFichero2.hasNext()) {
            resultado.add(lineasFichero2.next());
            if (lineasFichero2.hasNext()) {
                resultado.add(lineasFichero2.next());
            }
        }
        
        return Recursiva(lineasFichero1, lineasFichero2, resultado);
    }
	
}
