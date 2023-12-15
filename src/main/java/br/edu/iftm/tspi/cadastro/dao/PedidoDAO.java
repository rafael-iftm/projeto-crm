package br.edu.iftm.tspi.cadastro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import br.edu.iftm.tspi.cadastro.domain.Pedido;

@Component
public class PedidoDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Consulta todos os Pedidos
    public List<Pedido> listarPedidos(String email) {
        String sql = "SELECT p.idPedido, p.valorPedido, p.dataPedido, p.email_contato, p.idVendedor, v.nomeVendedor " +
        "FROM tb_pedido p " +
        "LEFT JOIN tb_vendedor v ON p.idVendedor = v.idVendedor " +
        "WHERE p.email_contato = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Pedido.class), email);
    }

    // Insere um novo Pedido
    public void inserirPedido(Pedido pedido) throws DataAccessException {
        String sql = "INSERT INTO tb_pedido (idPedido, valorPedido, dataPedido, email_contato, idVendedor) " +
                     "VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, pedido.getIdPedido(), pedido.getValorPedido(), 
                            pedido.getDataPedido(), pedido.getEmail_contato(), 
                            pedido.getIdVendedor());
    }


}
