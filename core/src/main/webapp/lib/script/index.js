$(document).ready(function(){
	$("#submit").click(function(){
		var userName = $("#username").val();
		var passWord = $("#password").val();
		if(userName == ""){
			alert('用户名为空，请输入用户名！');
		}
		if(passWord == ""){
			alert('密码为空，请输入用户名！');
		}
	});
	
});