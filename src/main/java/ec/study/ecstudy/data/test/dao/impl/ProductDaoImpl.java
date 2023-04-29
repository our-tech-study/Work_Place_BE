package ec.study.ecstudy.data.test.dao.impl;

import ec.study.ecstudy.data.test.dao.ProductDao;
import ec.study.ecstudy.data.test.entity.ProductEntity;
import ec.study.ecstudy.data.test.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDaoImpl implements ProductDao {
    //region [fields]
    ProductRepository repository; //bean, singleton
    //endregion

    //region [constructor]
    @Autowired //DI
    public ProductDaoImpl(ProductRepository repository)
    {
        this.repository = repository;
    }
    //endregion

    //region [override]
    @Override
    public ProductEntity saveProduct(ProductEntity entity)
    {
        repository.save(entity);
        return entity;
    }

    @Override
    public ProductEntity getProduct(String productId)
    {
        return repository.getById(productId);
    }
    //endregion
}
