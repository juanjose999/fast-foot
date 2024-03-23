package com.comidas.rapidas.repository.orderqueue;

import com.comidas.rapidas.entity.OrderQueue;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderQueueMongoRepository extends MongoRepository<OrderQueue, String> {
}
