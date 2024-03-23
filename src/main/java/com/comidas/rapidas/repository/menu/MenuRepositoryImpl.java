package com.comidas.rapidas.repository.menu;

import com.comidas.rapidas.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
@Repository
public class MenuRepositoryImpl implements MenuRepository{

    @Autowired
    private MenuMongoRepository menuMongoRepository;

    @Override
    public List<Menu> getAllMenu() {
        return menuMongoRepository.findAll();
    }

    @Override
    public Optional<Menu> findMenuById(String idMenu) {
        return menuMongoRepository.findById(idMenu);
    }

    @Override
    public Menu saveMenu(Menu menu) {
        HashMap<String, Integer> menuHashMap = menu.getOrderList();
        Menu menuHash = new Menu(menuHashMap);
        return menuMongoRepository.save(menuHash);
    }

    @Override
    public Menu updateMenu(String idMenu, Menu menu) {
        Optional<Menu> findMenu = menuMongoRepository.findById(idMenu);
        if(findMenu.isPresent()){
            Menu existingMenu = findMenu.get();
            existingMenu.setOrderList(menu.getOrderList());
            return menuMongoRepository.save(existingMenu);
        }
        throw new RuntimeException("The menu with id: " + idMenu + " not found en data base.");
    }

    @Override
    public Boolean deleteMenuById(String idMenu) {
        Optional<Menu> findMenu = menuMongoRepository.findById(idMenu);
        if(findMenu.isPresent()){
            menuMongoRepository.deleteById(idMenu);
            return true;
        }
        return false;
    }
}
