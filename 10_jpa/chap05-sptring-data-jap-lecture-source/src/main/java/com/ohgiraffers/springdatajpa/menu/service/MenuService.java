package com.ohgiraffers.springdatajpa.menu.service;

import com.ohgiraffers.springdatajpa.menu.dto.MenuDTO;
import com.ohgiraffers.springdatajpa.menu.entity.Menu;
import com.ohgiraffers.springdatajpa.menu.repository.MenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MenuService {
    private final MenuRepository menuRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public MenuService(MenuRepository menuRepository, ModelMapper modelMapper) {
        this.menuRepository = menuRepository;
        this.modelMapper = new ModelMapper();
    }

    public MenuDTO findMenuByCode(int menuCode) {
        Menu menu=menuRepository.findById(menuCode).get();
        log.debug("menu: {}",menu);

        MenuDTO result=modelMapper.map(menu, MenuDTO.class);


        return result;
    }
}
