package org.example;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
        Logger.log("Usuário adicionado: " + usuario.toString());
    }

    public void removeUsuario(String id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
        Logger.log("Usuário removido: " + id);
    }

    // Métodos adicionais para atualização e listagem
}
