public class Conta{
    public int  numeroConta ;
    public String titular ;
    public double saldo;

    public Conta( ){

    }
    public Conta( int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public Conta( int numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;

    }

    public void Criaconta (int num, String tit) {
        numeroConta = num;
        titular = tit;
        saldo = 0.0;

    }

    public void Criaconta (int num, String tit, double depositoInicial)
    {
        numeroConta = num;
        titular = tit;
        depositar(depositoInicial);
    }

    public double depositar(double valor)
    {
        return saldo = saldo + valor;

    }

    public double sacar(double valor){
       return saldo = saldo - valor - 5;
    }

}