package social.networking.site.web.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
     Long id;
    @Column
    Long userId; // Link to User entity
    @Column
    String bio;
    @Column
    String profilePictureUrl;

    public void setContent(Object content) {
    }
}
