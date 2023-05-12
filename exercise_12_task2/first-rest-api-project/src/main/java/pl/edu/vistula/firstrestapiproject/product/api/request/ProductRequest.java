package pl.edu.vistula.firstrestapiproject.product.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * ProductRequest
 */
public class ProductRequest {

    private final String name;

    @JsonCreator
    public ProductRequest(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}