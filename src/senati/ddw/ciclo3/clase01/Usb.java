package senati.ddw.ciclo3.clase01;

public class Usb {
	byte idusb=0;
	String marca="";
	float precio=0f;
	String color="";
	float capacidad=0;
	/**
	 * @param idusb
	 * @param marca
	 * @param precio
	 * @param color
	 * @param capacidad
	 */
	public Usb(byte idusb, String marca, float precio, String color, float capacidad) {
		super();
		this.idusb = idusb;
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.capacidad = capacidad;
	}
	
	/**
	 * 
	 */
	public Usb() {
		super();
	}

	public byte getIdusb() {
		return idusb;
	}
	public void setIdusb(byte idusb) {
		this.idusb = idusb;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}
	@Override
	public String toString() {
		return "Usb [idusb=" + idusb + ", marca=" + marca + ", precio=" + precio + ", color=" + color + ", capacidad="
				+ capacidad + "]";
	}
	
	
}
