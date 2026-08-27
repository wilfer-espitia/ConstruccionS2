package application.domain.models;

import application.domain.models.enums.RoleSystem;
import application.domain.models.enums.UserStatus;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class User {
     private Long id;
    private String personId;
    private String email;
    private String password;
    private RoleSystem role;
    private UserStatus status;

    public User() {
        this.status = UserStatus.ACTIVE;
    }
    
}
