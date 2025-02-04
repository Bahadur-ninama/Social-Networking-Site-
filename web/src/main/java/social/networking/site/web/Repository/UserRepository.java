package social.networking.site.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import social.networking.site.web.Entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, org.apache.el.stream.Optional> {
    Optional<User> findByUsername(String username);
}
