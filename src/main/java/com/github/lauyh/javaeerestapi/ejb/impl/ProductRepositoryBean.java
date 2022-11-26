package com.github.lauyh.javaeerestapi.ejb.impl;

import com.github.lauyh.javaeerestapi.constant.ProductCategories;
import com.github.lauyh.javaeerestapi.ejb.client.ProductRepository;
import com.github.lauyh.javaeerestapi.model.Product;
import javax.ejb.Stateless;

@Stateless
public class ProductRepositoryBean implements ProductRepository {
    @Override
    public Product getProduct() {
        Product product = new Product();
        product.setID(1L);
        product.setName("Anker Wireless Earbud");
        product.setPrice(123.12);
        product.setCategory(ProductCategories.EnE.getLabel()); // "Electronic"
        return product;
    }
}
