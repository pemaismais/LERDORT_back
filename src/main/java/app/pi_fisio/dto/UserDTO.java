package app.pi_fisio.dto;

import app.pi_fisio.entity.JointIntensity;
import app.pi_fisio.entity.User;
import app.pi_fisio.entity.UserRole;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.util.List;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
        private Long id;
        private String name;
        private String email;
        private UserRole role;
        private String course;
        private List<JointIntensity> jointIntensities;
        
        public UserDTO(User user){
                BeanUtils.copyProperties(user, this);
        }
}
