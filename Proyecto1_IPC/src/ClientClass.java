
public class ClientClass {
    public long CUI;
    public String Nombre;
    public String Apellido;    
    public AcountClass[] CuentasAsociadas;
    
    public ClientClass(long CUI, String Nombre, String Apellido) {
        this.CUI = CUI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.CuentasAsociadas = new AcountClass[5];
    }
    
    public void Imprimir() {
        System.out.println("CUI: " + this.CUI + "\nNombre: " + this.Nombre + "\nApellido: " + this.Apellido);
    }       
}
