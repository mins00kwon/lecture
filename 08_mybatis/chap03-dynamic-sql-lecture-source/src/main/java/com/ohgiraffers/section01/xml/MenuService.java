package com.ohgiraffers.section01.xml;

import static com.ohgiraffers.section01.xml.Template.getSqlSession;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class MenuService {
    public void findMenuByPrice(int maxPrice) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.selectMenuByPrice(maxPrice);
        System.out.println("===== Service Layer");
        menus.forEach(System.out::println);
        sqlSession.close();
    }

    public void searchMenu(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        System.out.println("===== Service Layer");
        List<MenuDTO> menus = mapper.searchMenu(searchCriteria);
        menus.forEach(System.out::println);
        sqlSession.close();
    }

    public void searchMenuBySupCategory(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        System.out.println("===== Service Layer");
        List<MenuDTO> menus = mapper.searchMenuBySupCategory(searchCriteria);
        menus.forEach(System.out::println);
        sqlSession.close();
    }
}
