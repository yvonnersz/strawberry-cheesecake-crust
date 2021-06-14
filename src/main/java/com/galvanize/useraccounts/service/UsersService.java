package com.galvanize.useraccounts.service;

import com.galvanize.useraccounts.UsersList;
import com.galvanize.useraccounts.UsersRepository;
import com.galvanize.useraccounts.model.User;

import com.galvanize.useraccounts.request.UserRequest;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User createUser(User user) {
       return null;
    }

    public void deleteUser(Long id) {
        return;
    }

    public User updateUser(Long id, UserRequest updatedUser) { return null; }

    public User getUser(Long id) {
        return null;
    }

    public Boolean updateUserPassword(Long id, String oldPassword, String newPassword) {
        return null;
    }

    public User setAvatar(Long id, String url) {
        return null;
    }

    public UsersList searchUsers(String username) {
        if (username == null) username = "";

        UsersList users = new UsersList(usersRepository.findByUsername("%" + username + "%"));

        return users.isEmpty() ? null : users;
    }

}
