package ServicoDeLimpeza;

import java.util.Date;

public class ServicoDeLimpeza {
    private String tipoServico;
    private Date data;
    private String hora;
    private double preco;

    // Getters
    public String getTipoServico() {
        return this.tipoServico;
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

    // Setters
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
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

    public void agendarServico() {
        System.out.println("Serviço de limpeza agendado para o tipo " + this.tipoServico + " na data " + this.data + " às " + this.hora);
    }

    public void realizarServico() {
        System.out.println("Serviço de limpeza realizado para o tipo " + this.tipoServico);
    }
}