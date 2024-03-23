package com.comidas.rapidas.controller;

import com.comidas.rapidas.entity.Menu;
import com.comidas.rapidas.repository.menu.MenuRepository;
import com.comidas.rapidas.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public ResponseEntity<List<Menu>> getAllMenu(){
        return new ResponseEntity<>(menuService.getAllMenu(), HttpStatus.OK);
    }

    @PostMapping("/save-menu")
    public ResponseEntity<Menu> saveMenu(@RequestBody Menu menu){
        return new ResponseEntity<>(menuService.saveMenu(menu), HttpStatus.CREATED);
    }
}
