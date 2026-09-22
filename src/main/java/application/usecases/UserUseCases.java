package application.usecases;
import application.domain.models.User;
import application.domain.services.UserService;
import java.util.List;
import java.util.Optional;

public class UserUseCases {
    private final UserService userService;

    public UserUseCases(UserService userService) {
        this.userService = userService;
    }

    public User saveUser(User user) {
        return userService.save(user);
    }

    public Optional<User> findUserById(Long id) {
        return userService.findById(id);
    }

    public List<User> findAllUsers() {
        return userService.findAll();
    }

    public void deleteUser(Long id) {
        userService.deleteById(id);
    }
}