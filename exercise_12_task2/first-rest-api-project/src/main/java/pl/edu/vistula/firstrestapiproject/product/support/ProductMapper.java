package pl.edu.vistula.firstrestapiproject.product.support;

import org.springframework.stereotype.Component;

import pl.edu.vistula.firstrestapiproject.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapiproject.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapiproject.product.domain.Product;

/**
 * ProductMapper
 */
@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest){
        return new Product(productRequest.getName());
    }
    public ProductResponse toProProductRespornse(Product product){
        return new ProductResponse(product.getId(),product.getName());
    }
}