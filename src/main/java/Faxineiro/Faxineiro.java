package Faxineiro;

import java.util.ArrayList;
import java.util.List;

public class Faxineiro {
    private String nome;
    private String endereco;
    private String numeroDeTelefone;
    private String email;
    private double horasTrabalhadas;
    private double salario;

    private List<Fatura> faturas;

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getNumeroDeTelefone() {
        return this.numeroDeTelefone;
    }

    public String getEmail() {
        return this.email;
    }

    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public double getSalario() {
        return this.salario;
    }

    public List<Fatura> getFaturas() {
        return this.faturas;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setFaturas(List<Fatura> faturas) {
        this.faturas = faturas;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Número de telefone: " + this.numeroDeTelefone);
        System.out.println("Email: " + this.email);
        System.out.println("Horas trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Salário: " + this.salario);
    }

    public void adicionarFatura(Fatura fatura) {
        if (this.faturas == null) {
            this.faturas = new ArrayList<>();
        }
        this.faturas.add(fatura);
    }

    public void realizarServico() {
        System.out.println("Serviço realizado pelo faxineiro " + this.nome);
    }
}
