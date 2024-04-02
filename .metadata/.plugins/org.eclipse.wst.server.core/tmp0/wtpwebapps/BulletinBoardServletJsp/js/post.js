document.getElementById("title").addEventListener("input",
				function() {
					document.getElementById("titleError").innerHTML = "";
				});
		document.getElementById("description").addEventListener("input",
				function() {
					document.getElementById("descriptionError").innerHTML = "";
				});

		function validateForm() {
			var title = document.getElementById("title").value;
			var titleError = document.getElementById("titleError");

			var description = document.getElementById("description").value;
			var descriptionError = document.getElementById("descriptionError");

			if (title === "" || description === "") {
				if (title === "") {
					titleError.innerHTML = "Title is required.";
				}
				if (description == "") {
					descriptionError.innerHTML = "Description is required.";
				}
				return false;
			} else {
				titleError.innerHTML = "";
				descriptionError.innerHTML = "";
			}
		}