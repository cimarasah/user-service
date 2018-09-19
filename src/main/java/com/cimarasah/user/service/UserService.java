package com.cimarasah.user.service;

import java.util.List;

import com.cimarasah.user.rest.request.UserRequest;
import com.cimarasah.user.rest.response.UserResponse;

public interface UserService {

	public UserResponse save(UserRequest user);

	public List<UserResponse> listUser();
	
	public UserResponse findOne(long idUser);
	
	public void delete(long idUser);
	
}
