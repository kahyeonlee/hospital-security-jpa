package com.example.hospitaljpa.controller;

import com.example.hospitaljpa.domain.Response;
import com.example.hospitaljpa.domain.dto.UserDto;
import com.example.hospitaljpa.domain.dto.UserJoinRequest;
import com.example.hospitaljpa.domain.dto.UserJoinResponse;
import com.example.hospitaljpa.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public Response<UserJoinResponse> join(@RequestBody UserJoinRequest userJoinRequest) {
        UserDto userDto = userService.join(userJoinRequest);
        return Response.success(new UserJoinResponse(userDto.getUserName(),userDto.getEmail()));
    }

    //Client → Controller → Service → Dto → Response<T> → UserJoinResponse → Client

}
