package lab.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lab.entity.UserInfor;
import lab.services.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	@PostMapping("/new")
	public String addUser(@RequestBody UserInfor userInfor)
	{
		return userService.addUser(userInfor);
	}
	

}
