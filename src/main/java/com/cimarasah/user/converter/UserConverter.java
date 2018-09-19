package com.cimarasah.user.converter;

import java.util.ArrayList;
import java.util.List;

import com.cimarasah.user.repository.entity.UserEntity;
import com.cimarasah.user.rest.request.UserRequest;
import com.cimarasah.user.rest.response.UserResponse;

public class UserConverter {

	public UserEntity parseForEntity(UserRequest request) {
		UserEntity entity = new UserEntity();
		entity.setId(request.getId());
		entity.setName(request.getName());
		entity.setUsername(request.getUsername());
		entity.setEmail(request.getEmail());
		entity.setPassword(request.getPassword());
		
		return entity;
		
	}
	
	public UserResponse parseForResponse(UserEntity entity) {
		UserResponse response = new UserResponse();
		response.setId(entity.getId());
		response.setName(entity.getName());
		response.setUsername(entity.getUsername());
		response.setEmail(entity.getEmail());
		response.setPassword(entity.getPassword());
		
		return response;
		
	}
	
	public List<UserResponse> parseForListResponse(List<UserEntity> listEntity) {
		List<UserResponse> listResponse = new ArrayList<UserResponse>();
		for (UserEntity entity : listEntity) {
			listResponse.add(this.parseForResponse(entity));
		}
		return listResponse;
	}
	
	public List<UserEntity> parseForListEntity(List<UserRequest> listRequest) {
		List<UserEntity> listEntity = new ArrayList<UserEntity>();
		for (UserRequest request : listRequest) {
			listEntity.add(this.parseForEntity(request));
		}
		return listEntity;
	}
	
}
