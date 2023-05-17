package q3;

public class Main {
	public static void main(String[] args) {
		Pilha pilhaNotas = new Pilha();
		//Eu ainda não entendi por qual motivo não consigo fazer a pilha de int
		// Enfim... String deu certo!
        pilhaNotas.push("Nota 1");
        pilhaNotas.push("Nota 2");
        pilhaNotas.push("Nota 3");
        pilhaNotas.push("Nota 4");
        pilhaNotas.push("Batata quente fervendo");
        //agora tem uma batata
        System.out.println("Notas na ordem inversa:");
        System.out.println(pilhaNotas.exibirNotas());
	}
}
