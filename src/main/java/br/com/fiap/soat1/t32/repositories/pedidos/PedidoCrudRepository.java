package br.com.fiap.soat1.t32.repositories.pedidos;

import org.springframework.data.repository.CrudRepository;

import br.com.fiap.soat1.t32.models.entities.pedidos.Pedido;


public interface PedidoCrudRepository extends CrudRepository<Pedido, Long> {

}
