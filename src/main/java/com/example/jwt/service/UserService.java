package com.example.jwt.service;

import com.example.jwt.domain.User;
import com.example.jwt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void initUserData() {

        User entity = User.builder()
                .email("admin")
                .password("12345")
                .build();

        userRepository.save(entity);

    }

}