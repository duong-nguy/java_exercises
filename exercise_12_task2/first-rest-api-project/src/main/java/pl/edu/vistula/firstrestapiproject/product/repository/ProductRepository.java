package pl.edu.vistula.firstrestapiproject.product.repository;

import java.util.HashMap;

import pl.edu.vistula.firstrestapiproject.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.Map;
/**
 * ProductRepository
 */
@Repository
public class ProductRepository {

    protected final Map<Long,Product> map = new HashMap<>();
    protected  long counter = 1;

    public Product save(Product entity){
        setId(entity);
        return entity;
    }
    private Product setId(Product entity){
        entity.setId(counter);
        map.put(counter,entity);
        counter++;
        return entity;
    }

    
}