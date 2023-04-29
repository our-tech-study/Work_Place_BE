package ec.study.ecstudy.data.test.handler;

import ec.study.ecstudy.data.test.entity.ProductEntity;

public interface ProductDataHandler {
    public ProductEntity getProductEntity(String id);
    public ProductEntity saveProductEntity(String id, String name, int price, int stock);
}
