package social.networking.site.web.Repository;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import social.networking.site.web.Entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Optional> {
    Profile findByUserId(Long userId);
}
