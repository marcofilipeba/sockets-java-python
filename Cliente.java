import java.io.BufferedReader;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Cliente {

	public static void main(String[] args) throws IOException {
		String ipServidor = JOptionPane.showInputDialog(
			"Qual o IP do Servidor: ");
		Socket s = new Socket(ipServidor, 65333);

		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String resposta = input.readLine();

		JOptionPane.showMessageDialog(null, resposta);
		System.exit(0);
	}
}