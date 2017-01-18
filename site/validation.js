function regval()
{
	
var name=window.document.getElementById("name").value;
var usn=window.document.getElementById("usn").value;
var pass=window.document.getElementById("pass").value;
var sex=window.document.getElementById("sex");
var sex1=window.document.getElementById("sex1");
var phno=window.document.getElementById("phno").value;
var reg=window.document.getElementById("reg").value;
var email=window.document.getElementById("em").value;
var address=window.document.getElementById("add").value;
var flag=1;

if(name=="" || usn=="" || pass=="" ||  phno=="" || email==""|| address=="")
{
	alert("Please enter all the details");
	flag=0;
}
else
{
//var re = new RegExp("/^[A-Za-z]+$/");
//alert("Name is "+name);
//if (!(isNaN(name))
var re = new RegExp("/^[A-Za-z]+$/");
//if (re.test(name)) 
if (!/^[a-zA-Z]*$/g.test(name))
{
    flag=0;
 alert("Name should only have characters");
}
 

var re1 = new RegExp("^([a-zA-Z0-9])$");
//if (re1.test(usn)) 
if( /[^a-zA-Z0-9]/.test( usn) )
{
    flag=0;
	alert("User name should not have special characters");
}
 
 
var re2= new RegExp("^([0-9]{10})$");
if (!re2.test(phno)) 
{
    flag=0;  
  alert("Phone number should have only number and of 10 digits");
	
}
 
 
var re3 =new RegExp( /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/);
if (!re3.test(email)) 
{
  flag=0;
	alert("Enter a vaild email id");
	
}
 

var re1 = new RegExp("^([a-zA-Z0-9])$");
if (re1.test(address)) 
{
    flag=0;
	alert("Address should not have special characters");
}

if(reg=="")
{
	alert("Choose a mode of payment");
}
if(sex.checked==false)
{
	if(sex1.checked==false)
	{
		alert("Please select a gender");
		flag=0;
	}
}
 
}




if(flag==0)
{
	alert("Please enter all the details correctly");
}
else{

	alert("Signup completed");
}
}

/////////////////////////////////////////////////////////booking///////////////////////////////////////////////////////

function bkval()
{

var cname=window.document.getElementById("name").value;
var dl=window.document.getElementById("dl").value;

var sex=window.document.getElementById("sex");
var sex1=window.document.getElementById("sex1");
var phno=window.document.getElementById("phno").value;

var email=window.document.getElementById("em").value;
var address=window.document.getElementById("add").value;
var flag=1;

if(cname=="" || dl=="" || phno=="" || email==""|| address=="")
{
	alert("Please enter all the details");
	flag=0;
}
else
{
var re = new RegExp("/^[A-Za-z]+$/");
//if (re.test(cname))
if (!/^[a-zA-Z]*$/g.test(cname))	
{
    flag=0;
 alert("Name should only have characters");
}
 

var re1 = new RegExp("^([a-zA-Z0-9])$");
//if (re1.test(dl)) 
if( /[^a-zA-Z0-9]/.test( dl) )
{
    flag=0;
	alert("Driving licence should not have special characters");
}
 
 
var re2= new RegExp("^([0-9]{10})$");
if (!re2.test(phno)) 
{
    flag=0;  
  alert("Phone number should have only number and of 10 digits");
	
}
 
 
var re3 =new RegExp( /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/);
if (!re3.test(email)) 
{
  flag=0;
	alert("Enter a vaild email id");
	
}
 

var re1 = new RegExp("^([a-zA-Z0-9])$");
if (re1.test(address)) 
{
    flag=0;
	alert("Address should not have special characters");
}


if(sex.checked==false)
{
	if(sex1.checked==false)
	{
		alert("Please select a gender");
		flag=0;
	}
}
	
}

if(flag==0)
{
	alert("Please enter all the details correctly");
}
else{

	alert("Signup completed");
}
}