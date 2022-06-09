
package com.crud.democrud.controllers;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.services.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/rol")
public class UsuarioRolController {

    @Autowired
    UsuarioRolService usuarioRolService;

    @GetMapping()
    public ArrayList<UsuarioRolModel> obtenerUsuariosRol() {
        return usuarioRolService.obtenerUsuariosRol();
    }

    @PostMapping()
    public UsuarioRolModel guardarUsuarioRol(@RequestBody UsuarioRolModel usuarioRol) {
        return this.usuarioRolService.guardarUsuarioRol(usuarioRol);
    }

}

