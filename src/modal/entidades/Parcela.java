package modal.entidades;

//--Clases de Java--//
import java.util.Date;
import java.text.SimpleDateFormat; 

public class Parcela {
	private Date fecParcela;
	private Double mtoParcela;

	// --Instanciamos Fromato de Fecha--//
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// --Definimos el Constructor--//
	public Parcela(Date fecParcela, Double mtoParcela) {
		this.fecParcela = fecParcela;
		this.mtoParcela = mtoParcela;
	}

	public Date getFecParcela() {
		return fecParcela;
	}

	public void setFecParcela(Date fecParcela) {
		this.fecParcela = fecParcela;
	}

	public Double getMtoParcela() {
		return mtoParcela;
	}

	public void setMtoParcela(Double mtoParcela) {
		this.mtoParcela = mtoParcela;
	}

	//--Sobre Escribimos el metodo toString--//
	@Override
	public String toString()
	{
		return sdf.format(fecParcela)
			   +" *-* "
			   +String.format("%.2f", mtoParcela);
	}
	

}
