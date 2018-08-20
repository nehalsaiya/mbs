package com.app.mobilewebservice.service;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mobilewebservice.entity.User;
import com.app.mobilewebservice.repo.UserRepository;
import com.app.mobilewebservice.util.FcmNotif;
import com.app.mobilewebservice.vo.MessageVO;
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

	@Transactional
	public int updateUserGCM(UserVO userVO) {
		// TODO Auto-generated method stub
		return userRepository.updateUserGCM(userVO.getUid(),userVO.getGcmId());
	}

	@Transactional
	public int publishMessage(MessageVO messageVO) {
		List<User> users = userRepository.findByStatus(true);
		int flag=1;
		for (User user : users) {
			try {
				FcmNotif.pushFCMNotification(user.getGcmId(), messageVO.getTitle(), messageVO.getMessage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				flag=0;
			}
		}
		return 1;
	}

	
}
