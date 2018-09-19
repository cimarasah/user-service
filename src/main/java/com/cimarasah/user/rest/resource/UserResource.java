package com.cimarasah.user.rest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cimarasah.user.rest.request.UserRequest;
import com.cimarasah.user.rest.response.UserResponse;

import java.util.List;

import org.springframework.http.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "API de Usuario")
@RequestMapping("/user")
public interface UserResource {
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = UserResponse.class),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@ApiOperation(value = "Salvar Usuário")
	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest userRequest);
	
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = UserResponse.class),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@ApiOperation(value = "Listar Usuário")
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseEntity<List<UserResponse>> getUserList();
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = UserResponse.class),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@ApiOperation(value = "Deletar Usuário")
	@PostMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	void deleteUser(@RequestBody long idUser);
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = UserResponse.class),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@ApiOperation(value = "Buscar Usuário")
	@GetMapping(value = "/find", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseEntity<UserResponse> findUser(@RequestBody long idUser);
	
}
