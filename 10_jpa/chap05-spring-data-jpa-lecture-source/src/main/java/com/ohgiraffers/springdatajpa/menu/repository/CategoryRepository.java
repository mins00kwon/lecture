package com.ohgiraffers.springdatajpa.menu.repository;

import com.ohgiraffers.springdatajpa.menu.entity.Category;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    /* 설명: findAll() 메소드를 사용할 수 있지만, jpql 또는 native query 로도 작성 가능*/
    @Query(value="select m from Category m order by m.categoryCode ASC")
//    @Query(value="select CATEGORY_CODE, category_name, ref_category_code from tbl_category "
//            + "order by category_code_asc", nativeQuery=true)
    List<Category> findAllCategories();
}
