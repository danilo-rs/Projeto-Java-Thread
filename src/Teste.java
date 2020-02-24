
public class Teste
{
	public static void main(String[] args)
	{
		ExibeMensagens tarefa1 = new ExibeMensagens("UTD");
		ExibeMensagens tarefa2 = new ExibeMensagens("Java");
		ExibeMensagens tarefa3 = new ExibeMensagens("MySQL");
		
		Thread thread1 = new Thread(tarefa1);
		Thread thread2 = new Thread(tarefa2);
		Thread thread3 = new Thread(tarefa3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
