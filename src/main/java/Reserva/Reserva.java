package Reserva;

import cliente.Cliente;
import Faxineiro.Faxineiro;

import java.util.Date;

public class Reserva {
    private int numeroReserva;
    private Cliente cliente;
    private Faxineiro faxineiro;
    private Date data;
    private String hora;
    private double preco;
    private String servicoLimpeza;

    // Getters
    public int getNumeroReserva() {
        return this.numeroReserva;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Faxineiro getFaxineiro() {
        return this.faxineiro;
    }

    public Date getData() {
        return this.data;
    }

    public String getHora() {
        return this.hora;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getServicoLimpeza() {
        return this.servicoLimpeza;
    }

    // Setters
    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFaxineiro(Faxineiro faxineiro) {
        this.faxineiro = faxineiro;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setServicoLimpeza(String servicoLimpeza) {
        this.servicoLimpeza = servicoLimpeza;
    }

    public void reservarServico() {
        System.out.println("Serviço reservado para o cliente " + this.cliente.getNome() + " pelo faxineiro " + this.faxineiro.getNome() + " na data " + this.data + " às " + this.hora);
    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada para o cliente " + this.cliente.getNome() + " pelo faxineiro " + this.faxineiro.getNome());
    }
}
