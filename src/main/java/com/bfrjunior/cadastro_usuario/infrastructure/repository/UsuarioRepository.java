package com.bfrjunior.cadastro_usuario.infrastructure.repository;

import com.bfrjunior.cadastro_usuario.infrastructure.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
