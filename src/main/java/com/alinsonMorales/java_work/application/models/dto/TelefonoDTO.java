package com.alinsonMorales.java_work.application.models.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotEmpty;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TelefonoDTO {
    @NotEmpty(message = "El número no puede estar vacío")
    private String number;
    @NotEmpty(message = "El citycode no puede estar vacío")
    private String citycode;
    @NotEmpty(message = "El contrycode no puede estar vacío")
    private String contrycode;
}
