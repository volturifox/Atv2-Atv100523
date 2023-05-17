package q4;

public class Carta {
	private String name;
	private String type;// ainda to em duvida mas acho que seria string mesmo
	private int cost;//blz custo de mana é inteiro
	private String effect;
	public Carta(String name, String type, int cost, String effect) {
		
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.effect = effect;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	
	
	
	
}
