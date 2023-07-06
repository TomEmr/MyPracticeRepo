package com.example.springregistration.services;

import com.example.springregistration.models.Role;
import com.example.springregistration.models.User;
import com.example.springregistration.models.UserDto;
import com.example.springregistration.repositores.RoleRepository;
import com.example.springregistration.repositores.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl underTest;
    @Mock
    private UserRepository userRepository;
    @Mock
    private RoleRepository roleRepository;
    @Mock
    private PasswordEncoder passwordEncoder;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void saveUserInTheDatabase() {
//        arrange
        UserDto userDto = new UserDto();
        userDto.setFirstName("John");
        userDto.setLastName("Doe");
        userDto.setEmail("johndoe@example.com");
        userDto.setPassword("password123");

        Role role = new Role();
        role.setName("ROLE_ADMIN");

//        act
        when(roleRepository.findByName("ROLE_ADMIN")).thenReturn(role);
        when(passwordEncoder.encode(any())).thenReturn("encodedPassword");
        underTest.saveUser(userDto);

        // Ověří, že save metoda byla použita jen jednou
//        assert
        verify(userRepository, times(1)).save(any(User.class));
        assertThat(roleRepository.findByName("ROLE_ADMIN")).isEqualTo(role);
        assertThat(passwordEncoder.encode("password123")).isEqualTo("encodedPassword");
    }

    @Test
    void canGetAllUsers() {
        // arrange
        when(userRepository.findAll()).thenReturn(List.of());
        // act + assert
        assertThat(underTest.findAllUsers()).isEqualTo(List.of());
    }

    @Test
    void findUserByEmail() {
//        arrange
        User user = User.builder().email("email").build();
//        act
        when(userRepository.findByEmail(user.getEmail())).thenReturn(user);
//        assert
        assertThat(underTest.findByEmail(user.getEmail())).isEqualTo(user);
    }
}