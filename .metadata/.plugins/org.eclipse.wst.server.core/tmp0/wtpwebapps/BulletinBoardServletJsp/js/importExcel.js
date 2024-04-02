document.getElementById("file").addEventListener("input", function() {
	document.getElementById("fileError").innerHTML = "";
	document.getElementById("errorMg").innerHTML = "";
});

function validateForm() {
	var file = document.getElementById("file").value;
	var fileError = document.getElementById("fileError");

	if (file === "") {
		fileError.innerHTML = "Excel file is required.";
		return false;
	} else {
		fileError.innerHTML = "";
	}
}