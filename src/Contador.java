
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);


		int parametroUm = terminal.nextInt();
		int parametroDois = terminal.nextInt();



		try {
                  
              contar(parametroUm, parametroDois);

		} catch (ParametroInvalidosException exception) {


			System.out.println(exception.getMessage());


		}
		
		terminal.close();

	}

	static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {


         if(parametroUm >= parametroDois) {
        	 
        	 throw  new  ParametroInvalidosException();
        	 
         }


		int contagem = parametroDois - parametroUm;
      
        for (int i = 1; i < contagem; i++) {
			System.out.println(contagem);
		} 
        
	}
	
	
	static class ParametroInvalidosException extends Exception{
		
		
		private static final long serialVersionUID = 1L;

		public ParametroInvalidosException() {
			super("O segundo parametro deve ser maior que o primeiro");
		}
		
		
	}
	
		
	

}