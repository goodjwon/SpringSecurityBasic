package example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import example.models.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;



@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepoTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insert() {
        User user = new User();
        user.setUserName("jwon");
        user.setPassword(passwordEncoder.encode("1212"));
        user.setActive(true);
        user.setRoles("ROLE_USER");
        // given
        userRepository.save(user);
    }

    @Test
    public void testEncoder(){
        String password = passwordEncoder.encode("1212");
        System.out.println(password);
    }
}