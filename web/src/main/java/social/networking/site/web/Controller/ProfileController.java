package social.networking.site.web.Controller;

public class ProfileController {

    public ProfileController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @PostMapping("/update")
    public Profile updateProfile(@RequestBody Profile profile) {
        return profileRepository.save(profile);
    }

    @GetMapping("/{userId}")
    public Profile getProfile(@PathVariable Long userId) {
        return profileRepository.findByUserId(userId);
    }
}
