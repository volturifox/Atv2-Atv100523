package q3;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha {
	private List<String> pilha = new ArrayList<>();

    public void push(String nota) {
        pilha.add(nota);
    }

    public int size() {
        return pilha.size();
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.remove(size() - 1);
    }

    public String top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.get(size() - 1);
    }

    public String exibirNotas() {
        if (isEmpty()) {
            return "Não tem notas";
        }

        String resultado = "";
        // me sinto bobo por não saber que dava pra usar i-- a essa altura do campeonato
        // mas yay! agora eu sei e usei!
        //eu vou postar isso no meu github secundário pra não passar vergonha
        for (int i = size() - 1; i >= 0; i--) {
            resultado += pilha.get(i) + "\n";
        }

        return resultado;
    }
}
