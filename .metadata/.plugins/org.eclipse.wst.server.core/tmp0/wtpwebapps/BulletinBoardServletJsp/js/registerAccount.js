
		document.getElementById("firstName").addEventListener("input",
				function() {
					document.getElementById("firstName-error").innerHTML = "";
				});

		document.getElementById("lastName").addEventListener("input",
				function() {
					document.getElementById("lastName-error").innerHTML = "";
				});

		document.getElementById("address").addEventListener("input",
				function() {
					document.getElementById("address-error").innerHTML = "";
				});

		document.getElementById("email").addEventListener("input", function() {
			document.getElementById("email-error").innerHTML = "";
		});

		document.getElementById("dob").addEventListener("input", function() {
			document.getElementById("dob-error").innerHTML = "";
		});

		document.getElementById("pass").addEventListener("input", function() {
			document.getElementById("password-error").innerHTML = "";
		});
		
		document.getElementById("re_pass").addEventListener("input", function() {
			document.getElementById("repassword-error").innerHTML = "";
		});

		document.getElementById("contact").addEventListener("input",
				function() {
					document.getElementById("contact-error").innerHTML = "";
				});

		function validateForm() {
			var password = document.getElementById("pass").value;
			var repeatPassword = document.getElementById("re_pass").value;
			var passwordError = document.getElementById("password-error");
			var repasswordError = document.getElementById("repassword-error");

			var firstName = document.getElementById("firstName").value;
			var firstNameError = document.getElementById("firstName-error");

			var lastName = document.getElementById("lastName").value;
			var lastNameError = document.getElementById("lastName-error");

			var address = document.getElementById("address").value;
			var addressError = document.getElementById("address-error");

			var email = document.getElementById("email").value;
			var emailError = document.getElementById("email-error");

			var dob = document.getElementById("dob").value;
			var dobError = document.getElementById("dob-error");

			var contact = document.getElementById("contact").value;
			var contactError = document.getElementById("contact-error");

			var passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/;
			var emailRegex = /^\S+@\S+\.\S+$/;
			var contactRegex = /^\d+$/;
			var dobRegex = /^\d{4}-\d{2}-\d{2}$/;

			if (firstName === "" || lastName === "" || address === ""
					|| email === "" || dob === "" || password === ""
					|| password === "" || repeatPassword === ""
					|| contact === "") {
				if (firstName == "") {
					firstNameError.innerHTML = "First Name is required.";
				}
				if (lastName == "") {
					lastNameError.innerHTML = "Last Name is required.";
				}
				if (address == "") {
					addressError.innerHTML = "Address is required.";
				}
				if (email === "") {
					emailError.innerHTML = "Email is required.";
				} 
				if (dob == "") {
					dobError.innerHTML = "Date of birth is required.";
				}
				if (password === "") {
					passwordError.innerHTML = "Password is required.";
				}
				if (repeatPassword === "") {
					repasswordError.innerHTML = "Repeat Password is required.";
				}
				if (!passwordRegex.test(password)) {
					passwordError.innerHTML = "Password must be at least 8 characters long, contain at least 1 alphabet, and 1 special character.";
				}
				if (contact === "") {
					contactError.innerHTML = "Phone No is required.";
				} 
				return false;
			} 
			else if (!emailRegex.test(email)) {
				emailError.innerHTML = "Invalid email format.";
				return false;
			}
			else if (password !== repeatPassword) {
				passwordError.innerHTML = "Passwords do not match.";
				return false;
			}
			else if (!passwordRegex.test(password)) {
				passwordError.innerHTML = "Password must be at least 8 characters long, contain at least 1 alphabet, and 1 special character.";
				return false;
			}
			else if (!contactRegex.test(contact)) {
				contactError.innerHTML = "Invalid phone number.";
			}
			else {
				firstNameError.innerHTML = "";
				lastNameError.innerHTML = "";
				addressError.innerHTML = "";
				emailError.innerHTML = "";
				dobError.innerHTML = "";
				passwordError.innerHTML = "";
				contactError.innerHTML = "";
			}
		}