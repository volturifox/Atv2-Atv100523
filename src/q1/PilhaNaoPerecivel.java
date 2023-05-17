package q1;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class PilhaNaoPerecivel {
	private List<Caminhao> pilha = new ArrayList<Caminhao>();
	
	public void push(Caminhao t) {
		pilha.add(t);
	}
	public int size() {
		return pilha.size();
	}
	public boolean isEmpty() {
		return pilha.isEmpty();
	}
	
	public Caminhao pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return pilha.remove(size()-1);
	}
	public Caminhao top() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return pilha.get(size()-1);
	}
}
