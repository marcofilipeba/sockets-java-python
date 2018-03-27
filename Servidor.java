
import java.io.PrintWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Servidor {

	public static void main(String[] args) throws IOException {

		ServerSocket listener = new ServerSocket(65333);
		System.out.println("Servidor em execução na porta 65333");
		try {
			while (true) {
				Socket socket = listener.accept();
				System.out.println(socket.getRemoteSocketAddress().toString());
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println(new Date().toString());
				} finally {
					socket.close();
				}
			}
		}
		finally {
			listener.close();
		}

	}
}
