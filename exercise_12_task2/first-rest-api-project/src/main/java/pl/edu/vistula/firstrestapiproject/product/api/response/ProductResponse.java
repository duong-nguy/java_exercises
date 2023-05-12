package pl.edu.vistula.firstrestapiproject.product.api.response;

/**
 * ProductResponse
 */
public class ProductResponse {

    private final Long id;
    private final String name;
    public ProductResponse(Long id ,String name){
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Long getId() {
        return id;
    }
}