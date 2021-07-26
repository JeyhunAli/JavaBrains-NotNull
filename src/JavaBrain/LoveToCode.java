package JavaBrain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoveToCode {


	public void reaD_MYBRAIN() {
		try {
			FileReader reader = new FileReader("javabrain.txt");
			int value = reader.read();
			while(value != -1) {
				System.out.print((char)value);
				value = reader.read();
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
