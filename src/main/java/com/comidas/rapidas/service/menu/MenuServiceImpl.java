package com.comidas.rapidas.service.menu;

import com.comidas.rapidas.entity.Menu;
import com.comidas.rapidas.repository.menu.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> getAllMenu() {
        return new ArrayList<>(menuRepository.getAllMenu());
    }

    @Override
    public Optional<Menu> findMenuById(String idMenu) {
        return menuRepository.findMenuById(idMenu);
    }

    @Override
    public Menu saveMenu(Menu menu) {
        return menuRepository.saveMenu(menu);
    }

    @Override
    public Menu updateMenu(String idMenu, Menu menu) {
        return menuRepository.updateMenu(idMenu, menu);
    }

    @Override
    public Boolean deleteMenuById(String idMenu) {
        return menuRepository.deleteMenuById(idMenu);
    }
}
