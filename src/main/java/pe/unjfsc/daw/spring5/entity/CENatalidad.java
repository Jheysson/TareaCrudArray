package pe.unjfsc.daw.spring5.entity;

import java.time.LocalDate;

public class CENatalidad {
	private int cuia;
	private String sexo;
	private LocalDate fecha_nacimiento;
	private String genotipo;
	private double peso;
	private int cuiaGanado;
	private String observacion;
	private int estado;
	
	public CENatalidad() {
		
	}
	
	public CENatalidad(int cuia, String sexo, LocalDate fecha_nacimiento, String genotipo, double peso, int cuiaGanado, String observacion, int estado) {
		super();
		this.cuia = cuia;
		this.sexo = sexo;
		this.fecha_nacimiento =  fecha_nacimiento;
		this.genotipo = genotipo;
		this.peso = peso;
		this.cuiaGanado = cuiaGanado;
		this.observacion = observacion;
		this.estado = estado;
	}

	public int getCuia() {
		return cuia;
	}
	public void setCuia(int cuia) {
		this.cuia = cuia;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getGenotipo() {
		return genotipo;
	}
	public void setGenotipo(String genotipo) {
		this.genotipo = genotipo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getCuiaGanado() {
		return cuiaGanado;
	}
	public void setCuiaGanado(int cuiaGanado) {
		this.cuiaGanado = cuiaGanado;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
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
		builder.append("CENatalidad [cuia=");
		builder.append(cuia);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", fecha_nacimiento=");
		builder.append(fecha_nacimiento);
		builder.append(", genotipo=");
		builder.append(genotipo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", cuiaGanado=");
		builder.append(cuiaGanado);
		builder.append(", observacion=");
		builder.append(observacion);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}
	
}
