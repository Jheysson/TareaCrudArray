package pe.unjfsc.daw.spring5.entity;

public class CEGanadoVacuno {
	private int cuia;
	private String aliasGanadoVacuno;
	private String sexo;
	
	public CEGanadoVacuno() {
		
	}
	
	

	public CEGanadoVacuno(int cuia, String aliasGanadoVacuno, String sexo) {
		super();
		this.cuia = cuia;
		this.aliasGanadoVacuno = aliasGanadoVacuno;
		this.sexo = sexo;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEGanadoVacuno [cuia=");
		builder.append(cuia);
		builder.append(", aliasGanadoVacuno=");
		builder.append(aliasGanadoVacuno);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append("]");
		return builder.toString();
	}
	

	
}
