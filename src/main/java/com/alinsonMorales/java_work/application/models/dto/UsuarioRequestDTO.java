package com.alinsonMorales.java_work.application.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequestDTO {
    private String name;
    @NotEmpty(message = "El correo no puede estar vacío")
    private String email;
    private String password;
    @Valid
    @NotEmpty(message = "Debe proporcionar al menos un teléfono")
    private List<TelefonoDTO> phones;
}
