$(document).ready(function() {

	
	allStudent();
	allSubject();
	// selectIndex();

});

function allStudent() {

	$.ajax({
		url : "/opnArcAssingment02/student",
		type : "POST",
		dataType : "json",
		data : {},
		success : function(data) {
			// console.log(data[1].stuName);
			for (i = 0; i < data.length; i++) {
				$('#select').append(
						"<option value=" + data[i].stuId + "  >"
								+ data[i].stuName + "</option>")
			}

		},
		error : function(x) {
			alert("Error");
		}
	});
}

// function selectIndex(){
// var x = $('#select');
// var i = x.selectedIndex;
// getMark(i);
// }

function allSubject() {
	$.ajax({
		url : "/opnArcAssingment02/subject",
		type : "POST",
		dataType : "json",
		data : {},
		success : function(data) {

			for (var i = 0; i < data.length; i++) {
				// console.log(data[i].subId);
				
				$('#div2').append(
						"<lable>" + data[i].subId + "." + data[i].subName
								+ "</lable><input type=\"text\" id=\"txtSubId"
								+ i + "\" value=\"\"><br>");
			}
		},
	});
}
function getMark() {

	var stuId = $('#select').val();
	

	$.ajax({
		url : "/opnArcAssingment02/mark?stuId=" + stuId,
		type : "POST",
		dataType : "json",
		data : {},
		success : function(data) {

			for (var i = 0; i < data.length; i++) {
				console.log(data[i].mark);
			}
		},
	});

}
function addMark(){
	var stuId = $('#select').val();
	var subId1=1;
	var subMark1=$('#txtSubId0').val();
	var subId2=2;
	var subMark2=$('#txtSubId1').val();
	var subId3=3;
	var subMark3=$('#txtSubId2').val();
	var subId4=4;
	var subMark4=$('#txtSubId3').val();
	var subId5=5;
	var subMark5=$('#txtSubId4').val();
	$.ajax({
		url : "/opnArcAssingment02/mark?stuId="+stuId,
		type : "GET",
		dataType : "json",
		data : {
			"subId1" : subId1,
			"subMark1" : subMark1,
			"subId2" : subId2,
			"subMark2" : subMark2,
			"subId3" : subId3,
			"subMark3" : subMark3,
			"subId4" : subId4,
			"subMark4" : subMark4,
			"subId5" : subId5,
			"subMark5" : subMark5
			
		},

		success : function(data) {
			

		},
		error : function(data) {
			console.log(data);
		},

	});
	
}