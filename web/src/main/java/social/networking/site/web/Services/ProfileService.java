package social.networking.site.web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import social.networking.site.web.Entity.Profile;
import social.networking.site.web.Repository.ProfileRepository;

import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public Profile getProfileByUserId(Long userId) {
        return profileRepository.findByUserId(userId);
    }

    public Profile updateProfile(Profile profile) {
        return profileRepository.save(profile);
    }
}
