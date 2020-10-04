package pe.unjfsc.daw.spring5.entity;

public class CERecria {

	private int idRecria;
	private String aliasRecria;
	private String natalidad;
	private String sexo;
	private int edad;
	private String etapaMacho;
	private String etapaHembra;
	private double peso;
	private double talla;
	private int estado;
	
	public CERecria() {}
	
	public CERecria( int _idRecria,String aliasRecria, String natalidad, String sexo, int edad,
                      String etapaMacho, String etapaHembra, double peso, double talla, int estado) {
		super();
		idRecria=_idRecria;
		this.aliasRecria=aliasRecria;
		this.natalidad=natalidad;
		this.sexo=sexo;
		this.edad=edad;
		this.etapaMacho=etapaMacho;
		this.etapaHembra=etapaHembra;
		this.peso=peso;
		this.talla=talla;
		this.estado=estado;
	}
	
	
	public int getIdRecria() {
		return idRecria;
	}
	public void setIdRecria(int idRecria) {
		this.idRecria = idRecria;
	}
	public String getAliasRecria() {
		return aliasRecria;
	}
	public void setAliasRecria(String aliasRecria) {
		this.aliasRecria = aliasRecria;
	}
	public String getNatalidad() {
		return natalidad;
	}
	public void setNatalidad(String natalidad) {
		this.natalidad = natalidad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEtapaMacho() {
		return etapaMacho;
	}
	public void setEtapaMacho(String etapaMacho) {
		this.etapaMacho = etapaMacho;
	}
	public String getEtapaHembra() {
		return etapaHembra;
	}
	public void setEtapaHembra(String etapaHembra) {
		this.etapaHembra = etapaHembra;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTalla() {
		return talla;
	}
	public void setTalla(double talla) {
		this.talla = talla;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CERecria [idRecria=");
		builder.append(idRecria);
		builder.append(", aliasRecria=");
		builder.append(aliasRecria);
		builder.append(", natalidad=");
		builder.append(natalidad);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", etapaMacho=");
		builder.append(etapaMacho);
		builder.append(", etapaHembra=");
		builder.append(etapaHembra);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", talla=");
		builder.append(talla);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
