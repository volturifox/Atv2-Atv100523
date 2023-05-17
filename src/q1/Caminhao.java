package q1;

public class Caminhao {
	private String placa;
	private String motorista;
	private boolean cargaPerecivel;//True= Perecível(animais, condimentos)False= não perecível(notebook,areia)
	private int pesoTransportado;//int, pois quero o valor aproximado
	
	
	
	public Caminhao(String placa, String motorista, boolean cargaPerecivel, int pesoTransportado) {
		super();
		this.placa = placa;
		this.motorista = motorista;
		this.cargaPerecivel = cargaPerecivel;
		this.pesoTransportado = pesoTransportado;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMotorista() {
		return motorista;
	}
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	public boolean isCargaPerecivel() {
		return cargaPerecivel;
	}
	public void setCargaPerecivel(boolean cargaPerecivel) {
		this.cargaPerecivel = cargaPerecivel;
	}
	public int getPesoTransportado() {
		return pesoTransportado;
	}
	public void setPesoTransportado(int pesoTransportado) {
		this.pesoTransportado = pesoTransportado;
	}
	
	
	
	
	
	
	
	
	
}
