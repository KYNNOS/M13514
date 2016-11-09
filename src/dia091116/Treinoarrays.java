package dia091116;

public class Treinoarrays {

	public Treinoarrays() {
		// TODO Auto-generated constructor stub
		//porto benfica
		//tipo de variavel []array nome variavel e tamanho variavel 
		int [] golos = new int [2];
		//atribuir variaveis ao array
		golos [0] = 1;
		golos [1] = 1;
		//instanciaçao com iniciaçao de variaveis
		int [] portobenfica = {1, 1};
		int [] sportarouca = {3, 0} ;
		int [] maritimobraga = {1, 0} ;
		
		int[][] jogosgrandes = new int[2][3];
		jogosgrandes[0][0] = portobenfica[0];
		jogosgrandes[1][0] = portobenfica[1];
		jogosgrandes[0][1] =  sportarouca[0];		
		jogosgrandes[1][1] =  sportarouca[1];
		jogosgrandes[0][2] =  maritimobraga[0];		
		jogosgrandes[1][2] =  maritimobraga[1];
		
		
         
         System.out.println("\n os resultados dos jogos sao: \n");
         for(int linha=0 ; linha < 3 ; linha++){
             for(int coluna = 0; coluna < 2 ; coluna ++){
                 System.out.printf("\t %d \t",jogosgrandes[coluna][linha]);
             }
             System.out.println();
         }
		
	}

}
