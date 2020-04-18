package modal.servicios;

public class CalculoServicio implements InterfaceServicio {
   //--Definimos la variables de Calculo--//
   private static final double valorFijo = 0.020;
   private static final double valorPorMes = 0.01; 
   
   //--Sobre Escribimos Metodo tasaFija() da Interface InterfaceServicio--//
   //--Para establecer una Regla de Negocios de pago fijo               --//
   @Override
   public double tasaFija(double monto) {
      return (monto * valorFijo);	   
   } 

   //--Sobre Escribimos Metodo interesPorMes() da Interface InterfaceServicio--//
   //--Para establecer una Regla de Negocios de pago por Mes        --//
   @Override 
   public double interesPorMeses(double monto, int meses) {
	   return (monto * valorPorMes) * meses ;
   }
  
   
}
