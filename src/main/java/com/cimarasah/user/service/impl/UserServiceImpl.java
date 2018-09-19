package com.cimarasah.user.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cimarasah.user.converter.UserConverter;
import com.cimarasah.user.repository.UserRepository;
import com.cimarasah.user.rest.request.UserRequest;
import com.cimarasah.user.rest.response.UserResponse;
import com.cimarasah.user.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	

	private UserRepository repository;
	private UserConverter converter = new UserConverter();
	
	
	@Inject
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserResponse save(UserRequest user) {
		return converter.parseForResponse(
				repository.save(converter.parseForEntity(user)));
		
	}

	@Override
	public List<UserResponse> listUser() {
		
		return converter.parseForListResponse(
				repository.findAll());
	}

	@Override
	public UserResponse findOne(long idUser) {
		
		return converter.parseForResponse(repository.getOne(idUser));
	}

	@Override
	public void delete(long idUser) {
		repository.deleteById(idUser);
	}

}
