package modal.servicios;

import modal.entidades.Contrato;
import modal.entidades.Parcela;

import java.util.Date;
import java.util.Calendar; 

public class ContratoServicio {
	// --Asociamos la Interface--//
	private InterfaceServicio intfServicio;

	public ContratoServicio(InterfaceServicio intfServicio) {
		this.intfServicio = intfServicio;
	}
    
	//--Metodo para Procesar los Contratos--//
	public void procesarContrato(Contrato contrato, int meses) {
		// --Definimos Variable para el monto Base--//
		double mtoBase = contrato.getMtoContrato() / meses;
 
		// --Ciclo For para recorrer los Meses de las Parcelas--//
		for (int n = 1; n <= meses; n++) {
			//--Para Obtener el Mes Siguiente--//
			Date fecMesSig = mesesSiguiente(contrato.getFecContrato(), n);
			
			//--Calculo de Interes por Mes--//
			double mtoIntPorMes = mtoBase + intfServicio.interesPorMeses(mtoBase, n);
			
			double mtoTotPar = mtoIntPorMes + intfServicio.tasaFija(mtoIntPorMes);
			
			//--Instancia al Constructor de Parcela con fecha y monto--//
			//--Y lo agrega a la listaParcelas                      --//n 
			contrato.addParcela(new Parcela(fecMesSig, mtoTotPar));
			
		}

	}

	//--Metodo para Sumar un Mes Siguiente--//
	private Date mesesSiguiente(Date fecha, int n) {
		//--Definimos un Obj. tipo Calandar e Instanciamos--//
		Calendar cal = Calendar.getInstance();
		
		//--Asignamos la Fecha del Contrato al Obj. (cal)--//
		cal.setTime(fecha);
		
		//--Le Sumamos a Esa Fecha n Meses--//
		cal.add(Calendar.MONTH, n);
		
		//--Tomamos y Retornamos la Fecha con Meses Sumados--//
		return cal.getTime();
	}

}
