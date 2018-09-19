package com.cimarasah.user.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cimarasah.user.rest.request.UserRequest;
import com.cimarasah.user.rest.resource.UserResource;
import com.cimarasah.user.rest.response.UserResponse;
import com.cimarasah.user.service.UserService;

@RestController
public class UserController implements UserResource{
	
	
	private UserService service;
	
	@Inject
	public UserController(UserService service) {
		this.service = service;
	}

	@Override
	public ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest userRequest) {
		return ResponseEntity.ok(service.save(userRequest));
	}

	@Override
	public ResponseEntity<List<UserResponse>> getUserList() {
		return ResponseEntity.ok(service.listUser());
	}

	@Override
	public void deleteUser(long idUser) {
		service.delete(idUser);
		
	}

	@Override
	public ResponseEntity<UserResponse> findUser(long idUser) {
		return ResponseEntity.ok(service.findOne(idUser));
	}

	
	
}
