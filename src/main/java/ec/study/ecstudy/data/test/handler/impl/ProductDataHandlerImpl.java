package ec.study.ecstudy.data.test.handler.impl;

import ec.study.ecstudy.data.test.dao.ProductDao;
import ec.study.ecstudy.data.test.entity.ProductEntity;
import ec.study.ecstudy.data.test.handler.ProductDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {
    //region [fields]
    ProductDao dao;
    //endregion

    //region [constructor]
    @Autowired
    public ProductDataHandlerImpl(ProductDao dao)
    {
        this.dao = dao;
    }
    //endregion

    //region [override]
    @Override
    public ProductEntity getProductEntity(String id)
    {
        return dao.getProduct(id);
    }

    @Override
    public ProductEntity saveProductEntity(String id, String name, int price, int stock)
    {
        return dao.saveProduct(new ProductEntity(id, name, price, stock));
    }
    //endregion
}
