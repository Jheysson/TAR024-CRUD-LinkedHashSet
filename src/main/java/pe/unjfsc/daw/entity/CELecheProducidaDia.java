package pe.unjfsc.daw.entity;

public class CELecheProducidaDia {

	private int idLechProd;
	private double cantLitrLechProd;
	private String fechLechProd;
	private int vacaProducion;

	public CELecheProducidaDia(int _idLechProd, double _cantLitrLechProd, String _fechLechProd, int _vacaProducion) {
		super();
		this.idLechProd = _idLechProd;
		this.cantLitrLechProd = _cantLitrLechProd;
		this.fechLechProd = _fechLechProd;
		this.vacaProducion = _vacaProducion;
	}

	public CELecheProducidaDia() {

	}

	public int getIdLechProd() {
		return idLechProd;
	}

	public void setIdLechProd(int idLechProd) {
		this.idLechProd = idLechProd;
	}

	public double getCantLitrLechProd() {
		return cantLitrLechProd;
	}

	public void setCantLitrLechProd(double cantLitrLechProd) {
		this.cantLitrLechProd = cantLitrLechProd;
	}

	public String getFechLechProd() {
		return fechLechProd;
	}

	public void setFechLechProd(String fechLechProd) {
		this.fechLechProd = fechLechProd;
	}

	public int getVacaProducion() {
		return vacaProducion;
	}

	public void setVacaProducion(int vacaProducion) {
		this.vacaProducion = vacaProducion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CELecheProducidaDia [idLechProd=");
		builder.append(idLechProd);
		builder.append(", cantLitrLechProd=");
		builder.append(cantLitrLechProd);
		builder.append(", fechLechProd=");
		builder.append(fechLechProd);
		builder.append(", vacaProducion=");
		builder.append(vacaProducion);
		builder.append("]");
		return builder.toString();
	}

}
