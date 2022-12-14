package com.basic.snsbasic.controller;

import com.basic.snsbasic.controller.reponse.Response;
import com.basic.snsbasic.controller.reponse.UserJoinResponse;
import com.basic.snsbasic.controller.request.UserJoinRequest;
import com.basic.snsbasic.model.User;
import com.basic.snsbasic.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // TODO : implement
    @PostMapping("/join")
    public Response<UserJoinResponse> join(@RequestBody UserJoinRequest request) {
        User user = userService.join(request.getUserName(), request.getPassword());
        return Response.success(UserJoinResponse.fromUser(user));
    }
}
