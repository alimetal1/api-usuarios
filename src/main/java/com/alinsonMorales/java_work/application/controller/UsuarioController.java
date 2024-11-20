package com.alinsonMorales.java_work.application.controller;

import com.alinsonMorales.java_work.application.exceptions.ServiceException;
import com.alinsonMorales.java_work.application.models.dto.UsuarioRequestDTO;
import com.alinsonMorales.java_work.application.models.dto.UsuarioResponseDTO;
import com.alinsonMorales.java_work.application.services.IUsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<?> registrarUsuario(@Valid @RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        try {
            UsuarioResponseDTO usuarioResponseDTO = usuarioService.registrarUsuario(usuarioRequestDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(usuarioResponseDTO);
        } catch (ServiceException e) {
            ErrorResponse error = ErrorResponse.builder()
                    .mensaje(e.getMessage())
                    .build();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }
    }

    @lombok.Builder
    @lombok.Data
    static class ErrorResponse {
        private String mensaje;
    }
}

