package cliente;

public class Cliente {
    private String nome;
    private String endereco;
    private String numeroDeTelefone;
    private String email;

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

    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Número de telefone: " + this.numeroDeTelefone);
        System.out.println("Email: " + this.email);
    }
}
