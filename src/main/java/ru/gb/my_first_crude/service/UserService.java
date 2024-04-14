package ru.gb.my_first_crude.service;

import org.springframework.stereotype.Service;
import ru.gb.my_first_crude.model.User;
import ru.gb.my_first_crude.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    public User getOne(int id) {
        return userRepository.getOne(id);
    }
}