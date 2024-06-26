package br.edu.up.gestaoresiduos.controllers;

import br.edu.up.gestaoresiduos.arquivo_modelos.Dados;
import br.edu.up.gestaoresiduos.abstrata.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
        Dados.log("Usuário adicionado: " + usuario.toString());
    }

    public void removeUsuario(String id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
        Dados.log("Usuário removido: " + id);
    }

    // Métodos adicionais para atualização e listagem
}
