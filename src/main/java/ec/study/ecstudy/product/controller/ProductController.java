package ec.study.ecstudy.product.controller;

import ec.study.ecstudy.data.test.dto.ProductDto;
import ec.study.ecstudy.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product-api")
public class ProductController {
    //region [fields]
    private ProductService service;
    //endregion

    //region [constructor]
    @Autowired // 자동으로 생성되어 있던 싱글톤 서비스 객체를 끌어다 넣어줌.
    public ProductController(ProductService service)
    {
        this.service = service;
    }
    //endregion

    //region [methods]
    //http://localhost:8080/ec_seunghui/product-api/test
    @GetMapping("/test")
    public String test()
    {
        return  "product test.";
    }

    //http://localhost:8080/ec_seunghui/product-api/product/{productId}
    @GetMapping(value = "/product/{productId}")
    public ProductDto getProduct(@PathVariable String productId)
    {
        return service.getProduct(productId);
    }

    //http://localhost:8080/ec_seunghui/product-api/product
    @PostMapping(value = "/product/")
    public ProductDto createProduct(@RequestBody ProductDto dto)
    {
        return service.saveProduct(dto.getId(), dto.getName(), dto.getPrice(), dto.getStock());
    }

    //endregion
}
