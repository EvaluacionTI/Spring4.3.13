package etg.bbva.evalua.spring.entidad;

public class CEMensaje {
	private Integer id;
	private String mensaje;
	
	public CEMensaje() {}
	
	public CEMensaje(Integer piValor, String psMensaje) {
		this.id = piValor;
		this.mensaje = psMensaje;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
