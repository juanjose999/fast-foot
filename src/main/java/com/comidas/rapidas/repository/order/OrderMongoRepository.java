package com.comidas.rapidas.repository.order;

import com.comidas.rapidas.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderMongoRepository extends MongoRepository<Order, String> {
}
