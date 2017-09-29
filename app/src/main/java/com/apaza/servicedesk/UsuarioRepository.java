package com.apaza.servicedesk;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alumno on 25/09/2017.
 */

public class UsuarioRepository {

    private static UsuarioRepository _INSTANCE = null;

    private UsuarioRepository(){}

    public static UsuarioRepository getInstance(){
        if(_INSTANCE == null)
            _INSTANCE = new UsuarioRepository();
        return _INSTANCE;
    }

    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    Usuario usuario1 = new Usuario("jose","tecsup","cliente");
    Usuario usuario2 = new Usuario("miguel","tecsup2","tecnico");
    Usuario usuario3 = new Usuario("jimena","tecsup3","supervisor");





}
