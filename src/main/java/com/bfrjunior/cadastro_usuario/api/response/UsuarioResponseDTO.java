package com.bfrjunior.cadastro_usuario.api.response;

public record UsuarioResponseDTO(Long id,

                                 String nome,

                                 String email,

                                 String documento,

                                 EnderecoResponseDTO endereco) {



}
