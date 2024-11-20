package com.alinsonMorales.java_work.application.services;

import com.alinsonMorales.java_work.application.exceptions.ServiceException;
import com.alinsonMorales.java_work.application.models.dto.UsuarioRequestDTO;
import com.alinsonMorales.java_work.application.models.dto.UsuarioResponseDTO;

public interface IUsuarioService {
    UsuarioResponseDTO registrarUsuario(UsuarioRequestDTO usuarioRequestDTO) throws ServiceException;
}
