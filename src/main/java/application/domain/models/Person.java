package application.domain.models;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public abstract class  Person {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String identification;
}