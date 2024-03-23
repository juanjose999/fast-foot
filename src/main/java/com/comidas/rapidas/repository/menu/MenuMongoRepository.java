package com.comidas.rapidas.repository.menu;

import com.comidas.rapidas.entity.Menu;
import com.comidas.rapidas.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MenuMongoRepository extends MongoRepository<Menu, String> {

}
