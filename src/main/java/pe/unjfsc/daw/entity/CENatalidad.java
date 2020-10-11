package pe.unjfsc.daw.entity;


public class CENatalidad {
	private int CUIA;
	private String fechNacimiento;
	private double peso;
	private String genotipo;
	private String sexo;
	private int CUIAmadre;
	private int CUIApadre;
	private String observacion;
	private int Estado;
	
	public CENatalidad() {
		
	}
	public CENatalidad(int CUIA, String fechNacimiento, double peso, String genotipo, String sexo, int CUIAmadre,int CUIApadre, String observacion, int estado) {
		super();
		this.CUIA = CUIA;
		this.fechNacimiento =  fechNacimiento;
		this.peso = peso;
		this.genotipo = genotipo;
		this.sexo = sexo;
		this.CUIAmadre = CUIAmadre;
		this.CUIApadre = CUIApadre;
		this.observacion = observacion;
		this.Estado = estado;
	}
	public int getCUIA() {
		return CUIA;
	}
	public void setCUIA(int cUIA) {
		CUIA = cUIA;
	}
	public String getFechNacimiento() {
		return fechNacimiento;
	}
	public void setFechNacimiento(String fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getGenotipo() {
		return genotipo;
	}
	public void setGenotipo(String genotipo) {
		this.genotipo = genotipo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getCUIAmadre() {
		return CUIAmadre;
	}
	public void setCUIAmadre(int cUIAmadre) {
		CUIAmadre = cUIAmadre;
	}
	public int getCUIApadre() {
		return CUIApadre;
	}
	public void setCUIApadre(int cUIApadre) {
		CUIApadre = cUIApadre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CENatalidad [CUIA=");
		builder.append(CUIA);
		builder.append(", fechNacimiento=");
		builder.append(fechNacimiento);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", genotipo=");
		builder.append(genotipo);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", CUIAmadre=");
		builder.append(CUIAmadre);
		builder.append(", CUIApadre=");
		builder.append(CUIApadre);
		builder.append(", observacion=");
		builder.append(observacion);
		builder.append(", Estado=");
		builder.append(Estado);
		builder.append("]");
		return builder.toString();
	}
	
}
