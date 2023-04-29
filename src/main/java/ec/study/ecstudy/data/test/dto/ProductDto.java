package ec.study.ecstudy.data.test.dto;

import ec.study.ecstudy.data.test.entity.ProductEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {
    //region [fields]
    private String id;
    private String name;
    private int price;
    private int stock;
    //endregion

    //region [methods]
    public ProductEntity toEntity() {
        return ProductEntity.builder()
                .id(id)
                .name(name)
                .price(price)
                .stock(stock)
                .build();
    }
    //endregion
}
