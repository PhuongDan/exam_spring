package com.example.exam_spring.service;

import com.example.exam_spring.entity.User;
import com.example.exam_spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

public List<User> getAll() {return userRepository.findAll();}
public  User createUser(User user){return userRepository.save(user);}
public User updateUser(Long id, User user){
        return userRepository.findById(id)
                .map(u-> {
u.setName(user.getName());
u.setAge(user.getAge());
u.setSaraly(user.getSaraly());
return userRepository.save(u);
                })
                .orElseGet(()->{
                    user.setId(id);
                    return userRepository.save(user);
                });
}
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
    public List<User> searchUser(String search){
        return userRepository.findAllByNameContaining(search);
    }
}
