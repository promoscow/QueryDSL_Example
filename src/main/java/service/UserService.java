package service;

import dto.UserDto;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public ResponseEntity<Page<UserDto>> getAll(Long groupId) {
        return new Page<User>(repository.findAll());
    }

}
