package com.cimarasah.user.client.service;




import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cimarasah.user.client.config.ServiceConfiguration;
import com.cimarasah.user.client.model.AuthRequest;
import com.cimarasah.user.client.model.AuthResponse;


@FeignClient(name = "${auth.api.name}", url = "${auth.api.uri}", configuration = ServiceConfiguration.class)
public interface AuthClient {

	@RequestMapping(method = RequestMethod.POST, value = "/auth-service/auth/generateToken", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	AuthResponse auth(@RequestBody AuthRequest authRequest);
}
