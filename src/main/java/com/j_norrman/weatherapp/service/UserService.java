package com.j_norrman.weatherapp.service;

import com.j_norrman.weatherapp.exception.ResourceNotFoundException;
import com.j_norrman.weatherapp.model.user.User;
import com.j_norrman.weatherapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }
    public User updateUser(Long id, User user) {
        Optional<User> optionalUser = findUserById(id);
        User tempUser = optionalUser.orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        if (user.getUsername() != null) {
            tempUser.setUsername(user.getUsername());
        }
        if (user.getPassword() != null) {
            tempUser.setPassword(user.getPassword());
        }
        if (user.getFavourites() != null) {
            tempUser.setFavourites(user.getFavourites());
        }
        return userRepository.save(tempUser);
    }
    public void deleteUser(Long id, User user) {
        Optional<User> optionalUser = findUserById(id);
        User tempUser = optionalUser.orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        if (tempUser.getUsername().equals(user.getUsername()) && tempUser.getPassword().equals(user.getPassword())) {
            userRepository.delete(tempUser);
        } else {
            throw new IllegalArgumentException("Username or password does not match");
        }
    }
}

