package br.edu.iftm.tspi.cadastro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private int idPedido;
    private String valorPedido;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataPedido;
    private String email_contato;
    private int idVendedor;


    private String nomeVendedor;

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
}
