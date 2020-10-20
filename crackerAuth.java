package aula.excript04;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

@SuppressWarnings("unused")
public class crackerAuth{
	
	public static void main(String[] args) throws IOException, InterruptedException {

	
		StringBuilder password = new StringBuilder();
		Process discoverPassword;
		char[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
			     'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
			     'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
			     'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
			     '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		loop:
		for (int i1 = 0; i1 < c.length;i1++){
			password.append(c[i1]);
			for (int i2 = 0; i2 < c.length;i2++){
				password.append(c[i2]);
				for (int i3 = 0; i3 < c.length;i3++){
					password.append(c[i3]);
					for (int i4 = 0; i4 < c.length;i4++){
						password.append(c[i4]);
						for (int i5 = 0; i5 < c.length;i5++){
							password.append(c[i5]);
							for (int i6 = 0; i6 < c.length;i6++){
								password.append(c[i6]);
								Process executeProcess = Runtime.getRuntime().exec("C:/Users/cardo/Downloads/autenticador.exe administrador "+password); 
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