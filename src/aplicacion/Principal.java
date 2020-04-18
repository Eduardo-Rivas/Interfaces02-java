package aplicacion;


//--Importe de clases de Java--//
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//--Importe de clases Nuestras--//
import modal.entidades.Contrato;
import modal.entidades.Parcela;
import modal.servicios.CalculoServicio;
import modal.servicios.ContratoServicio;

public class Principal {

	public static void main(String[] args) throws ParseException {
       Locale.setDefault(Locale.US);
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       
       //--Lectura por Consola--//
       Scanner sc = new Scanner(System.in);
       System.out.println("---Datos del Contrato---");
       System.out.print("Numero de Contrato :");
       int nroContrato = sc.nextInt();
       
       System.out.print("Fecha del Contrato(dd/mm/yyyy) :");
       Date fecha = sdf.parse(sc.next()); 
       
       System.out.print("Monto del Contrato :");
       double mtoContrato = sc.nextDouble();
       
       //--Instaciomos la Clase Contrato--//
       Contrato contrato = new Contrato(nroContrato, 
    		                            fecha, 
    		                            mtoContrato);
       
       System.out.print("Entre Nro. de Parcelas :");
       int nroParcelas = sc.nextInt();
        
       //--Instanciamos ServicioContraton y a CalculoServicio--//
       ContratoServicio contServic = new ContratoServicio(new CalculoServicio());

       //--Invocamos en Metodo procesarContrato con los parametros--//
       contServic.procesarContrato(contrato, nroParcelas); 
       
       System.out.println();
       System.out.println("---Lista de Parcelas a Pagar---");
       for(Parcela xParc : contrato.getListaParcelas() )
       {
          System.out.println(xParc);	   
       } 
       
       sc.close();
	}

}
