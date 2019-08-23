package senati.ddw.ciclo3.clase01;

public class ImplementaUsb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usb Usb1 = new Usb();
		Usb1.idusb=001;
		Usb1.marca="Kinstong";
		Usb1.precio=12.0f;
		Usb1.color="Rosado";
		Usb1.capacidad=4f;
		
		System.out.println(Usb1.toString());
		
		Usb Usb2 = new Usb();
		Usb2.idusb=002;
		Usb2.marca="Lexar";
		Usb2.precio=28.0f;
		Usb2.color="Negro";
		Usb2.capacidad=12f;
		
		System.out.println(Usb2.toString());
	}

}
