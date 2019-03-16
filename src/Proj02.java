import java.util.Scanner;

public class Proj02 {
	public static void main(String[] arqs) {
		Scanner s;
		try {
			dividirValor(0);
		} catch (Exception e) {
			System.out.println("Divisao inválida"+e.getMessage());
		}finally {
			System.out.println("Fechando a Aplicação...");
		}
	}

	private static void dividirValor(int valor) {
		int resultado = (10 / valor);
		System.out.print(resultado);

	}

}