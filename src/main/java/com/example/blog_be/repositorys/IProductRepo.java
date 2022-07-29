package com.example.blog_be.repositorys;

import com.example.blog_be.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IProductRepo extends PagingAndSortingRepository<Product, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM product_c0322g1.product where name like concat('%',:name,'%');")
    List<Product> findAllByNameContaining(String name);
}
