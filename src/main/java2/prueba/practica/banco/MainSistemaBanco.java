package prueba.practica.banco;

import java.util.Scanner;

public class MainSistemaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		String C1 = "85AB";
		boolean resultado;
		int opcion;

		do {
			System.out.println("Ingrese clave: ");
			String C2 = teclado.nextLine();
			resultado = C1.equals(C2);

			if (resultado == true) {
				do {
					System.out.println("#################################");
					System.out.println("BANCO PICHINCHA, elija una opción:");
					System.out.println("    1. Consultar pagos");
					System.out.println("    2. Realizar transferencia");
					System.out.println("    3. SALIR");
					opcion = teclado2.nextInt();
					if (opcion == 1) {
						System.out.println("No tiene ningun pago pendiente.");

					} else if (opcion == 2) {
						System.out.print("Ingrese cuenta de destino: ");
						String cuentaDestino = teclado.nextLine();
						System.out.print("Ingrese el monto a transferir: ");
						int monto = teclado2.nextInt();
						int saldo = 2500;
						int saldoTotal = saldo - monto;
						System.out.println("Su nuevo saldo es: $" + saldoTotal);

					}
				} while (opcion != 3);
				
			} else {
				System.out.println("CLAVE INCORRECTA");

			}

		} while (resultado != true);
	}

}
