package social.networking.site.web.Controller;

import org.springframework.web.bind.annotation.*;
import social.networking.site.web.Entity.Post;
import social.networking.site.web.Entity.Profile;
import social.networking.site.web.Repository.PostRepository;

import java.time.LocalDateTime;
import java.util.List;

public class PostController {

     PostRepository postRepository;

    public PostController(PostRepository postRepository) {

        this.postRepository = postRepository;
    }

    @PostMapping("/add")
    public Post addPost(@RequestBody Post post) {
        post.setDateTime(LocalDateTime.now());
        final  save = postRepository.save(post);
        return save;
    }

    @PutMapping("/update/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
        return postRepository.findById(id).map(post -> {
            post.setContent(updatedPost.getContent());
            return postRepository.save(post);
        }).orElseThrow(() -> new RuntimeException("Post not found"));
    }

    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
    }

    @GetMapping("/all")
    public List<Profile> getAllPosts() {

        return postRepository.findAll();
    }
}
