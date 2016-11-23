package dia161116;

public class cimabaixo extends Jogo {
	
	public cimabaixo() {
        carta asespadas = new carta();
        asespadas.setPontuacao(1);
        asespadas.setNaipe(3);
        asespadas.setNome("As");
        
        baralho.add(asespadas);
        
        carta manilhaOuros = new carta(2, "7", 7);
        baralho.add(manilhaOuros);
        
        carta duqueCopas = new carta(1, "2", 2);
        baralho.add(duqueCopas);
    }
}
