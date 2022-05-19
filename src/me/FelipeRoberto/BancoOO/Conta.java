package me.FelipeRoberto.BancoOO;

import java.lang.ref.Cleaner;

public abstract class Conta implements IConta{

  //ATRIBUTOS DAS CONTAS
    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;

    //CONST AGENCIA_PADRAO
  private static final int AGENCIA_PADRAO = 001;
  //NUMERADOR DAS CONTAS
  private static  int SEQUENCIAL = 1;

  //CONSTRUTOR DA CONTA
  public Conta(Cliente cliente){
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }
  
  //METODOS OBRIGATORIOS
  @Override
  public void Sacar(double valor) {
    saldo -= valor;
  }

  @Override
  public void Depositar(double valor) {
    saldo += valor;
  }

  @Override
  public void Transferir(double valor, IConta contadestino) {
    this.Sacar(valor);
    contadestino.Depositar(valor);
  }
    //Metodo Imprimir
    protected void ImprimirInfo(){
      System.out.println("Agencia: " + this.agencia);
      System.out.println("Numero: "+ this.numero);
      System.out.println("Saldo: "+ this.saldo);
      System.out.println("DONO: "+this.cliente.getNome());
    }

    //METODOS GET DOS ATRIBUTOS
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


}
