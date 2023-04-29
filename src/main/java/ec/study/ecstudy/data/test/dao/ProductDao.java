package ec.study.ecstudy.data.test.dao;

import ec.study.ecstudy.data.test.entity.ProductEntity;

public interface ProductDao {
    ProductEntity saveProduct(ProductEntity entity);
    ProductEntity getProduct(String productId);
}
