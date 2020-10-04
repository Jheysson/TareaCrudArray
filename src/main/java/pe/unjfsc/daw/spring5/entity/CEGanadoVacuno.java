package pe.unjfsc.daw.spring5.entity;

import java.time.LocalDate;

public class CEGanadoVacuno {
	private int cuia;
	private String aliasGanadoVacuno;
	private LocalDate fecha_nacimiento;
	private String sexo;
	private int edad;
	private String Etapa;

	public CEGanadoVacuno() {
		
	}
	public CEGanadoVacuno(int cuia, String aliasGanadoVacuno, String sexo, LocalDate fecha_nacimiento, int edad, String Etapa) {
		super();
		this.cuia = cuia;
		this.aliasGanadoVacuno = aliasGanadoVacuno;
		this.sexo = sexo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.edad = edad;
		this.Etapa = Etapa;
	}
	public int getCuia() {
		return cuia;
	}
	public void setCuia(int cuia) {
		this.cuia = cuia;
	}
	public String getAliasGanadoVacuno() {
		return aliasGanadoVacuno;
	}
	public void setAliasGanadoVacuno(String aliasGanadoVacuno) {
		this.aliasGanadoVacuno = aliasGanadoVacuno;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
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
	public String getEtapa() {
		return Etapa;
	}
	public void setEtapa(String etapa) {
		Etapa = etapa;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEGanadoVacuno [cuia=");
		builder.append(cuia);
		builder.append(", aliasGanadoVacuno=");
		builder.append(aliasGanadoVacuno);
		builder.append(", fecha_nacimiento=");
		builder.append(fecha_nacimiento);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", Etapa=");
		builder.append(Etapa);
		builder.append("]");
		return builder.toString();
	}
		
}
