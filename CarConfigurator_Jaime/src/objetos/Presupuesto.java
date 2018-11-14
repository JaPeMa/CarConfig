package objetos;

public class Presupuesto {

	private String modelo;
	private String motor;
	private String accesorios;
	private String precioTotal;
	private String cliente;


	public Presupuesto( String modelo,String motor,String accesorios, String precioTotal,String cliente) {
		super();

		this.modelo = modelo;
		this.motor = motor;
		this.accesorios = accesorios;
		this.precioTotal = precioTotal;
		this.cliente =cliente;
	}



	public String getModelo() {
		return modelo;
	}

	public String getMotor() {
		return motor;
	}

	public String getAccesorios() {
		return accesorios;
	}

	public String getPrecioTotal() {
		return precioTotal;
	}
	public String getCliente() {
		return cliente;
	}
}
