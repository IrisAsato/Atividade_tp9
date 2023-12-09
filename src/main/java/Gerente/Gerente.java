package Gerente;

import java.util.ArrayList;
import java.util.List;

public class Gerente {
    private String nome;
    private String endereco;
    private String numeroDeTelefone;
    private String email;
    private String nomeCliente;
    private String trabalhoRealizado;
    private double valorTrabalho;
    private List compromissos;

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public String getTrabalhoRealizado() {
        return this.trabalhoRealizado;
    }

    public double getValorTrabalho() {
        return this.valorTrabalho;
    }

    public List getCompromissos() {
        return this.compromissos;
    }


    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCompromissos(List compromissos) {
        this.compromissos = compromissos;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setTrabalhoRealizado(String trabalhoRealizado) {
        this.trabalhoRealizado = trabalhoRealizado;
    }

    public void setValorTrabalho(double valorTrabalho) {
        this.valorTrabalho = valorTrabalho;
    }

    // Métodos
    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Número de telefone: " + this.numeroDeTelefone);
        System.out.println("Email: " + this.email);
    }

    public void gerarFatura() {
        System.out.println("Fatura:");
        System.out.println("Nome do cliente: " + this.nomeCliente);
        System.out.println("Trabalho realizado: " + this.trabalhoRealizado);
        System.out.println("Valor do trabalho: " + this.valorTrabalho);
    }

    public void adicionarCompromisso(List compromisso) {
        if (this.compromissos == null) {
            this.compromissos = new ArrayList<>();
        }
        this.compromissos.add(compromisso);
    }

    public String gerarAgenda() {
        StringBuilder agenda = new StringBuilder();
        agenda.append("Agenda:\n");

        for (Object compromisso : this.compromissos) {
            agenda.append("Data: ").append(compromisso);
        }

        return agenda.toString();
    }
}
