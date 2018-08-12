package com.app.mobilewebservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mobilewebservice.entity.User;
import com.app.mobilewebservice.repo.UserRepository;
import com.app.mobilewebservice.vo.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public Iterable<User> listAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Transactional
	public int updateUserStatus(UserVO userVO) {
		// TODO Auto-generated method stub
		return userRepository.updateUserStatus(userVO.getUid(),userVO.isStatus());
	}

	
}
