package generation.italy.shop;

public class Smartphone extends Prodotto {
	
	private String imei;
	private int memoria;
	
	public Smartphone(int codice, String nome, String marca, int prezzo, int iva,
					 String imei, int memoria) {

		super(codice, nome, marca, prezzo, iva);
		
		this.imei = imei;
		this.memoria = memoria;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		
		return "Smartphone:"
				+ "\n" + super.toString()
				+ "\nIMEI: " + getImei()
				+ "\nmemoria: " + getMemoria() + "GB";
	}
}
