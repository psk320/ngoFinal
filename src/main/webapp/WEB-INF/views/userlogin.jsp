<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Register</title>
 
	<!-- Meta-Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <meta name="keywords" content="Space Register Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <!-- //Meta-Tags -->

	<!-- css files -->
	<!--  <link href="css/style3.css" rel="stylesheet" type="text/css" media="all" />-->
	<!-- css files -->

	<!-- Online-fonts -->
	<link href="//fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext,vietnamese" rel="stylesheet">
	<!-- //Online-fonts -->
<style> 


html,body,div,span,applet,object,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,a,abbr,acronym,address,big,cite,code,del,dfn,em,img,ins,kbd,q,s,samp,small,strike,strong,sub,sup,tt,var,b,u,i,dl,dt,dd,ol,nav ul,nav li,fieldset,form,label,legend,table,caption,tbody,tfoot,thead,tr,th,td,article,aside,canvas,details,embed,figure,figcaption,footer,header,hgroup,menu,nav,output,ruby,section,summary,time,mark,audio,video{margin:0;padding:0;border:0;font-size:100%;font:inherit;vertical-align:baseline;}
article, aside, details, figcaption, figure,footer, header, hgroup, menu, nav, section {display: block;}
ol,ul{list-style:none;margin:0px;padding:0px;}
blockquote,q{quotes:none;}
blockquote:before,blockquote:after,q:before,q:after{content:'';content:none;}
table{border-collapse:collapse;border-spacing:0;}
/* start editing from here */
a{text-decoration:none;}
.txt-rt{text-align:right;}/* text align right */
.txt-lt{text-align:left;}/* text align left */
.txt-center{text-align:center;}/* text align center */
.float-rt{float:right;}/* float right */
.float-lt{float:left;}/* float left */
.clear{clear:both;}/* clear float */
.pos-relative{position:relative;}/* Position Relative */
.pos-absolute{position:absolute;}/* Position Absolute */
.vertical-base{	vertical-align:baseline;}/* vertical align baseline */
.vertical-top{	vertical-align:top;}/* vertical align top */
nav.vertical ul li{	display:block;}/* vertical menu */
nav.horizontal ul li{	display: inline-block;}/* horizontal menu */
img{max-width:100%;}
/*end reset*/
body{
	font-family: 'Montserrat', sans-serif;
	margin:0;
	background: url(file:///C:/ngomanagementpro/src/main/webapp/WEB-INF/views/images/bg.jpg) no-repeat;
    background-size: cover;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    -ms-background-size: cover;
    background-attachment: fixed;
	background-position: center;
}
body a{
	transition: 0.5s all;
	-webkit-transition: 0.5s all;
	-o-transition: 0.5s all;
	-moz-transition: 0.5s all;
	-ms-transition: 0.5s all;
}
 ul{
	padding: 0;
	margin: 0;
}
h1,h2,h3,h4,h5,h6{
	margin:0;
	padding:0;
}
p{
	padding: 0;
	margin: 0;
	color:#999;
}
/*-- main --*/
.main {
	text-align: center;
}
h1.logo-w3  {
    font-size: 3em;
    text-transform: uppercase;
    letter-spacing: 4px;
    color: #ffffff;
	text-align:center;
	margin: 5% 0;
	width: 100%;
}
.w3layouts-main h2 {
	color:  #ffffff;
    font-size: 29px;
    letter-spacing: 2px;
    text-transform: uppercase;
    margin-bottom: 30px;
	text-align: center;
}
.w3layouts-main{
    max-width: 420px;
    margin: 0 auto;
    background:rgba(0, 0, 0, 0.2);
	text-align: center;
    -webkit-box-shadow: 0px 0px 20px 0px rgba(0, 0, 0, 0.75);
    -moz-box-shadow: 0px 0px 20px 0px rgba(0, 0, 0, 0.75);
    box-shadow: 0px 0px 20px 0px rgba(0, 0, 0, 0.75);
}
.w3layouts-main{
	padding: 40px 30px;
}
input[type="text"], input[type="email"], input[type="password"] {
    width: 100%;
    padding: 15px;
    outline: none;
    font-size: 15px;
    font-weight: 100;
    color: #fff;
    margin-bottom: 20px;
	font-family: 'Montserrat', sans-serif;
    border: 1px solid #fff;
    background: transparent;
    background:rgba(0, 0, 0, 0.2);
    letter-spacing: 1px;
    border-radius: 3px;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	-ms-border-radius:3px;
	-o-border-radius: 3px;
    box-sizing: border-box;
}
input[type="submit"] {
    width: 100%;
    padding: 14px 30px;
    font-size: 14px;
    border-radius: 3px;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	-ms-border-radius:3px;
	-o-border-radius: 3px;
    text-transform: uppercase;
    letter-spacing: 1px;
    background: #fff;
    color: #333;
    border: none;
    outline: none;
    cursor: pointer;
	font-family: 'Montserrat', sans-serif;
    transition: 0.5s all;
    -webkit-transition: 0.5s all;
    -o-transition: 0.5s all;
    -moz-transition: 0.5s all;
    -ms-transition: 0.5s all;
}
input[type="submit"]:hover {
    background: #ff4f81;
    color: #fff;
	transition:0.5s all;
	-webkit-transition:0.5s all;
	-o-transition:0.5s all;
	-moz-transition:0.5s all;
	-ms-transition:0.5s all;
}
.w3layouts-main2 input[type="submit"] {
    margin: 27px auto 31px;
}
/*--placeholder-color--*/

::-webkit-input-placeholder{
	color: #fff;
}

:-moz-placeholder { /* Firefox 18- */
	color: #fff;
}

::-moz-placeholder {  /* Firefox 19+ */
	color: #fff;
}

:-ms-input-placeholder {  
	color: #fff;
}
/*--//placeholder-color--*/
/*-- //main --*/

/*--footer--*/
.footer-w3l p {
    margin: 3.5em 0em 0em;
    color: #fff;
    font-size: 15px;
    font-weight: 300;
    letter-spacing: 2px;
    line-height: 26px;
}
.footer-w3l a {
    color:#999;
	font-family: 'Montserrat', sans-serif;
}
.footer-w3l a:hover {
    color:#fff;
    text-decoration: underline;
}
/*--//footer--*/

/*--responsive--*/

@media(max-width: 1600px){
	h1.logo-w3 {
		margin: 1em 0;
	}
}
@media(max-width: 1440px){
	h1.logo-w3 {
		font-size: 2.8em;
	}
}
@media(max-width: 1366px){
	h1.logo-w3 {
		font-size: 2.7em;
	}
	.footer-w3l p {
		margin: 3em 0em 2em;
	}
}
@media(max-width: 1280px){
	h1.logo-w3 {
		font-size: 2.8em;
	}
	.footer-w3l p {
		margin: 4.5em 0em 0em;
	}
}
@media(max-width: 1080px){
	h1.logo-w3 {
		font-size: 2.7em;
		letter-spacing: 3px;
	}
	.w3layouts-main h2 {
		font-size: 27px;
	}
}
@media(max-width: 1050px){
}
@media(max-width: 1024px){
	h1.logo-w3 {
		font-size: 2.6em;
	}
	.w3layouts-main h2{
		font-size: 26px;
	}
	.footer-w3l p {
		margin: 2em 0em;
	}
}
@media(max-width: 991px){
	h1.logo-w3 {
		font-size: 2.5em;
		margin: 1em 0;
	}
	.w3layouts-main h2 {
		font-size: 25px;
	}
	input[type="submit"] {
		padding: 14px 30px;
		font-size: .875em;
	}
}
@media(max-width: 800px){
	h1.logo-w3 {
		font-size: 2.4em;
		letter-spacing: 2px;
	}
}
@media(max-width: 736px){
	h1.logo-w3 {
		font-size: 2.3em;
	}
	.footer-w3l p {
		font-size: 14px;
		letter-spacing: 1px;
	}
}
@media(max-width: 667px){
	h1.logo-w3 {
		font-size: 2em;
		letter-spacing: 1px;
	}
	.w3layouts-main h2 {
		font-size: 23px;
	}
}
@media(max-width: 568px){
	.footer-w3l p {
		margin: 2em;
	}
}
@media(max-width: 480px){
	h1.logo-w3 {
		font-size: 1.8em;
	}
	.w3layouts-main h2 {
		font-size: 20px;
		letter-spacing: 1px;
	}
	.footer-w3l p {
		margin: 2em 1em;
	}
	.w3layouts-main {
		max-width: 350px;
	}
}
@media(max-width: 414px){
	h1.logo-w3 {
		font-size: 1.7em;
		line-height: 1.4;
	}
	.footer-w3l p {
		font-size: 14px;
	}
	.w3layouts-main {
		max-width: 300px;
	}
	input[type="text"], input[type="email"], input[type="password"] {
		padding: 12px 15px;
	}
@media(max-width: 375px){
	.w3layouts-main {
		max-width: 280px;
	}
}
@media(max-width: 320px){
	h1.logo-w3 {
		font-size: 1.4em;
	}
	.w3layouts-main h2 {
		font-size: 19px;
		letter-spacing: 0px;
	}
	.footer-w3l p {
		font-size: 13px;
		margin: 2em 0em 1.5em;
	}
}
/*--//responsive--*/


</style>
</head>
<body>

	<!-- Main Content -->
	<div class="main">
		<div class="main-w3l">
			<h1 class="logo-w3">Register Form</h1>
			<div class="w3layouts-main">
				<h2><span>Register now</span></h2>
					<form:form action="saveUser" method="post" modelAttribute="user">
					<form:hidden path="id"/>
						<form:input placeholder="User Name" name="name" id="name" type="text" required="" path="firstName"/>
						<form:input placeholder="Last Name" name="lname" type="text" required="" path="lastName"/>
						<form:input placeholder="Email" name="email" type="email" required="" path="e_mail"/>
						<form:input placeholder="Age" name="age" type="text" required="" path="age"/>
						<form:input placeholder="Gender" name="gender" type="text" required="" path="gender"/>
						<form:input placeholder="Password" name="password"  type="password"  id="password1" required="" path="password"/>
						<form:input placeholder="Confirm Password" name="Password" type="password"  id="password2" required="" path="confirmpass"/>
						<form:button type="submit" value="Register" name="login"> Submit</form:button>
					</form:form>
			</div>
			<!-- //main -->
			
			<!-- password-script -->
			<script>
				window.onload = function () {
					document.getElementById("password1").onchange = validatePassword;
					document.getElementById("password2").onchange = validatePassword;
				}

				function validatePassword() {
					var pass2 = document.getElementById("password2").value;
					var pass1 = document.getElementById("password1").value;
					if (pass1 != pass2)
						document.getElementById("password2").setCustomValidity("Passwords Don't Match");
					else
						document.getElementById("password2").setCustomValidity('');
					//empty string means no validation error
				}
			</script>
			<!-- //password-script -->

		</div>
	</div>
	<!-- //Main Content -->

</body>
</html>
