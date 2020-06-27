package org.spring.demo.service.impl;

import org.spring.demo.dao.mapper.UserMapper;
import org.spring.demo.entry.po.User;
import org.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectUserById(Integer id) {

		return userMapper.selectById(id);
	}

}
