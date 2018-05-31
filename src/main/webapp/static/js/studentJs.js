$(document).ready(function() {
	allStudent();
	$('#btnUpdate').hide();
	 $('#txtId').hide();

});
function clear() {
	$('#txtName').val('');
	$('#adNo').val('');
	$('#adStreet').val('');
	$('#adCity').val('');
	if (document.getElementById("genderMale").checked) {
		document.getElementById("genderMale").checked = false;
	}
	if (document.getElementById("genderFemale").checked) {
		document.getElementById("genderFemale").checked = false;
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
		url : "/opnArcAssingment02/student",
		type : "GET",
		dataType : "json",
		data : {
			"stuName" : stuName,
			"adNo" : adNo,
			"adStreet" : adStreet,
			"adCity" : adCity,
			"gender" : gender
		},

		success : function(data) {
			// alert("Registerd Student");
			// clear();
			// allStudent();

		},
		error : function(data) {
			console.log(data);
		},

	});

	alert("Registerd Student");
	clear();
	allStudent();

}

function updateStudent() {
	var stuId = $('#txtId').val();
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
		url : "/opnArcAssingment02/update?stuId=" + stuId,
		type : "GET",
		dataType : "json",
		data : {
			"stuName" : stuName,
			"adNo" : adNo,
			"adStreet" : adStreet,
			"adCity" : adCity,
			"gender" : gender
		},
		success : function(data) {

		},
		error : function(data) {
			console.log(data);
		},

	});

	alert("Updated Student");
	clear();
	allStudent();

}

function deleteStudent(stuId) {
	var action = confirm("Are you Sure !");
	if (action == true) {
		$.ajax({
			url : "/opnArcAssingment02/student?stuId=" + stuId,
			type : "DELETE",
			data : {},
			success : function(data) {
				clear();
				allStudent();

			},
			error : function(data) {
				alert("Error");
			}
		});
	}
}

function setStudent(stuId) {

	$.ajax({
		url : "/opnArcAssingment02/student?stuId=" + stuId,
		type : "PUT",
		dataType : "json",
		data : {},
		success : function(data) {
			clear();
			for (var i = 0; i < data.length; i++) {
				$('#txtId').val(data[i].stuId);
				$('#txtName').val(data[i].stuName);
				$('#adNo').val(data[i].adNo);
				$('#adStreet').val(data[i].adStreet);
				$('#adCity').val(data[i].adCity);
				$('#btnUpdate').show();
				$('#btnSave').hide();
			}

		},
		error : function(data) {
			alert("Error");
		}
	});

}

function allStudent() {

	$.ajax({
		url : "/opnArcAssingment02/student",
		type : "POST",
		dataType : "json",
		data : {},
		success : function(data) {
			// console.log(data[1].stuName);
			for (i = 0; i < data.length; i++) {
				$('#stuTable').append(

						"<tr>" + "<td>" + data[i].stuId + "</td>" + "<td>"
								+ data[i].stuName + "</td>" + "<td>"
								+ data[i].adNo + "," + data[i].adStreet + ","
								+ data[i].adCity + "</td>" + "<td>"
								+ "<button onClick=\"setStudent("
								+ data[i].stuId + ")\" >Edite</button>"
								+ "</td>" + "<td>"
								+ "<button onClick=\"deleteStudent("
								+ data[i].stuId + ")\">Delete</button>"
								+ "</td>" + "</tr>");
			}

		},
		error : function(x) {
			alert("Error");
		}
	});
}
