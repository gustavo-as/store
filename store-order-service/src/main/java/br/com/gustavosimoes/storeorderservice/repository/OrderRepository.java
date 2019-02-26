package br.com.gustavosimoes.storeorderservice.repository;

import br.com.gustavosimoes.storeorderservice.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
