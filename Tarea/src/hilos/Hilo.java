package hilos;
public class Hilo implements Runnable
{
	private String nombre;
	
	public Hilo(String nombre)
	{
		this.nombre=nombre;
	}

	
	public void run()
	{
		
		for(int i=1;i<=8;i++)
		{
			if(nombre.equalsIgnoreCase("Hilo Uno"))
			{
				System.out.println(i+" "+ nombre +"---->" );
			}
			else if(nombre.equalsIgnoreCase("Hilo Dos"))
			{
				System.out.println(i+" "+ nombre +"<----" );
			}
			
			else
			{
				System.out.println(i+" "+ nombre +"-----" );
			}
			
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		
		}
		
	}
	

	
}
