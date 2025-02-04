package social.networking.site.web.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import social.networking.site.web.Entity.User;
import social.networking.site.web.Repository.UserRepository;

public class UserController {
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
