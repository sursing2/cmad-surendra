package com.cmad.api;

import java.io.IOException;
import java.security.Key;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import io.jsonwebtoken.Jwts;

import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;

@Provider
@UserAuthontiationNeeded
@Priority(Priorities.AUTHENTICATION)
public class UserAuthonticationFilter implements ContainerRequestFilter{
	
	
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {

		String authorizationHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
		System.out.println("UserAuthonticationFilter.filter():authorizationHeader:"+authorizationHeader);

		// Check if the HTTP Authorization header is present and formatted correctly
		if (authorizationHeader == null || !authorizationHeader.startsWith("BloggerKey")) {
			System.out.println("UserAuthonticationFilter.filter():invalid authorizationHeader :"+authorizationHeader);
			throw new NotAuthorizedException("Authorization header must be provided");
		}

		// Extract the token from the HTTP Authorization header
		String token = authorizationHeader.substring("BloggerKey:".length()).trim();

		try {

			// Validate the token
			Key key = KeyGenerator.INSTANCE.generateKey();
			Jwts.parser().setSigningKey(key).parseClaimsJws(token);

			System.out.println("UserAuthonticationFilter.filter()::valid token"+token);

		} catch (Exception e) {
			System.out.println("UserAuthonticationFilter.filter()::invalid token:"+token);
			requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
		}
	}
}
