package controller;

import com.querydsl.core.types.Predicate;
import dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repository.UserRepository;
import service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService service;

//    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<UserDto> get(@QuerydslPredicate(root = UserDto.class) Predicate predicate, Pageable pageable) {
//        return new ResponseEntity<UserDto>(service.getAll(predicate, pageable), HttpStatus.OK);
//    }
}
