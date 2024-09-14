package com.bfrjunior.cadastro_usuario.api.converter;

import com.bfrjunior.cadastro_usuario.api.request.EnderecoRequestDTO;
import com.bfrjunior.cadastro_usuario.api.request.UsuarioRequestDTO;
import com.bfrjunior.cadastro_usuario.api.response.EnderecoResponseDTO;
import com.bfrjunior.cadastro_usuario.api.response.UsuarioResponseDTO;
import com.bfrjunior.cadastro_usuario.infrastructure.entities.EnderecoEntity;
import com.bfrjunior.cadastro_usuario.infrastructure.entities.UsuarioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class UsuarioConverter {


    private final Clock clock;

    public UsuarioEntity paraUsuarioEntity(UsuarioRequestDTO usuarioDTO) {
        return UsuarioEntity.builder()
                .nome(usuarioDTO.getNome())
                .documento(usuarioDTO.getDocumento())
                .email(usuarioDTO.getEmail())
                .dataCadastro(LocalDateTime.now(clock))
                .endereco(paraEnderecoEntity(usuarioDTO.getEndereco()))
                .build();

    }


    private EnderecoEntity paraEnderecoEntity(EnderecoRequestDTO enderecoDTO) {
        return EnderecoEntity.builder()
                .rua(enderecoDTO.getRua())
                .bairro(enderecoDTO.getBairro())
                .cep(enderecoDTO.getCep())
                .cidade(enderecoDTO.getCidade())
                .numero(enderecoDTO.getNumero())
                .complemento(enderecoDTO.getComplemento())
                .build();
    }

}
