document.getElementById("firstName").addEventListener("input",
	function() {
		document.getElementById("firstNameError").innerHTML = "";
	});
document.getElementById("lastName").addEventListener("input",
	function() {
		document.getElementById("lastNameError").innerHTML = "";
	});

document.getElementById("email").addEventListener("input", function() {
	document.getElementById("emailError").innerHTML = "";
});

document.getElementById("phoneNumber").addEventListener("input",
	function() {
		document.getElementById("phoneNumberError").innerHTML = "";
	});

document.getElementById("address").addEventListener("input",
	function() {
		document.getElementById("addressError").innerHTML = "";
	});

document.getElementById("dob").addEventListener("input", function() {
	document.getElementById("dobError").innerHTML = "";
});

document.getElementById("role").addEventListener("input", function() {
	document.getElementById("roleError").innerHTML = "";
});



function validateForm() {
	var emailRegex = /^\S+@\S+\.\S+$/;
	var contactRegex = /^\d+$/;
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

	var phoneNumber = document.getElementById("phoneNumber").value;
	var phoneNumberError = document.getElementById("phoneNumberError");

	var role = document.getElementById("role").value;
	var roleError = document.getElementById("roleError");

	if (firstName === "" || lastName === "" || address === ""
		|| email === "" || dob === "" || phoneNumber === ""
		|| role === "") {
		if (firstName === "") {
			firstNameError.innerHTML = "First Name is required.";
		}
		if (lastName == "") {
			lastNameError.innerHTML = "Last Name is required.";
		}
		if (address === "") {
			addressError.innerHTML = "Address is required.";
		}
		if (email === "") {
			emailError.innerHTML = "Email is required.";
		}

		if (dob === "") {
			dobError.innerHTML = "Date of Birth is required.";
		}
		if (phoneNumber === "") {
			phoneNumberError.innerHTML = "Phone Number is required.";
		}
		if (role === "") {
			roleError.innerHTML = "Role is required.";
		}
		return false;
	}
	else if (!emailRegex.test(email)) {
		emailError.innerHTML = "Invalid email format.";
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


