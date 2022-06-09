package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioRolService {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    public ArrayList<UsuarioRolModel> obtenerUsuariosRol() {
        return (ArrayList<UsuarioRolModel>) usuarioRolRepository.findAll();
    }

    public UsuarioRolModel guardarUsuarioRol(UsuarioRolModel usuarioRol) {
        return usuarioRolRepository.save(usuarioRol);
    }

    public Optional<UsuarioRolModel> obtenerRolPorId(Long id) {
        return usuarioRolRepository.findById(id);
    }

    public boolean eliminarUsuarioRol(Long id) {
        try {
            usuarioRolRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
