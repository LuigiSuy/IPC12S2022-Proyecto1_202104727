
public class AcountClass {
    public int ID;
    public long CUIClient;
    public double Saldo;
    public TransationClass[] TransaccionesRealizadas;
    
    
    public AcountClass(int ID, long CuiClient, double Saldo){
        this.ID = ID;
        this.CUIClient = CuiClient;
        this.Saldo = Saldo;
        this.TransaccionesRealizadas = new TransationClass[20];
    }
    
    public void ImprimirCuenta(){
        System.out.println("CUI: " + this.CUIClient + "\nID: " + this.ID + "\nSaldo: " + this.Saldo );        
    }
    
}
