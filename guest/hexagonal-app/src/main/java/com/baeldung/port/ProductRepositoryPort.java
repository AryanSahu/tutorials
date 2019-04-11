package com.baeldung.port;

import com.baeldung.domain.Product;

public interface ProductRepositoryPort {

    void create(String name, String role, long salary);

    

	Product getProduct(Integer productId);
}