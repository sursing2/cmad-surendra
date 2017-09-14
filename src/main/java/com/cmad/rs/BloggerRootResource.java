package com.cmad.rs;

import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.cmad.api.Blog;
import com.cmad.api.BlogController;
import com.cmad.api.BlogNotFoundException;
import com.cmad.api.BloggerException;
import com.cmad.api.DuplicateUserException;
import com.cmad.api.InvalidBlogException;
import com.cmad.api.InvalidUserException;
import com.cmad.api.KeyGenerator;
import com.cmad.api.User;
import com.cmad.api.UserAuthontiationNeeded;
import com.cmad.api.UserNotFoundException;
import com.cmad.api.UsersController;
import com.cmad.biz.BlogControllerImpl;
import com.cmad.biz.UsersControllerImpl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Path("/blogger")
public class BloggerRootResource {
	static UsersController userController = new UsersControllerImpl();
	static BlogController blogController = new BlogControllerImpl();

	@Context
	private UriInfo uriInfo;

	@GET
	@Path("/users/{userID}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response readUser(@PathParam("userID") String userID) {
		try {
			User user = userController.readUser(userID);
			return Response.ok().entity(user).build();
		} catch (UserNotFoundException une) {
			return Response.status(404).build();
		} catch (BloggerException be) {
			return Response.status(500).build();
		}
	}

	@DELETE
	@Path("/users/{userID}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@UserAuthontiationNeeded
	public Response delteUser(@PathParam("userID") String userID) {
		try {
			userController.deleteUser(userID);
			return Response.ok().build();
		} catch (UserNotFoundException une) {
			return Response.status(404).build();
		} catch (BloggerException be) {
			return Response.status(500).build();
		}
	}

	@POST
	@Path("/users/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createUser(User user) {
		System.out.println("BloggerRootResource.createUser():"+ user.getUserID());
		try {
			userController.createUser(user);
			return Response.ok().entity(user).build();
		} catch (InvalidUserException iue) {
			return Response.status(405).build();
		} catch (DuplicateUserException due) {
			return Response.status(406).build();
		} catch (BloggerException be) {
			return Response.status(500).build();
		}
	}

	@PUT
	@Path("/users/")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@UserAuthontiationNeeded
	public Response updateUser(User user) {
		System.out.println("BloggerRootResource.updateUser()");
		try {
			userController.updateUser(user);
			return Response.ok().build();
		} catch (InvalidUserException iue) {
			return Response.status(405).build();
		} catch (UserNotFoundException due) {
			return Response.status(406).build();
		} catch (BloggerException be) {
			return Response.status(500).build();
		}
	}

	@GET
	@Path("/users/")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	public Response readAllUser() {
		System.out.println("BloggerRootResource.readAllUser()");
		try {
			List<User> users = userController.readAllUsers();
			 GenericEntity<List<User>> list = new GenericEntity<List<User>>(users){};
			System.out.println("User read1:  "+ list);
			return Response.ok().entity(list).build();
		} catch (InvalidUserException iue) {
			System.out.println("Exception :" +  iue);
			return Response.status(405).build();
		} catch (DuplicateUserException due) {
			System.out.println("Exception :" +  due);
			return Response.status(406).build();
		} catch (BloggerException be) {
			System.out.println("Exception :" +  be);
			return Response.status(500).build();
		} catch (Exception be) {
			System.out.println("Exception :" +  be);
			return Response.status(500).build();
		}
	}
	//----------------------------------blogs------------------------------------------------------	
	@POST
	@Path("/blog/")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@UserAuthontiationNeeded
	public Response createBlog(Blog blog) {
		System.out.println("BloggerRootResource.createBlog()");	
		try {
			blogController.create(blog);
			return Response.ok().entity(blog).header("location", "/public/blog/" + blog.getBlogID()).build();
		} catch (InvalidUserException iue) {
			return Response.status(405).build();
		} catch (DuplicateUserException due) {
			return Response.status(406).build();
		} catch (BloggerException be) {
			return Response.status(500).build();
		}
	}

	@GET
	@Path("/blog/{blogID}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response readBlog(@PathParam("blogID") String blogID) {
		System.out.println("BloggerRootResource.ReadBlog()");
		try {
			Blog blog = blogController.readByBlogID(blogID);
			return Response.ok().entity(blog).build();
		} catch (BlogNotFoundException une) {
			return Response.status(404).build();
		} catch (BloggerException be) {
			return Response.status(500).build();
		}
	}

	@GET
	@Path("/blog/users/{userID}/")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response readBlogByUserID(@PathParam("userID") String userID) {
		System.out.println("BloggerRootResource.ReadBlog()");
		try {
			List<Blog> blog = blogController.readByUserID(userID);
			return Response.ok().entity(blog).build();
		} catch (BlogNotFoundException une) {
			return Response.status(404).build();
		} catch (BloggerException be) {
			return Response.status(500).build();
		}
	}

	@GET
	@Path("/blog/")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response readBlogByCategory(@QueryParam("category") String category) {
		System.out.println("BloggerRootResource.readBlogByCategory()"+category);
		try {
			List<Blog> blogs = blogController.readByCategory(category);
			return Response.ok().entity(blogs).build();
		} catch (BlogNotFoundException une) {
			return Response.status(404).build();
		} catch (BloggerException be) {
			return Response.status(500).build();
		}
	}
	@PUT
	@Path("/blog/")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@UserAuthontiationNeeded
	public Response updateBlog(Blog blog) {
		System.out.println("BloggerRootResource.updateBlog()");
		try {
			blogController.update(blog);
			return Response.ok().build();
		} catch (InvalidBlogException iue) {
			return Response.status(405).build();
		} catch (BlogNotFoundException due) {
			return Response.status(406).build();
		} catch (BloggerException be) {
			return Response.status(500).build();
		}
	}

	@DELETE
	@Path("/blog/{blogID}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@UserAuthontiationNeeded
	public Response delteBlog(@PathParam("blogID") String blogID) {
		System.out.println("BloggerRootResource.delteBlog()");
		try {
			blogController.delete(blogID);
			return Response.ok().build();
		} catch (BlogNotFoundException une) {
			return Response.status(404).build();
		} catch (BloggerException be) {
			return Response.status(500).build();
		}
	}

	//-----------Login & Logout-----------------------------------------

	@POST
	@Path("/login/")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response authenticateUser(User user) {
		try {
			userController.authonticateUser(user);
			String token = issueToken(user);

			//			// Return the token on the response
			return Response.ok().header(HttpHeaders.AUTHORIZATION, "BloggerKey:" + token).build();

		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).build();
		}


	}

	@POST
	@Path("/logout/")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response dauthenticateUser(User user) {
		try {
			userController.authonticateUser(user);
			String token = issueToken(user);

			// Return the token on the response
			return Response.ok().header(HttpHeaders.AUTHORIZATION, "BloggerKey:" + token).build();

		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).build();
		}
	}

	private String issueToken(User user) {
		KeyGenerator keyGenerator = new KeyGenerator();

		Key key = keyGenerator.generateKey();
		System.out.println("BloggerRootResource.issueToken():key:"+key);

		String jwtToken = Jwts.builder()
				.setSubject(user.getUserID())
				.setIssuer(uriInfo.getAbsolutePath().toString())
				.setIssuedAt(new Date())
				.setExpiration(toDate(LocalDateTime.now().plusSeconds(300L)))
				.signWith(SignatureAlgorithm.HS512, key)
				.compact();
		System.out.println("BloggerRootResource.issueToken():jwtToken:"+jwtToken+"-"+key.toString());
		return jwtToken;
	}

	private Date toDate(LocalDateTime localDateTime) {
		return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
	}
}
