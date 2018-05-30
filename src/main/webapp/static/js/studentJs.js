$(document).ready(function() {
	allStudent();
	
});
function clear(){
	$('#txtName').val('');
	$('#adNo').val('');
	$('#adStreet').val('');
	$('#adCity').val('');
	if (document.getElementById("genderMale").checked) {
		document.getElementById("genderMale").checked=false;
	}
	if (document.getElementById("genderFemale").checked) {
		document.getElementById("genderFemale").checked=false;
	}
	$("#stuTable tr").remove(); 
	
}
function register() {
	var stuName = $('#txtName').val();
	var adNo = $('#adNo').val();
	var adStreet = $('#adStreet').val();
	var adCity = $('#adCity').val();
	if (document.getElementById("genderMale").checked) {
		var gender = "male";
	}
	if (document.getElementById("genderFemale").checked) {
		var gender = "female";
	}
	$.ajax({
		url: "/opnArcAssingment02/studentRegister", 
		type: "GET",
	    dataType: "json",
	    data:{"stuName":stuName, "adNo":adNo,"adStreet":adStreet,"adCity":adCity,"gender":gender},
	    });	
	
	alert("Registerd Student");
	allStudent();
	clear();

	
}
function allStudent() {

	$.ajax({
				url : "/opnArcAssingment02/studentController",
				type : "GET",
				dataType : "json",
				data : {},
				success : function(responseineer) {
					console.log(responseineer[1].stuName);
					for (i = 0; i < responseineer.length; i++) {
						$('#stuTable').append(
										"<tr>" + 
											"<td>"
												+ responseineer[i].stuId
												+ "</td>"
												+ "<td>"
												+ responseineer[i].stuName
												+ "</td>"
												+ "<td>"
												+ responseineer[i].adNo
												+ "</td>"
												+ "<td>"
												+ responseineer[i].adStree1
												+ "</td>"
												+ "<td>"
												+ responseineer[i].adStree2
												+ "</td>"
												+ "<td>"
												+ responseineer[i].adCity
												+ "</td>"
												+ "<td>"
												+ "<button onClick=\"editeStudent()\" >Edite</button>"
												+ "</td>"
												+ "<td>"
												+ "<button onClick=\"deleteStudent()\">Delete</button>"
												+ "</td>" + "</tr>");
					}

				},
				error : function(e) {
					// alert(e);
					console.log(e)
				}
			});
}
