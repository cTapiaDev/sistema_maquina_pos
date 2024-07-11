package sistemapos;

public class TarjetaDeCredito {
    
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    
    public TarjetaDeCredito() {};
    
    public TarjetaDeCredito(
            String entidadBancaria,
            String numeroTarjeta,
            double saldo,
            EntidadFinanciera entidadFinanciera
    ) {
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
    };

    @Override
    public String toString() {
        return "TarjetaDeCredito{" 
                + "entidadBancaria=" + entidadBancaria 
                + ", numeroTarjeta=" + numeroTarjeta 
                + ", saldo=" + saldo 
                + '}';
    }
    
    
    
}
