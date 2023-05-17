package q4;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha {
	private List<Carta> pilha = new ArrayList<Carta>();
	
	public void push(Carta t) {
		pilha.add(t);
		
	}
	public int size() {
		return pilha.size();
	}
	public boolean isEmpty() {
		return pilha.isEmpty();
	}
	
	public Carta pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return pilha.remove(size()-1);
	}
	public Carta top() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return pilha.get(size()-1);
	}
}