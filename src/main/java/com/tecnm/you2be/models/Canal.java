package com.tecnm.you2be.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Canal {

    private int idCanal;

    private String nombre;

    private int idUsuario;

    private int idVideo;

}
