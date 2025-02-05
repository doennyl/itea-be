package com.ite.itea.ecommerce.usecase;

import com.ite.itea.ecommerce.domain.retail.Product;
import com.ite.itea.ecommerce.domain.retail.ProductId;
import com.ite.itea.ecommerce.usecase.port.ProductRepository;

import java.util.Optional;

public class FindAProductUseCase {

    private final ProductRepository productRepository;

    public FindAProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> execute(ProductId id) {
        return productRepository.byId(id);
    }
}
