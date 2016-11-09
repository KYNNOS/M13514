package dia091116;

public class Treinoarrays {

	public Treinoarrays() {
		// TODO Auto-generated constructor stub
		//porto benfica
		//tipo de variavel []array nome variavel e tamanho variavel 
		int [] golos = new int [2];
		int soma=0;
		float media=0;
		//atribuir variaveis ao array
		golos [0] = 1;
		golos [1] = 1;
		//instanciaçao com iniciaçao de variaveis
		int [] portobenfica = {1, 1};
		int [] sportarouca = {3, 0} ;
		int [] maritimobraga = {1, 0} ;
		int [] moreirensevitsetubal = {1, 2} ;
		int [] rioaveboavista = {1, 2} ;
		int [] feirensebelenenses = {0, 1} ;
		int [] pferreirachaves = {1, 1} ;
		int [] estoriltondela = {2, 0} ;
		int [] vguimaraesnacional = {2, 1} ;
		
		
		int[][] jogosgrandes = new int[2][9];
		jogosgrandes[0][0] = portobenfica[0];
		jogosgrandes[1][0] = portobenfica[1];
		jogosgrandes[0][1] =  sportarouca[0];		
		jogosgrandes[1][1] =  sportarouca[1];
		jogosgrandes[0][2] =  maritimobraga[0];		
		jogosgrandes[1][2] =  maritimobraga[1];
		jogosgrandes[0][3] =  moreirensevitsetubal[0];		
		jogosgrandes[1][3] =  moreirensevitsetubal[1];
		jogosgrandes[0][4] =  rioaveboavista[0];		
		jogosgrandes[1][4] =  rioaveboavista[1];
		jogosgrandes[0][5] =  feirensebelenenses[0];		
		jogosgrandes[1][5] =  feirensebelenenses[1];
		jogosgrandes[0][6] =  pferreirachaves[0];		
		jogosgrandes[1][6] =  pferreirachaves[1];
		jogosgrandes[0][7] =  estoriltondela[0];		
		jogosgrandes[1][7] =  estoriltondela[1];
		jogosgrandes[0][8] =  vguimaraesnacional[0];		
		jogosgrandes[1][8] =  vguimaraesnacional[1];
		
         
         System.out.println("\n os resultados dos jogos sao: \n");
         for(int linha=0 ; linha < 9 ; linha++){
             for(int coluna = 0; coluna < 2 ; coluna ++){
                 System.out.printf("\t %d \t",jogosgrandes[coluna][linha]);
             }
             System.out.println( "\n");
             
             
       			
       			
       		}
         for (int x = 0; x < 9; x++) {
    			soma+=jogosgrandes[0][x];
         }
         
          System.out.println("a soma é " + soma + "\n");
          System.out.println("a media dos jogos em casa é " + soma/jogosgrandes[0].length + "\n");
          
         
	}

}
