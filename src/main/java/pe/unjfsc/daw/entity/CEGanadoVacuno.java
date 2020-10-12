package pe.unjfsc.daw.entity;

import java.time.LocalDate;

public class CEGanadoVacuno {
	private int cuia;
	private String aliasGanadoVacuno;
	private LocalDate fecha_nacimiento;
	private String sexo;
	private int edad;
	private String Etapa;
	private double peso;
	private double talla;
	private String estaActivo;
	private String estaAnim;
	private String genotipo;
	private String tipoGana;
	private String origen;
	private int cuiaPadre;
	private int cuiaMadre;

	public CEGanadoVacuno() {
		 
	}

	public CEGanadoVacuno(int cuia, String aliasGanadoVacuno, LocalDate fecha_nacimiento, String sexo, int edad,
			String etapa, double peso, double talla, String estaActivo, String estaAnim, String genotipo,
			String tipoGana, String origen, int cuiaPadre, int cuiaMadre) {
		super();
		this.cuia = cuia;
		this.aliasGanadoVacuno = aliasGanadoVacuno;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.edad = edad;
		Etapa = etapa;
		this.peso = peso;
		this.talla = talla;
		this.estaActivo = estaActivo;
		this.estaAnim = estaAnim;
		this.genotipo = genotipo;
		this.tipoGana = tipoGana;
		this.origen = origen;
		this.cuiaPadre = cuiaPadre;
		this.cuiaMadre = cuiaMadre;
	}
	
	

	public CEGanadoVacuno(int cuia, String aliasGanadoVacuno, LocalDate fecha_nacimiento, String sexo, double peso,
			double talla, String estaActivo, String estaAnim, String genotipo, String tipoGana, String origen,
			int cuiaPadre, int cuiaMadre) {
		super();
		this.cuia = cuia;
		this.aliasGanadoVacuno = aliasGanadoVacuno;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.peso = peso;
		this.talla = talla;
		this.estaActivo = estaActivo;
		this.estaAnim = estaAnim;
		this.genotipo = genotipo;
		this.tipoGana = tipoGana;
		this.origen = origen;
		this.cuiaPadre = cuiaPadre;
		this.cuiaMadre = cuiaMadre;
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

	public String getEstaActivo() {
		return estaActivo;
	}

	public void setEstaActivo(String estaActivo) {
		this.estaActivo = estaActivo;
	}

	public String getEstaAnim() {
		return estaAnim;
	}

	public void setEstaAnim(String estaAnim) {
		this.estaAnim = estaAnim;
	}

	public String getGenotipo() {
		return genotipo;
	}

	public void setGenotipo(String genotipo) {
		this.genotipo = genotipo;
	}

	public String getTipoGana() {
		return tipoGana;
	}

	public void setTipoGana(String tipoGana) {
		this.tipoGana = tipoGana;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getCuiaPadre() {
		return cuiaPadre;
	}

	public void setCuiaPadre(int cuiaPadre) {
		this.cuiaPadre = cuiaPadre;
	}

	public int getCuiaMadre() {
		return cuiaMadre;
	}

	public void setCuiaMadre(int cuiaMadre) {
		this.cuiaMadre = cuiaMadre;
	}

	@Override
	public String toString() {
		return "CEGanadoVacuno [cuia=" + cuia + ", aliasGanadoVacuno=" + aliasGanadoVacuno + ", fecha_nacimiento="
				+ fecha_nacimiento + ", sexo=" + sexo + ", edad=" + edad + ", Etapa=" + Etapa + ", peso=" + peso
				+ ", talla=" + talla + ", estaActivo=" + estaActivo + ", estaAnim=" + estaAnim + ", genotipo="
				+ genotipo + ", tipoGana=" + tipoGana + ", origen=" + origen + ", cuiaPadre=" + cuiaPadre
				+ ", cuiaMadre=" + cuiaMadre + "]";
	}
}
