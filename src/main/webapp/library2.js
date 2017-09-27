window.addEventListener("load", function() {
	var loginData = {
						lUserID:null,
						authorization:null
					}
	
	document.getElementById("registerUserLink").addEventListener("click", function() {
		window.document.getElementById("registerUserForm").style.display = "block";
		window.document.getElementById("registerUserResults").style.display = "block";
		
		window.document.getElementById("updateUserProfileForm").style.display = "none";
		window.document.getElementById("updateUserProfileResults").style.display = "none";
		window.document.getElementById("deleteUserProfileForm").style.display = "none";
		window.document.getElementById("deleteUserProfileResults").style.display = "none";
		window.document.getElementById("logInForm").style.display = "none";
		window.document.getElementById("LogInResults").style.display = "none";
		
		window.document.getElementById("createBlogForm").style.display = "none";
		window.document.getElementById("createBlogFormResults").style.display = "none";
		window.document.getElementById("searchBlogByUserIDForm").style.display = "none";
		window.document.getElementById("searchBlogByUserIDResult").style.display = "none";
		window.document.getElementById("searchBlogByCategoryForm").style.display = "none";
		window.document.getElementById("searchBlogByCategoryResult").style.display = "none";
		window.document.getElementById("searchBlogByTitleForm").style.display = "none";
		window.document.getElementById("searchBlogByTitleResult").style.display = "none";
	});
	document.getElementById("updateUserProfileLink").addEventListener("click", function() {
		window.document.getElementById("registerUserForm").style.display = "none";
		window.document.getElementById("registerUserResults").style.display = "none";
		
		window.document.getElementById("updateUserProfileForm").style.display = "block";
		window.document.getElementById("updateUserProfileResults").style.display = "block";
		window.document.getElementById("deleteUserProfileForm").style.display = "none";
		window.document.getElementById("deleteUserProfileResults").style.display = "none";
		window.document.getElementById("logInForm").style.display = "none";
		window.document.getElementById("LogInResults").style.display = "none";
		
		window.document.getElementById("createBlogForm").style.display = "none";
		window.document.getElementById("createBlogFormResults").style.display = "none";
		window.document.getElementById("searchBlogByUserIDForm").style.display = "none";
		window.document.getElementById("searchBlogByUserIDResult").style.display = "none";
		window.document.getElementById("searchBlogByCategoryForm").style.display = "none";
		window.document.getElementById("searchBlogByCategoryResult").style.display = "none";
		window.document.getElementById("searchBlogByTitleForm").style.display = "none";
		window.document.getElementById("searchBlogByTitleResult").style.display = "none";
	});
	document.getElementById("deleteUserProfileLink").addEventListener("click", function() {
		window.document.getElementById("registerUserForm").style.display = "none";
		window.document.getElementById("registerUserResults").style.display = "none";
		
		window.document.getElementById("updateUserProfileForm").style.display = "none";
		window.document.getElementById("updateUserProfileResults").style.display = "none";
		window.document.getElementById("deleteUserProfileForm").style.display = "block";
		window.document.getElementById("deleteUserProfileResults").style.display = "block";
		window.document.getElementById("logInForm").style.display = "none";
		window.document.getElementById("LogInResults").style.display = "none";
		
		window.document.getElementById("createBlogForm").style.display = "none";
		window.document.getElementById("createBlogFormResults").style.display = "none";
		window.document.getElementById("searchBlogByUserIDForm").style.display = "none";
		window.document.getElementById("searchBlogByUserIDResult").style.display = "none";
		window.document.getElementById("searchBlogByCategoryForm").style.display = "none";
		window.document.getElementById("searchBlogByCategoryResult").style.display = "none";
		window.document.getElementById("searchBlogByTitleForm").style.display = "none";
		window.document.getElementById("searchBlogByTitleResult").style.display = "none";
	});
	document.getElementById("logInUserLink").addEventListener("click", function() {
		window.document.getElementById("registerUserForm").style.display = "none";
		window.document.getElementById("registerUserResults").style.display = "none";
		window.document.getElementById("updateUserProfileForm").style.display = "none";
		window.document.getElementById("updateUserProfileResults").style.display = "none";
		window.document.getElementById("deleteUserProfileForm").style.display = "none";
		window.document.getElementById("deleteUserProfileResults").style.display = "none";
		
		var logInStr = document.getElementById("logInUserLink").innerHTML;
		if(logInStr === "Log In") {
            window.document.getElementById("logInForm").style.display = "block";
            window.document.getElementById("LogInResults").style.display = "block";
        }else{
			loginData.lUserID = null;
			loginData.authorization = null;
			document.getElementById("logInUserLink").innerHTML == "Log In";
			window.document.getElementById("logInForm").style.display = "none";
            window.document.getElementById("LogInResults").style.display = "none";
            window.location.reload();
		}
		
		window.document.getElementById("createBlogForm").style.display = "none";
		window.document.getElementById("createBlogFormResults").style.display = "none";
		window.document.getElementById("searchBlogByUserIDForm").style.display = "none";
		window.document.getElementById("searchBlogByUserIDResult").style.display = "none";
		window.document.getElementById("searchBlogByCategoryForm").style.display = "none";
		window.document.getElementById("searchBlogByCategoryResult").style.display = "none";
		window.document.getElementById("searchBlogByTitleForm").style.display = "none";
		window.document.getElementById("searchBlogByTitleResult").style.display = "none";
	});

	document.getElementById("createBlogLink").addEventListener("click", function() {
		window.document.getElementById("registerUserForm").style.display = "none";
		window.document.getElementById("registerUserResults").style.display = "none";
		window.document.getElementById("updateUserProfileForm").style.display = "none";
		window.document.getElementById("updateUserProfileResults").style.display = "none";
		window.document.getElementById("deleteUserProfileForm").style.display = "none";
		window.document.getElementById("deleteUserProfileResults").style.display = "none";
		window.document.getElementById("logInForm").style.display = "none";
		window.document.getElementById("LogInResults").style.display = "none";

		window.document.getElementById("createBlogForm").style.display = "block";
		window.document.getElementById("createBlogFormResults").style.display = "block";

		window.document.getElementById("searchBlogByUserIDForm").style.display = "none";
		window.document.getElementById("searchBlogByUserIDResult").style.display = "none";
		window.document.getElementById("searchBlogByCategoryForm").style.display = "none";
		window.document.getElementById("searchBlogByCategoryResult").style.display = "none";
		window.document.getElementById("searchBlogByTitleForm").style.display = "none";
		window.document.getElementById("searchBlogByTitleResult").style.display = "none";
	});

	document.getElementById("searchBlogByUserLink").addEventListener("click", function() {
		window.document.getElementById("registerUserForm").style.display = "none";
		window.document.getElementById("registerUserResults").style.display = "none";
		window.document.getElementById("updateUserProfileForm").style.display = "none";
		window.document.getElementById("updateUserProfileResults").style.display = "none";
		window.document.getElementById("deleteUserProfileForm").style.display = "none";
		window.document.getElementById("deleteUserProfileResults").style.display = "none";
		window.document.getElementById("logInForm").style.display = "none";
		window.document.getElementById("LogInResults").style.display = "none";
		
		window.document.getElementById("createBlogForm").style.display = "none";
		window.document.getElementById("createBlogFormResults").style.display = "none";
		window.document.getElementById("searchBlogByUserIDForm").style.display = "block";
		window.document.getElementById("searchBlogByUserIDResult").style.display = "block";
		window.document.getElementById("searchBlogByCategoryForm").style.display = "none";
		window.document.getElementById("searchBlogByCategoryResult").style.display = "none";
		window.document.getElementById("searchBlogByTitleForm").style.display = "none";
		window.document.getElementById("searchBlogByTitleResult").style.display = "none";
	});
	
	document.getElementById("searchBlogByCategoryLink").addEventListener("click", function() {
		window.document.getElementById("registerUserForm").style.display = "none";
		window.document.getElementById("registerUserResults").style.display = "none";
		window.document.getElementById("updateUserProfileForm").style.display = "none";
		window.document.getElementById("updateUserProfileResults").style.display = "none";
		window.document.getElementById("deleteUserProfileForm").style.display = "none";
		window.document.getElementById("deleteUserProfileResults").style.display = "none";
		window.document.getElementById("logInForm").style.display = "none";
		window.document.getElementById("LogInResults").style.display = "none";
		
		window.document.getElementById("createBlogForm").style.display = "none";
		window.document.getElementById("createBlogFormResults").style.display = "none";
		window.document.getElementById("searchBlogByUserIDForm").style.display = "none";
		window.document.getElementById("searchBlogByUserIDResult").style.display = "none";
		window.document.getElementById("searchBlogByCategoryForm").style.display = "block";
		window.document.getElementById("searchBlogByCategoryResult").style.display = "block";
		window.document.getElementById("searchBlogByTitleForm").style.display = "none";
		window.document.getElementById("searchBlogByTitleResult").style.display = "none";
	});
	
	document.getElementById("searchBlogByTitleLink").addEventListener("click", function() {
		window.document.getElementById("registerUserForm").style.display = "none";
		window.document.getElementById("registerUserResults").style.display = "none";
		window.document.getElementById("updateUserProfileForm").style.display = "none";
		window.document.getElementById("updateUserProfileResults").style.display = "none";
		window.document.getElementById("deleteUserProfileForm").style.display = "none";
		window.document.getElementById("deleteUserProfileResults").style.display = "none";
		window.document.getElementById("logInForm").style.display = "none";
		window.document.getElementById("LogInResults").style.display = "none";
		
		window.document.getElementById("createBlogForm").style.display = "none";
		window.document.getElementById("createBlogFormResults").style.display = "none";
		window.document.getElementById("searchBlogByUserIDForm").style.display = "none";
		window.document.getElementById("searchBlogByUserIDResult").style.display = "none";
		window.document.getElementById("searchBlogByCategoryForm").style.display = "none";
		window.document.getElementById("searchBlogByCategoryResult").style.display = "none";
		window.document.getElementById("searchBlogByTitleForm").style.display = "block";
		window.document.getElementById("searchBlogByTitleResult").style.display = "block";
	});

	document.getElementById("searchBlogByUserIDButton").addEventListener("click", function() {
		var userID = document.getElementById("searchUserID").value;
		if(userID === ""){
			document.getElementById("blogsListByUserID").innerHTML = "UserID is empty!!";
		}else{
			var url = "public/blogger/blog/users/" + userID;
			var xhr = new XMLHttpRequest();
			xhr.open("get", url, true);
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					var blogs = JSON.parse(xhr.responseText);
					var htmlText = '';
					
					window.document.getElementById("searchBlogByUserIDForm").style.display = "none";
					
					htmlText += '<b>Total Blogs:</b> ' + blogs.length + '<br />';
					htmlText += '<hr />'
						
					for (var prop in blogs) {
						htmlText += '<b>Blog No:</b> ' + prop + '<br />';
						htmlText += '<b>Title: </b>' + blogs[prop].blogTitle + '<br />';
						htmlText += '<b>Text: </b>' + blogs[prop].blogText + '<br />';
						htmlText += '<b>Category:</b> ' + blogs[prop].blogCategory + '<br />';
						htmlText += '<b>Created by:</b> ' + blogs[prop].userID + '<br />';
						htmlText += '<hr />'
						htmlText += '</div>';
				  	}
				  	document.getElementById('blogsListByUserID').innerHTML = htmlText;
				}else if (xhr.readyState == 4 && xhr.status == 404) {
					document.getElementById("blogsListByUserID").innerHTML = "User Not Found";
				}else if (xhr.readyState == 4 && xhr.status == 405) {
					document.getElementById("blogsListByUserID").innerHTML = "Blog Not Fould";
				}else if (xhr.readyState == 4 ) {
					document.getElementById("blogsListByUserID").innerHTML = "Internal Server Error";
				}
			};
			xhr.send();
		}
		document.getElementById("searchUserID").value = "";
		//document.getElementById("blogsListByUserID").innerHTML = "";
	});
	document.getElementById("searchBlogByCategoryButton").addEventListener("click", function() {
		var category = document.getElementById("searchCategory").value;
		if(category === ""){
			document.getElementById("blogsListByCategory").innerHTML = "Category is empty!!";
		}else{
			var url = "public/blogger/blog/category/" + category;
			var xhr = new XMLHttpRequest();
			xhr.open("get", url, true);
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					var blogs = JSON.parse(xhr.responseText);
					var htmlText = '';
					
					window.document.getElementById("searchBlogByCategoryForm").style.display = "none";
					
					htmlText += '<b>Total Blogs:</b> ' + blogs.length + '<br />';
					htmlText += '<hr />'
						
					for (var prop in blogs) {
						htmlText += '<b>Blog No:</b> ' + prop + '<br />';
						htmlText += '<b>Title: </b>' + blogs[prop].blogTitle + '<br />';
						htmlText += '<b>Text: </b>' + blogs[prop].blogText + '<br />';
						htmlText += '<b>Category:</b> ' + blogs[prop].blogCategory + '<br />';
						htmlText += '<b>Created by:</b> ' + blogs[prop].userID + '<br />';
						htmlText += '<hr />'
						htmlText += '</div>';
				  	}
				  	document.getElementById('blogsListByCategory').innerHTML = htmlText;
				}else if (xhr.readyState == 4 && xhr.status == 404) {
					document.getElementById("blogsListByCategory").innerHTML = "User Not Found";
				}else if (xhr.readyState == 4 && xhr.status == 405) {
					document.getElementById("blogsListByCategory").innerHTML = "Blog Not Fould";
				}else if (xhr.readyState == 4 ) {
					document.getElementById("blogsListByCategory").innerHTML = "Internal Server Error";
				}
			};
			xhr.send();
		}
		document.getElementById("searchCategory").value = "";
	});
	document.getElementById("searchBlogByTitleButton").addEventListener("click", function() {
		var title = document.getElementById("searchTitle").value;
		
		if(title === ""){
			document.getElementById("blogsListByTitle").innerHTML = "Title is empty!!";
		}else{
			var url = "public/blogger/blog/title/" + title;
			var xhr = new XMLHttpRequest();
			xhr.open("get", url, true);
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					var blogs = JSON.parse(xhr.responseText);
					var htmlText = '';
					
					window.document.getElementById("searchBlogByTitleForm").style.display = "none";
					
					htmlText += '<b>Total Blogs:</b> ' + blogs.length + '<br />';
					htmlText += '<hr />'
					for (var prop in blogs) {
						htmlText += '<b>Blog No:</b> ' + prop + '<br />';
						htmlText += '<b>Title: </b>' + blogs[prop].blogTitle + '<br />';
						htmlText += '<b>Text: </b>' + blogs[prop].blogText + '<br />';
						htmlText += '<b>Category:</b> ' + blogs[prop].blogCategory + '<br />';
						htmlText += '<b>Created by:</b> ' + blogs[prop].userID + '<br />';
						htmlText += '<hr />'
						htmlText += '</div>';
				  	}
				  	document.getElementById('blogsListByTitle').innerHTML = htmlText;
				}else if (xhr.readyState == 4 && xhr.status == 404) {
					document.getElementById("blogsListByTitle").innerHTML = "User Not Found";
				}else if (xhr.readyState == 4 && xhr.status == 405) {
					document.getElementById("blogsListByTitle").innerHTML = "Blog Not Fould";
				}else if (xhr.readyState == 4 ) {
					document.getElementById("blogsListByTitle").innerHTML = "Internal Server Error";
				}
			};
			xhr.send();
		}
		document.getElementById("searchTitle").value = "";
	});
	document.getElementById("registerUserButton").addEventListener("click", function() {
		var userID = document.getElementById("userID").value;
		var password = document.getElementById("password").value;
		var firstName = document.getElementById("firstName").value;
		var lastName = document.getElementById("lastName").value;
		var emailID = document.getElementById("emailID").value;
		
		if(userID === ""){
			document.getElementById("registerMsg").innerHTML = "UserID is empty!!";
		} else if(password === ""){
			document.getElementById("registerMsg").innerHTML = "Password is empty!!";
		} else if(firstName === ""){
			document.getElementById("registerMsg").innerHTML = "FirstName is empty!!";
		}else if(lastName === ""){
			document.getElementById("registerMsg").innerHTML = "Last Name is empty!!";
		}else if(emailID === ""){
			document.getElementById("registerMsg").innerHTML = "Email ID is empty!!";
		} else{
			var user = {
					  "userID": userID,
					  "password": password,
					  "firstName": firstName,
					  "lastName": lastName,
					  "emailID": emailID
					}
	
			var url = "public/blogger/users/";
			var xhr = new XMLHttpRequest();
			xhr.open("POST",url);
			xhr.setRequestHeader('Content-Type', 'application/json; charset=utf-8');
	
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					var addedUser = JSON.parse(xhr.responseText);
					window.document.getElementById("registerUserForm").style.display = "none";
					document.getElementById("registerMsg").innerHTML = "User Creation Successful! well done";
				}else if (xhr.readyState == 4 && xhr.status == 406) {
					document.getElementById("registerMsg").innerHTML = "User Already Exit";
				}else if (xhr.readyState == 4 && xhr.status == 405) {
					document.getElementById("registerMsg").innerHTML = "Invalid User Details,Please check";
				}else if (xhr.readyState == 4 && xhr.status == 500) {
					document.getElementById("registerMsg").innerHTML = "Internal Server Error";
				}
			};
			xhr.send(JSON.stringify(user));
		}
		document.getElementById("userID").value = "";
		document.getElementById("password").value = "";
		document.getElementById("firstName").value = "";
		document.getElementById("lastName").value = "";
		document.getElementById("emailID").value = "";
	});

	document.getElementById("updateUserProfileButton").addEventListener("click", function() {
		var password = document.getElementById("updatedPassword").value;
		var firstName = document.getElementById("updatedFirstName").value;
		var lastName = document.getElementById("updatedLastName").value;
		var emailID = document.getElementById("updatedEmailID").value;

		if(password === ""){
			document.getElementById("updateUserProfileMsg").innerHTML = "Password is empty!!";
		} else if(firstName === ""){
			document.getElementById("updateUserProfileMsg").innerHTML = "First Name is empty!!";
		}else if(lastName === ""){
			document.getElementById("updateUserProfileMsg").innerHTML = "Last Name is empty!!";
		}else if(emailID === ""){
			document.getElementById("updateUserProfileMsg").innerHTML = "Email ID is empty!!";
		} else{
			if(loginData.lUserID === null) 
			{
				document.getElementById("updateUserProfileMsg").innerHTML = "Log In First";
			}else {
				var user = {
						  "userID": loginData.lUserID,
						  "password": password,
						  "firstName": firstName,
						  "lastName": lastName,
						  "emailID": emailID
						}
	
	            var url = "public/blogger/users/";
	            var xhr = new XMLHttpRequest();
	            xhr.open("PUT", url);
	            xhr.setRequestHeader('Content-Type', 'application/json; charset=utf-8');
	            xhr.setRequestHeader('authorization', loginData.authorization);
	
	            xhr.onreadystatechange = function () {
	                if (xhr.readyState == 4 && xhr.status == 200) {
	                		window.document.getElementById("updateUserProfileForm").style.display = "none";
	                    document.getElementById("updateUserProfileMsg").innerHTML = "User Profile Updated ";
	                } else if (xhr.readyState == 4 && xhr.status == 406) {
	                    document.getElementById("updateUserProfileMsg").innerHTML = "Failed !! User Profile Updation";
	                }
	            };
	            xhr.send(JSON.stringify(user));
	        }
		}
		document.getElementById("updatedPassword").value = "";
		document.getElementById("updatedFirstName").value = "";
		document.getElementById("updatedLastName").value = "";
		document.getElementById("updatedEmailID").value = "";
	});
	document.getElementById("deleteUserProfileButton").addEventListener("click", function() {

		if(loginData.lUserID === null) 
		{
			document.getElementById("deleteUserProfileMsg").innerHTML = "Log In First";
		}else {

            var url = "public/blogger/users/"+loginData.lUserID;
            var xhr = new XMLHttpRequest();
            xhr.open("DELETE", url);
            xhr.setRequestHeader('Content-Type', 'application/json; charset=utf-8');
            xhr.setRequestHeader('authorization', loginData.authorization);

            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
	        			loginData.lUserID = null;
	        			loginData.authorization = null;
	        			window.document.getElementById("deleteUserProfileForm").style.display = "none";
	                document.getElementById("logInUserLink").innerHTML = "Log In";
                    document.getElementById("deleteUserProfileMsg").innerHTML = "User Profile Deleted ";
                    document.getElementById("welcomeID").innerHTML = "";

                } else if (xhr.readyState == 4 && xhr.status == 406) {
                    document.getElementById("deleteUserProfileMsg").innerHTML = "Failed !! User Profile Deletion";
                }
            };
            xhr.send();
        }
	});
	document.getElementById("createBlogButton").addEventListener("click", function() {
		var blogID = "";
		var blogTitle = document.getElementById("blogTitle").value;
		var blogText = document.getElementById("blogText").value;
		var blogCategory = document.getElementById("blogCategory").value;
		var blogUserID = loginData.lUserID;

		if(blogTitle === ""){
			document.getElementById("createBlogResults").innerHTML = "Title is empty!!";
		} else if(blogText === ""){
			document.getElementById("createBlogResults").innerHTML = "Text is empty!!";	
		}else if(blogCategory === ""){
			document.getElementById("createBlogResults").innerHTML = "Category is empty!!";
		} else{
			if(loginData.lUserID !== null) {
	            var blog = {
	                "blogID": blogID,
	                "blogTitle": blogTitle,
	                "blogText": blogText,
	                "blogCategory": blogCategory,
	                "userID": blogUserID
	            }
	
	            var url = "public/blogger/blog/";
	            var xhr = new XMLHttpRequest();
	            xhr.open("POST", url);
	            xhr.setRequestHeader('Content-Type', 'application/json; charset=utf-8');
	            xhr.setRequestHeader('authorization', loginData.authorization);
	
	            xhr.onreadystatechange = function () {
	                if (xhr.readyState == 4 && xhr.status == 200) {
	                    var addedUser = JSON.parse(xhr.responseText);
	                    window.document.getElementById("createBlogForm").style.display = "none";
	                    document.getElementById("createBlogResults").innerHTML = "Blog Posted: ";
	                } else if (xhr.readyState == 4 && xhr.status == 406) {
	                    document.getElementById("createBlogResults").innerHTML = "Blog Posting Failed";
	                }
	            };
	            xhr.send(JSON.stringify(blog));
	        }else{
				document.getElementById("createBlogResults").innerHTML = "Log In First";
			}
		}
		document.getElementById("blogTitle").value = "";
		document.getElementById("blogText").value = "";
		document.getElementById("blogCategory").value = "";
	});
	document.getElementById("logINButton").addEventListener("click", function() {
		var logInUserID = document.getElementById("logInUserID").value;
		var logInpassword = document.getElementById("LogInPassword").value;
		
		if(logInUserID === ""){
			document.getElementById("LogINMsg").innerHTML = "log In User ID is empty!!";	
		}else if(logInpassword === ""){
			document.getElementById("LogINMsg").innerHTML = "log In Password is empty!!";
		} else{
			var user = getUser(logInUserID);
	
			if (user && user.password === logInpassword) {
				var url = "public/blogger/login/";
				var xhr = new XMLHttpRequest();
				xhr.open("POST", url);
				xhr.setRequestHeader('Content-Type', 'application/json; charset=utf-8');
	
				xhr.onreadystatechange = function () {
					if (xhr.readyState == 4 && xhr.status == 200) {
						loginData.authorization = xhr.getResponseHeader("authorization");
						loginData.lUserID = logInUserID;
	
						document.getElementById("welcomeID").innerHTML = "Welcome	 "+logInUserID;
						document.getElementById("logInUserLink").innerHTML = "Log Out";
						window.document.getElementById("logInForm").style.display = "none";
						
					} else if (xhr.readyState == 4 && xhr.status == 406) {
						document.getElementById("LogINMsg").innerHTML = "Log In Failed for :" + logInUserID + "reason:" + xhr.status;
					}
				};
				xhr.send(JSON.stringify(user));
			} else {
				document.getElementById("LogINMsg").innerHTML = "Wrong User ID or Password ! Retry";
			}
		}
		document.getElementById("logInUserID").value = "";
		document.getElementById("LogInPassword").value = "";
	});
});

function getUser(userID) {
		var url = "public/blogger/users/" + userID;
		var xhr = new XMLHttpRequest();
		var user = null;

		xhr.open("get", url, false);
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				user = JSON.parse(xhr.responseText);
			}
		};
		xhr.send();

		return user;
}