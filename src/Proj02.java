import java.util.Scanner;

public class Proj02 {
	public static void main(String[] arqs) {
		Scanner s;
		try {
			dividirValor(0);
		} catch (Exception e) {
			System.out.println("Divisao inv�lida"+e.getMessage());
		}finally {
			System.out.println("Fechando a Aplica��o...");
		}
	}

	private static void dividirValor(int valor) {
		int resultado = (10 / valor);
		System.out.print(resultado);

	}

}