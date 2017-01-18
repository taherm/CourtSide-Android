function log()
		{
		var uid=window.document.getElementById("txt").value;
		var pass=window.document.getElementById("pwd").value;
		
		if(uid=="user" && pass=="user")
		{
			
		   window.location.href ='index.html';
		   alert("Welcome");
		}
		else
		{
		alert("Invalid username or password");
		}
		}