package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioRolServiceTest {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    @Test
    public void testCuandoGuardaRol() {
        UsuarioModel usuarioModel=new UsuarioModel("ceciclia", "ce@gmail.com",12)
        UsuarioRolModel usuarioRolModel = new UsuarioRolModel(1L,"vendedor5",usuarioModel);
        UsuarioRolModel usuarioRolModelRegistrado = usuarioRolRepository.save(usuarioRolModel);
        assertNotNull(usuarioRolModelRegistrado);
    }

    @Test
    public void testCuandoListaRoles(){
        List<UsuarioRolModel> usuarioRolModelList=(List<UsuarioRolModel>) usuarioRolRepository.findAll();
        assertThat(usuarioRolModelList).size().isGreaterThan(0);
    }
}
