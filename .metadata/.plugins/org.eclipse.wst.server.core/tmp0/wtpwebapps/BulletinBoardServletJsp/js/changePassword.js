document.getElementById("oldPassword").addEventListener("input",
	function() {
		document.getElementById("oldPasswordError").innerHTML = "";
	});
document.getElementById("newPassword").addEventListener("input",
	function() {
		document.getElementById("newPasswordError").innerHTML = "";
	});

document.getElementById("confirmPassword").addEventListener("input",
		function() {
			document.getElementById("confirmPasswordError").innerHTML = "";
		});
function validateForm() {
	var oldPassword = document.getElementById("oldPassword").value;
	var newPassword = document.getElementById("newPassword").value;
	var confirmPassword = document.getElementById("confirmPassword").value;
	var oldPasswordError = document.getElementById("oldPasswordError");
	var newPasswordError = document.getElementById("newPasswordError");
	var confirmPasswordError = document
		.getElementById("confirmPasswordError");

	var passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/;

	if (oldPassword === "" || newPassword === ""
		|| confirmPassword === "") {
		if (oldPassword === "") {
			oldPasswordError.innerHTML = "Old Password is required.";
		}
		if (newPassword === "") {
			newPasswordError.innerHTML = "Old Password is required.";
		}
		if (confirmPassword === "") {
			confirmPasswordError.innerHTML = "Old Password is required.";
		}
		return false;
	} else if (!passwordRegex.test(oldPassword)
		|| newPassword !== confirmPassword
		|| !passwordRegex.test(newPassword)) {
		if (!passwordRegex.test(oldPassword)) {
			oldPasswordError.innerHTML = "Password must be at least 8 characters long, contain at least 1 alphabet, and 1 special character.";

		}
		if (newPassword !== confirmPassword) {
			newPasswordError.innerHTML = "Passwords do not match.";

		}
		if (!passwordRegex.test(newPassword)) {
			newPasswordError.innerHTML = "Password must be at least 8 characters long, contain at least 1 alphabet, and 1 special character.";
		}
		return false;
	} else {
		oldPasswordError.innerHTML = "";
		newPasswordError.innerHTML = "";
		confirmPasswordError.innerHTML = "";
	}
}