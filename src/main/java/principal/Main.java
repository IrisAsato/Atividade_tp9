package principal;

import static spark.Spark.*;
import java.util.ArrayList;
import java.util.List;
import cliente.Cliente;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        post("/clientesPost", (req, res) -> {
            String nome = req.queryParams("nome");
            String endereco = req.queryParams("endereco");
            String numeroDeTelefone = req.queryParams("numeroDeTelefone");
            String email = req.queryParams("email");

            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setEndereco(endereco);
            cliente.setNumeroDeTelefone(numeroDeTelefone);
            cliente.setEmail(email);

            clientes.add(cliente);

            return clientes;
        });

        get("/clientes", (req, res) -> {
            int id = Integer.parseInt(req.params(":id"));

            Cliente cliente = clientes.get(id);

            return cliente;
        });
    }
}
