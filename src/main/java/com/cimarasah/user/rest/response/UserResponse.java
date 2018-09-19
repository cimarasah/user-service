package com.cimarasah.user.rest.response;

import io.swagger.annotations.ApiModelProperty;

public class UserResponse {

		@ApiModelProperty(value = "Id do usuário")
		private Long id;

		@ApiModelProperty(value = "Nome do usuário")
		private String name;
		
		@ApiModelProperty(value = "Login do usuário")
		private String username;
		
		@ApiModelProperty(value = "E-mail do usuário")
		private String email;
		
		@ApiModelProperty(value = "Senha do usuário")
		private String password;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String userName) {
			this.username = userName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
}
