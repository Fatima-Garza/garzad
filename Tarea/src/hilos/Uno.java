package hilos;

public class Uno 
{
	public static void main(String[]Args)
	{
		Hilo nuevo = new Hilo("Hilo Uno");
		Thread Hilo = new Thread(nuevo);

		Hilo nuevo2 = new Hilo("Hilo Dos");
		Thread Hilo2 = new Thread(nuevo2);

		Hilo nuevo3 = new Hilo("Hilo Tres");
		Thread Hilo3 = new Thread(nuevo3);

		Hilo.start();
		Hilo2.start();
		Hilo3.start();

	}

}
