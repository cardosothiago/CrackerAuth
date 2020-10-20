package catolica.algoritmo1;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

@SuppressWarnings("unused")
public class crackerAuth{
	
	public static void main(String[] args) throws IOException, InterruptedException {

	
		StringBuilder password = new StringBuilder();
		Process discoverPassword;
		char[] character = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
			     'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
			     'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
			     'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
			     '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		loop:
		for (int position1 = 0; position1 < character.length;position1++){
			password.append(character[position1]);
			for (int position2 = 0; position2 < character.length;position2++){
				password.append(character[position2]);
				for (int position3 = 0; position3 < character.length;position3++){
					password.append(character[position3]);
					for (int position4 = 0; position4 < character.length;position4++){
						password.append(character[position4]);
						for (int position5 = 0; position5 < character.length;position5++){
							password.append(character[position5]);
							for (int position6 = 0; position6 < character.length;position6++){
								password.append(character[position6]);
								Process executeProcess = Runtime.getRuntime().exec("C:/Users/cardo/Downloads/autenticador.exe administrador " + password); 
								int callBack = executeProcess.waitFor();
								if(callBack == 0) {
									System.out.println("Acesso concedido");
									break loop;
								}else {
									System.out.println("Acesso negado");
								}
								password.deleteCharAt(5);
							}
							password.deleteCharAt(4);
						}
						password.deleteCharAt(3);
					}
					password.deleteCharAt(2);
				}
				password.deleteCharAt(1);
			}
			password.deleteCharAt(0);
		}
	}

}
