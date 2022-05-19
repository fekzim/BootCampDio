package me.FelipeRoberto.BancoOO;

public class Main {

    public static void main(String[] args){
        Cliente usuario = new Cliente();
        usuario.setNome("Usuario1");

        IConta cc = new ContaCorrente(usuario);
        IConta poupanca = new ContaPoupanca(usuario);


        cc.ImprimirExtrato();
        poupanca.ImprimirExtrato();
    }
}
