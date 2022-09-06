
public class TransationClass {
    
    public long IDTRANS;
    public String date;
    public String detalles;
    public double debito;
    public double credito;
    public double SaldoDisponible;
    
    public TransationClass(long IDTRANS, String date, String detalles, double debito, double credito, double SaldoDisponible) {
        this.IDTRANS = IDTRANS;
        this.date = date;
        this.detalles = detalles;
        this.debito = debito;
        this.credito = credito;
        this.SaldoDisponible = SaldoDisponible;
    }

    public void imprimirtransaccion() {
        System.out.println("IDTRANS=" + IDTRANS + "\ndate=" + date + "\ndetalles=" + detalles + "\ndebito=" + debito + "\ncredito=" + credito + "\nSaldoDisponible=" + SaldoDisponible);
    }
    
    
    
}
