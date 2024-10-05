
package prueba.cuentabancaria;


public class datosbanco {
    String titular;
    int saldo;

    public datosbanco(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
   public void mostrarSaldo() {
        System.out.println(" Tu saldo es: " + saldo);
    } 
}
