package com.damoya.ens;

import com.damoya.ens.authentication.domain.User;
import com.damoya.ens.authentication.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
@RequiredArgsConstructor
public class HomeController {
  private final UserService userService;

  @Operation(summary = "홈 화면", description = "Swagger 문서의 홈 화면 API")
  @ApiResponse(responseCode = "200", description = "정상 응답")
  @GetMapping
  public List<User> home() {
    return userService.getAllUsers();
  }
}
