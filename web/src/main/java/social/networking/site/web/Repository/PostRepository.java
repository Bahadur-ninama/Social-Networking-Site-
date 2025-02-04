package social.networking.site.web.Repository;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import social.networking.site.web.Entity.Post;
import social.networking.site.web.Entity.Profile;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Profile, Optional> {
    List<Post> findByUserId(Long userId);
}
