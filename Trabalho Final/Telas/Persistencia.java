package Telas;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persistencia {
	public static void gravar(Object o, String nome)  {
		FileOutputStream f;
		ObjectOutputStream oS;
		try {
			f = new FileOutputStream(nome);
			oS = new ObjectOutputStream(f);
			oS.writeObject(o);
			
			oS.flush();
			oS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
