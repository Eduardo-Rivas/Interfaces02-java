package modal.entidades;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Contrato {
	private Integer nroContrato;
	private Date fecContrato;
	private Double mtoContrato;

	// --Instanciamos Lista de Parcelas --//
	// --Por que un Contrato tiene N Parcelas--//
	List<Parcela> listaParcelas = new ArrayList<Parcela>();
 
	// --Definimos el Constructor--//
	public Contrato(Integer nroContrato, Date fecContrato, Double mtoContrato) {
		this.nroContrato = nroContrato;
		this.fecContrato = fecContrato;
		this.mtoContrato = mtoContrato;
	}

	public Integer getNroContrato() {
		return nroContrato;
	}
	public void setNroContrato(Integer nroContrato) {
		this.nroContrato = nroContrato;
	}

	public Date getFecContrato() {
		return fecContrato;
	}
	public void setFecContrato(Date fecContrato) {
		this.fecContrato = fecContrato;
	} 

	public Double getMtoContrato() {
		return mtoContrato;
	}
	public void setMtoContrato(Double mtoContrato) {
		this.mtoContrato = mtoContrato;
	}

	public List<Parcela> getListaParcelas() {
		return listaParcelas;
	}
    
	//--Metodo Agregar Parcelas a la listaParcelas--//
	public void addParcela(Parcela parcela) {
		listaParcelas.add(parcela);
	}
	//--Metodo Agregar Parcelas a la listaParcelas--//
	public void eliminaParcela(Parcela parcela) {
		listaParcelas.remove(parcela);
	}

}
