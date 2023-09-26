function doValidateForm() {
	var fName = $("#fName").val();
	var lName = $(".lNameClass").val();
	var address = $("#address").val();
	var zipCode = $("#zipCode").val();
	var cityName = $("#cityName").val();
	var stateName = $("#stateName").val();
	var dob = $("#dob").val();
	
	if (fName == "" || fName == null) {
		$("#fNameMsg").html("Please Enter FirstName");
		return false;
	} else if (lName == "" || lName == null) {
		$("#lNameMsg").html("Please Enter LastName");
		return false;
	} else if (address == "" || address == null) {
		$("#errorAddress").html("Please Enter Address");
		return false;
	} else if (zipCode == "" || zipCode == null) {
		$("#errorZip").html("Please Enter ZipCode");
		return false;
	} else if (cityName == "" || cityName == null) {
		$("#errorCity").html("Please Enter CityName");
		return false;
	} else if (stateName == "" || stateName == null) {
		$("#errorState").html("Please Enter StateName");
		return false;
	} else if (dob == "" || dob == null) {
		$("#errorDob").html("Please Enter Date of Birth");
		return false;
	} else {
		return true;
	}
}

function doClearFormMsg() {
	$("#fNameMsg").html("");
	$("#lNameMsg").html("");
	$("#errorAddress").html("");
	$("#errorZip").html("");
	$("#errorCity").html("");
	$("#errorState").html("");
	$("#errorDob").html("");

}