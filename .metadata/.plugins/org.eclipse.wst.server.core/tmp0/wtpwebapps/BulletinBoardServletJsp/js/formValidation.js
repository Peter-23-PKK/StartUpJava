document.getElementById("firstName").addEventListener("input",
	function() {
		document.getElementById("firstNameError").innerHTML = "";
	});

document.getElementById("lastName").addEventListener("input",
	function() {
		document.getElementById("lastNameError").innerHTML = "";
	});

document.getElementById("address").addEventListener("input",
	function() {
		document.getElementById("addressError").innerHTML = "";
	});

document.getElementById("email").addEventListener("input", function() {
	document.getElementById("emailError").innerHTML = "";
});

document.getElementById("dob").addEventListener("input", function() {
	document.getElementById("dobError").innerHTML = "";
});

document.getElementById("pass").addEventListener("input", function() {
	document.getElementById("passwordError").innerHTML = "";
});

document.getElementById("phoneNumber").addEventListener("input",
	function() {
		document.getElementById("phoneNumberError").innerHTML = "";
	});
	
	document.getElementById("role").addEventListener("input", function() {
	document.getElementById("roleError").innerHTML = "";
});

function validateForm() {
	var password = document.getElementById("pass").value;
	var repeatPassword = document.getElementById("re_pass").value;
	var passwordError = document.getElementById("passwordError");

	var firstName = document.getElementById("firstName").value;
	var firstNameError = document.getElementById("firstNameError");

	var lastName = document.getElementById("lastName").value;
	var lastNameError = document.getElementById("lastNameError");

	var address = document.getElementById("address").value;
	var addressError = document.getElementById("addressError");

	var email = document.getElementById("email").value;
	var emailError = document.getElementById("emailError");

	var dob = document.getElementById("dob").value;
	var dobError = document.getElementById("dobError");

	var role = document.getElementById("role").value;
	var roleError = document.getElementById("roleError");

	var phoneNumber = document.getElementById("phoneNumber").value;
	var phoneNumberError = document.getElementById("phoneNumberError");

	var passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/;
	var emailRegex = /^\S+@\S+\.\S+$/;
	var contactRegex = /^\d+$/;

	if (firstName === "" || lastName === "" || address === ""
		|| email === "" || dob === "" || password === ""
		|| repeatPassword === ""
		|| phoneNumber === "" || role === "") {
		if (firstName == "") {
			firstNameError.innerHTML = "First Name is required.";
		}
		if (lastName == "") {
			lastNameError.innerHTML = "Last Name is required.";
		}
		if (address == "") {
			addressError.innerHTML = "Address is required.";
		}
		if (role == "") {
			roleError.innerHTML = "Role is required.";
		}
		if (email === "") {
			emailError.innerHTML = "Email is required.";
		} else if (!emailRegex.test(email)) {
			emailError.innerHTML = "Invalid email format.";
		}
		if (dob == "") {
			dobError.innerHTML = "Date of birth is required.";
		}
		if (password === "") {
			passwordError.innerHTML = "Password is required.";
		}
		if (phoneNumber === "") {
			phoneNumberError.innerHTML = "Phone No is required.";
		} else if (!contactRegex.test(phoneNumber)) {
			phoneNumberError.innerHTML = "Invalid phone number.";
		}
		return false;
	} else if (!emailRegex.test(email)) {
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
	else if (!contactRegex.test(phoneNumber)) {
		phoneNumberError.innerHTML = "Invalid phone number.";
	}
	else {
		firstNameError.innerHTML = "";
		lastNameError.innerHTML = "";
		addressError.innerHTML = "";
		emailError.innerHTML = "";
		dobError.innerHTML = "";
		passwordError.innerHTML = "";
		phoneNumberError.innerHTML = "";
		roleError.innerHTML = "";
	}
}
function confirmSubmit() {
	event.preventDefault();
	swal.fire({
		title: 'Are you sure?',
		text: 'Do you really want to save the user data?',
		icon: 'warning',
		showCancelButton: true,
		confirmButtonColor: '#3085d6',
		cancelButtonColor: '#d33',
		confirmButtonText: 'Yes, Save it!'
	}).then((result) => {
		if (result.isConfirmed) {
			document.forms[0].submit();
		}
	});
}
function previewFile() {

	var preview = document.getElementById('previewImage');
	var fileInput = document.querySelector('input[type=file]');
	var file = fileInput.files[0];
	var originalImagePath = document.getElementById('originalImagePath').value;

	var reader = new FileReader();

	reader.onloadend = function() {
		preview.src = reader.result;
	}

	if (file) {
		reader.readAsDataURL(file); // convert to base64 string
	} else {
		preview.src = originalImagePath;
	}
}