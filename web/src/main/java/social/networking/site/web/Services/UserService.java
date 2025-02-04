package social.networking.site.web.Services;

import org.springframework.security.crypto.password.PasswordEncoder;
import social.networking.site.web.Entity.User;
import social.networking.site.web.Repository.UserRepository;

import java.util.Optional;

public class UserService {
     UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


}
