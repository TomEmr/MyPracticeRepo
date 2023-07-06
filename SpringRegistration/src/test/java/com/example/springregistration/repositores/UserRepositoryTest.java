package com.example.springregistration.repositores;

import com.example.springregistration.models.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void itShouldCheckIfUserEmailExists() {
        // Arrange
        User user = User.builder()
                .email("to@email.cz")
                .build();
        underTest.save(user);
        // Act
        boolean expected = underTest.existsByEmail(user.getEmail());
        // Assert
        assertThat(expected).isTrue();
    }

    @Test
    void itShouldCheckIfUserEmailDoesntExists() {
        // Arrange
        User user = new User();
        user.setEmail("to@email.cz");
        user.setPassword("password");
        user.setName("name");
        // Act
        boolean expected = underTest.existsByEmail(user.getEmail());
        // Assert
        assertThat(expected).isFalse();
    }

    @Test
    void itShouldReturnUserById() {
        // Arrange
        User user = User.builder().name("name").email("email").password("password").build();
        underTest.save(user);

        // Act
        User expected = underTest.findById(user.getId()).get();

        // Assert
        assertThat(expected).isEqualTo(user);
        assertThat(expected).isNotNull();
    }

    @Test
    void getAllReturnAllUsers(){
        //Arrange
        User user1 = User.builder().name("name1").email("email1").password("password1").build();
        User user2 = User.builder().name("name2").email("email2").password("password2").build();
        underTest.save(user1);
        underTest.save(user2);
        //Act
        List<User> expected = underTest.findAll();
        //Assert
        assertThat(expected.size()).isEqualTo(2);
        assertThat(expected).isNotNull();
    }
}