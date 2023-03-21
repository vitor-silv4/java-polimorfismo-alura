
public class TesteFuncionario {

	public static void main(String[] args) {
		 
		
		Gerente nico = new Gerente();
		nico.setNome("Nico");
		nico.setCpf("223-4");
		nico.setSalario(2600.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
