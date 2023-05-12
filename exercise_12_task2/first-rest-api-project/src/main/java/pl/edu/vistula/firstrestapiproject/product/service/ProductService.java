package pl.edu.vistula.firstrestapiproject.product.service;

import org.springframework.stereotype.Service;

import pl.edu.vistula.firstrestapiproject.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapiproject.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapiproject.product.domain.Product;
import pl.edu.vistula.firstrestapiproject.product.repository.ProductRepository;
import pl.edu.vistula.firstrestapiproject.product.support.ProductMapper;

/**
 * ProductService
 */
@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }
    public ProductResponse create(ProductRequest productRequest){
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProProductRespornse(product);
    }

}