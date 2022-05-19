package me.FelipeRoberto.BancoOO;

public interface IConta {
    void Sacar(double valor);
    void Depositar(double valor);
    void Transferir(double valor, IConta contadestino);
    void ImprimirExtrato();
}
