package senati.ddw.ciclo3.clase01;

public class Celular {
	byte idcelular=0;
	String modelo="";
	float precio=0f;
	/**
	 * @param idcelular
	 * @param modelo
	 * @param precio
	 */
	public Celular(byte idcelular, String modelo, float precio) {
		super();
		this.idcelular = idcelular;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	/**
	 * 
	 */
	public Celular() {
		super();
	}

	public byte getIdcelular() {
		return idcelular;
	}
	public void setIdcelular(byte idcelular) {
		this.idcelular = idcelular;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Celular [idcelular=" + idcelular + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	
}
