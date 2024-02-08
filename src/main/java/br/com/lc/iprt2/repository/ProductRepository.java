package br.com.lc.iprt2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lc.iprt2.product.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
