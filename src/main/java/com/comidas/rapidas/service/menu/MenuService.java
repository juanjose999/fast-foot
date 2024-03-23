package com.comidas.rapidas.service.menu;

import com.comidas.rapidas.entity.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    List<Menu> getAllMenu();
    Optional<Menu> findMenuById(String idMenu);
    Menu saveMenu(Menu menu);
    Menu updateMenu(String idMenu, Menu menu);
    Boolean deleteMenuById(String idMenu);

}
