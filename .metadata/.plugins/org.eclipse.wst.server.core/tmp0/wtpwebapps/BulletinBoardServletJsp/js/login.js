document.getElementById("username").addEventListener("input",
	function() {
		document.getElementById("username-error").innerHTML = "";
	});
document.getElementById("password").addEventListener("input",
	function() {
		document.getElementById("password-error").innerHTML = "";
	});

function validateForm() {
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	var usernameError = document.getElementById("username-error");
	var passwordError = document.getElementById("password-error");

	if (username == "") {
		usernameError.innerHTML = "First Name is required.";
		return false;
	} else {
		usernameError.innerHTML = "";
	}
	if (password == "") {
		passwordError.innerHTML = "Password is required.";
		return false;
	} else {
		passwordError.innerHTML = "";
	}
}