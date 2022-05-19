package me.FelipeRoberto.BancoOO;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("EXTRATO CONTA CORRENTE");
        super.ImprimirInfo();
    }
}
