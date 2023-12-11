package Fatura;

import cliente.Cliente;
import ServicoLimpeza.ServicoLimpeza;

import java.util.Date;

public class Fatura {
    private int numeroFatura;
    private Date dataFatura;
    private double precoTotal;
    private Cliente cliente;
    private ServicoLimpeza servicoLimpeza;

    // Getters
    public int getNumeroFatura() {
        return this.numeroFatura;
    }

    public Date getDataFatura() {
        return this.dataFatura;
    }

    public double getPrecoTotal() {
        return this.precoTotal;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public ServicoLimpeza getServicoLimpeza() {
        return this.servicoLimpeza;
    }

    // Setters
    public void setNumeroFatura(int numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    public void setDataFatura(Date dataFatura) {
        this.dataFatura = dataFatura;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServicoLimpeza(ServicoLimpeza servicoLimpeza) {
        this.servicoLimpeza = servicoLimpeza;
    }

    public void emitirFatura() {
        System.out.println("Fatura emitida para o cliente " + this.cliente.getNome() + " para o serviço de limpeza " + this.servicoLimpeza.getTipoServico() + " no valor total de " + this.precoTotal);
    }

    public void receberPagamento() {
        System.out.println("Pagamento recebido para a fatura " + this.numeroFatura + " do cliente " + this.cliente.getNome());
    }
}

