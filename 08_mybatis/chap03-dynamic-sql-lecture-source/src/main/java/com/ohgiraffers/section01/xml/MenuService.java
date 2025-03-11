package com.ohgiraffers.section01.xml;

import static com.ohgiraffers.section01.xml.Template.getSqlSession;

import java.util.List;
import java.util.Map;
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

    public void searchMenuByRandomMenuCode(List<Integer> randomList) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        System.out.println("===== Service Layer");
        List<MenuDTO> menus = mapper.searchMenuByRandomMenuCode(randomList);
        menus.forEach(System.out::println);
        sqlSession.close();
    }

    public void searchMenuByCodeOrSearchAll(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        System.out.println("===== Service Layer");
        List<MenuDTO> menus = mapper.searchMenuByCodeOrSearchAll(searchCriteria);
        menus.forEach(System.out::println);
        sqlSession.close();
    }

    public void searchMenuByNameOrCategory(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        System.out.println("===== Service Layer");
        List<MenuDTO> menus = mapper.searchMenuByNameOrCategory(criteria);
        menus.forEach(System.out::println);
        sqlSession.close();
    }

    public void modifyMenu(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        System.out.println("===== Service Layer");
        int result = mapper.modifyMenu(criteria);
        if (result == 1) {
            System.out.println("메뉴 정보 변경에 성공하였습니다.");
            sqlSession.commit();
        } else {
            System.out.println("메뉴 정보 변경에 실패하였습니다.");
            sqlSession.rollback();
        }
        sqlSession.close();
    }
}
