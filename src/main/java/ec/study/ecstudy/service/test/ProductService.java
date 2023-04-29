package ec.study.ecstudy.service.test;

import ec.study.ecstudy.data.test.dto.ProductDto;

public interface ProductService { // for loose coupling
    ProductDto getProduct(String id);
    ProductDto saveProduct(String id, String name, int price, int stock);
}