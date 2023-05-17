package q2;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha {
	private List<String> pilha = new ArrayList<>();

	public void push(String action) {
	        pilha.add(action);
	}
	
	public boolean isEmpty() {
        return pilha.isEmpty();
    }
	
	public void pop() {
		if (pilha.isEmpty()) {
			System.out.println("Não há ações para desfazer.");
			throw new EmptyStackException();
	    }

		int ultimo = pilha.size() - 1;
		String acaofinal = pilha.get(ultimo);
		pilha.remove(ultimo);
		System.out.println("Desfazendo ação: " + acaofinal);
	}

	public static void main(String[] args) {

	}

	    	

}
