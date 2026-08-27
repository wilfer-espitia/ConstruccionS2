package application.domain.models;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private String id;
    private String name;
    private String description;
    private boolean active;

    public Category() {
        this.active = true;
    }
    
}
