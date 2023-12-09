package Emprego;

import cliente.Cliente;
import Faxineiro.Faxineiro;

import java.util.Date;

public class Emprego {
    private Cliente cliente;
    private Faxineiro faxineiro;
    private Date data;
    private double preco;

    // Getters
    public Cliente getCliente() {
        return this.cliente;
    }

    public Faxineiro getFaxineiro() {
        return this.faxineiro;
    }

    public Date getData() {
        return this.data;
    }

    public double getPreco() {
        return this.preco;
    }

    // Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFaxineiro(Faxineiro faxineiro) {
        this.faxineiro = faxineiro;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimirInformacoes() {
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Faxineiro: " + this.faxineiro.getNome());
        System.out.println("Data: " + this.data);
        System.out.println("Preço: " + this.preco);
    }
}
