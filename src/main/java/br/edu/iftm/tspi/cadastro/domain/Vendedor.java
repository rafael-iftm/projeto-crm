package br.edu.iftm.tspi.cadastro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendedor {
    private int idVendedor;
    private String nomeVendedor;
}

