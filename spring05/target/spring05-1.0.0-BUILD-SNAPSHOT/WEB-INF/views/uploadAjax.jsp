<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<style>
.uploadResult {
	width: 100%;
	background-color: gray;
}

.uploadResult ul {
	display: flex;
	flex-flow: row;
	justify-content: center;
	align-items: center;
}

.uploadResult ul li {
	list-style: none;
	padding: 10px;
}

.uploadResult ul li img {
	width: 100px;
}
</style>

<style>
.bigPictureWrapper {
  position: absolute;
  display: none;
  justify-content: center;
  align-items: center;
  top:0%;
  width:100%;
  height:100%;
  background-color: gray; 
  z-index: 100;
}

.bigPicture {
  position: relative;
  display:flex;
  justify-content: center;
  align-items: center;
}
</style>

	<h1>Upload with Ajax</h1>
<div class='bigPictureWrapper'>
  <div class='bigPicture'></div>
</div>


	<div class='uploadDiv'>
		<input type='file' name='uploadFile' multiple>
	</div>

	<div class='uploadResult'>
		<ul>

		</ul>
	</div>


	<button id='uploadBtn'>Upload</button>

<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<!-- 	<script type="text/javascript" src="/resources/js/jquery-3.7.1.js"></script> -->
<!-- 	<script type="text/javascript" src="/webjars/jquery/3.7.1/src/jquery.js"></script> -->

	<script type="text/javascript">

		var uploadResult = $(".uploadResult ul");

		function showUploadedFile(uploadResultArr) {
			var str = "";
			$(uploadResultArr).each(function (i,obj){
				<%--str+=`<li>${obj.fileName}</li>`;--%>
				str += "<li>" +obj.fileName+ "</li>";
			});

			uploadResult.append(str);
		}

		var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
		var maxSize = 5242880; //5MB

		function checkExtension(fileName, fileSize) {
			if (fileSize >= maxSize) {
				alert("파일 사이즈 초과");
				return false;
			}
			if (regex.test(fileName)) {
				alert("해당 종류의 파일은 업로드 할 수 없습니다.");
				return false;
			}
			return true;
		}
	$(document).ready(function(){
		$("#uploadBtn").on("click", function(e) {
			let formData = new FormData();
			let inputFile = $("input[name='uploadFile']");
			let files = inputFile[0].files;

			console.log(files);

			for (var i = 0; i < files.length; i++) {

				if(!checkExtension(files[i].name, files[i].size)){
					return false;
				}

				formData.append("uploadFile", files[i]);
			}
			var cloneObj = $(".uploadDiv").clone();
			$.ajax({
			 url: '/uploadAjaxAction',
			 processData: false, 
			 contentType: false,
			 data: formData,
			 	type: 'POST',
				dataType: 'json',
			 	success: function(result){
					console.log(result);
					showUploadedFile(result);
					$(".uploadDiv").html(cloneObj.html());
				 }
			 });
		});
	});
	
	</script>

</body>
</html>
