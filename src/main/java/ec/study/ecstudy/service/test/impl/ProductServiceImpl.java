package ec.study.ecstudy.service.test.impl;

import ec.study.ecstudy.data.test.dto.ProductDto;
import ec.study.ecstudy.data.test.entity.ProductEntity;
import ec.study.ecstudy.data.test.handler.ProductDataHandler;
import ec.study.ecstudy.service.test.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    //region [fields]
    ProductDataHandler handler;
    //endregion

    //region [constructor]
    @Autowired
    public ProductServiceImpl(ProductDataHandler handler)
    {
        this.handler = handler;
    }
    //endregion

    //region [helper-methods]
    private ProductDto getProductDto(ProductEntity entity)
    {
        return new ProductDto(entity.getId(), entity.getName(), entity.getPrice(), entity.getStock());
    }
    //endregion

    //region [override]
    @Override
    public ProductDto getProduct(String id)
    {
        return getProductDto(handler.getProductEntity(id));
    }

    @Override
    public ProductDto saveProduct(String id, String name, int price, int stock)
    {
        return getProductDto(handler.saveProductEntity(id, name, price, stock));
    }
    //endregion
}
