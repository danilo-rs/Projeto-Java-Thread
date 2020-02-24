
public class ExibeMensagens implements Runnable
{
	private String msg;
	//Construtor
	public ExibeMensagens(String msg)
	{
		this.msg = msg;
	}
	
	public void run()
	{
		for	(int i=1; i<=100; i++)
		{
			System.out.println(i+" : "+this.msg);
			
			if(i % 10 == 0)
			{	
				try
				{
					Thread.sleep(10000);
				}
				catch(InterruptedException e){					
				}
			}
		}
	}
}
