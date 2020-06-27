package org.spring.demo.web.controller;

import org.spring.demo.entry.po.User;
import org.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/{id}")
	public User getUserByid(@PathVariable("id") Integer id) {

		User user = userService.selectUserById(id);

		return user;
	}
}
