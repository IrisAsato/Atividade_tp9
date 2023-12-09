package Sistema;

import cliente.Cliente;
import Emprego.Emprego;
import Faxineiro.Faxineiro;
import Gerente.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Cliente> clientes;
    private List<Faxineiro> faxineiros;
    private List<Emprego> empregos;
    private Gerente gerente;

    public Sistema() {
        this.clientes = new ArrayList<>();
        this.faxineiros = new ArrayList<>();
        this.empregos = new ArrayList<>();
    }

    // Getters
    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public List<Faxineiro> getFaxineiros() {
        return this.faxineiros;
    }

    public List<Emprego> getEmpregos() {
        return this.empregos;
    }

    public Gerente getGerente() {
        return this.gerente;
    }

    // Setters
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    // Métodos
    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void adicionarFaxineiro(Faxineiro faxineiro) {
        this.faxineiros.add(faxineiro);
    }

    public void adicionarEmprego(Emprego emprego) {
        this.empregos.add(emprego);
    }

    public void imprimirInformacoes() {
        System.out.println("Gerente: " + this.gerente.getNome());
        System.out.println("Clientes: " + this.clientes.size());
        System.out.println("Faxineiros: " + this.faxineiros.size());
        System.out.println("Empregos: " + this.empregos.size());
    }

    public String gerarProgramacaoSemanal() {
        StringBuilder programacao = new StringBuilder();
        programacao.append("Programação semanal:\n");

        for (Faxineiro faxineiro : this.faxineiros) {
            programacao.append("Faxineiro: ").append(faxineiro.getNome()).append("\n");
            programacao.append("Empregos:\n");

            for (Emprego emprego : this.empregos) {
                if (emprego.getFaxineiro().equals(faxineiro)) {
                    programacao.append(" Dia: ").append(emprego.getData());
                }
            }
        }

        return programacao.toString();
    }

    public String gerarHorasTrabalhadasSemanal() {
        StringBuilder horasTrabalhadas = new StringBuilder();
        horasTrabalhadas.append("Horas trabalhadas semanalmente:\n");

        for (Faxineiro faxineiro : this.faxineiros) {
            horasTrabalhadas.append("Faxineiro: ").append(faxineiro.getNome()).append(", Horas trabalhadas: ").append(faxineiro.getHorasTrabalhadas()).append("\n");
        }

        return horasTrabalhadas.toString();
    }
}





