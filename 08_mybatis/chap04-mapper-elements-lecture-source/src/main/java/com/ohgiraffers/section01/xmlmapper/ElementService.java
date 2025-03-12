package com.ohgiraffers.section01.xmlmapper;

import static com.ohgiraffers.section01.xmlmapper.Template.getSqlSession;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class ElementService {

    public void selectResultMapTest() {
        SqlSession sqlSession = getSqlSession();
        ElementMapper mapper = sqlSession.getMapper(ElementMapper.class);
        List<MenuDTO> menus = mapper.selectResultMapTest();
        menus.forEach(System.out::println);
        sqlSession.close();
    }

    public void selectResultMapAssociationTest() {
        SqlSession sqlSession = getSqlSession();
        ElementMapper mapper = sqlSession.getMapper(ElementMapper.class);
        List<MenuAndCategoryDTO> menus = mapper.selectResultMapAssociationTest();
        menus.forEach(System.out::println);
        sqlSession.close();
    }


    public void selectResultMapCollectionTest() {
        SqlSession sqlSession = getSqlSession();
        ElementMapper mapper = sqlSession.getMapper(ElementMapper.class);
        List<CategoryAndMenuDTO> categories = mapper.selectResultMapCollectionTest();
        categories.forEach(System.out::println);
        sqlSession.close();
    }
}
