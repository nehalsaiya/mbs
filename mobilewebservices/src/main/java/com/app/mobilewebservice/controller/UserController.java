package com.app.mobilewebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.mobilewebservice.entity.User;
import com.app.mobilewebservice.service.UserService;
import com.app.mobilewebservice.vo.MessageVO;
import com.app.mobilewebservice.vo.UserVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/user")
@Api(value = "User", description = "Operations pertaining to User")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "View a list of available Users", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public Iterable<User> list(Model model) {
		Iterable<User> userList = userService.listAllUsers();
		return userList;
	}
	
	@RequestMapping(value = "/updateStatus", method = RequestMethod.POST, produces = "application/json",consumes="application/json")
	public int updateStatus(@RequestBody UserVO userVO){
		System.out.println(userVO);
		int i = userService.updateUserStatus(userVO);
		return i;
	}

	@RequestMapping(value = "/updateGcm", method = RequestMethod.POST, produces = "application/json",consumes="application/json")
	public int updateGCM(@RequestBody UserVO userVO){
		System.out.println(userVO);
		int i = userService.updateUserGCM(userVO);
		return i;
	}
	
	@RequestMapping(value = "/publishMessage", method = RequestMethod.POST, produces = "application/json",consumes="application/json")
	public int updateGCM(@RequestBody MessageVO messageVO){
		System.out.println(messageVO);
		int i = userService.publishMessage(messageVO);
		return i;
	}
}