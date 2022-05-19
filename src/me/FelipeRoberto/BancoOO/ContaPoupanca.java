package me.FelipeRoberto.BancoOO;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("CONTA POUPANÇA");
        super.ImprimirInfo();
    }
}
