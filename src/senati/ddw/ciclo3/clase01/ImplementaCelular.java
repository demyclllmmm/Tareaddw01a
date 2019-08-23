package senati.ddw.ciclo3.clase01;

public class ImplementaCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un objeto de la clase celular
		Celular Celular1 = new Celular();
		Celular1.idcelular=1;
		Celular1.modelo="Lenovo ToroMata 500";
		Celular1.precio=1500.0f;
		
		System.out.println(Celular1.toString());
		
		Celular Celular2 = new Celular();
		Celular2.idcelular=2;
		Celular2.modelo="Sansung Galaxi S5";
		Celular2.precio=2800.0f;
		
		System.out.println(Celular2.toString());
	}

}
