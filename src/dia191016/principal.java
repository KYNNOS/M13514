package dia191016;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mensagem = "ola turma, de mensagem";
		System.out.println(mensagem);
		int agua = 40;
		int luz = 20;
		int gas = 20;
		int fibra = 60;
		
		//agua 	= 40;
		//luz 	= 20;
		//gas 	= 20;
		//fibra 	= 60;
		int despesas = agua + luz + gas + fibra;
		
		System.out.println("total = " + despesas);
	}

}
