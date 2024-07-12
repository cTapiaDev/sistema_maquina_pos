package sistemapos;

public class PointOfSale {
    
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_COUNT_CUOTAS = 1;
    public static final int MAX_COUNT_CUOTAS = 6;
    
    public Ticket realizarPago(
            TarjetaDeCredito tarjeta,
            double montoAPagar,
            int cantidadCuotas
    ) {
        // Monto Final a pagar, considerando el recargo por la cantidad de cuotas
        double montoFinal = montoAPagar + (montoAPagar * recargoPorCuotas(cantidadCuotas));
        
        Ticket nuevoTicket = null;
        
        if (tarjeta.tieneSaldoDisponible(montoFinal)) {
            double montoPorCuota = montoFinal / cantidadCuotas;
            tarjeta.descontar(montoPorCuota);
            String cliente = tarjeta.nombreTitular();
            
            nuevoTicket = new Ticket(
                    cliente, 
                    montoFinal, 
                    montoPorCuota
            );  
        }
        
        return nuevoTicket;
        
    }
    
    private double recargoPorCuotas(int cantidadCuotas) {
        return (cantidadCuotas - 1) * RECARGO_POR_CUOTA;
    }
    
}
