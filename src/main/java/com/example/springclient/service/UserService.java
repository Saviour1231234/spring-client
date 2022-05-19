package com.example.springclient.service;

import com.example.springclient.entity.User;
import com.example.springclient.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UserService {

    UserRepository userRepository;

    public void createUser(User user){
        userRepository.save(user);
    }

    public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }


}
