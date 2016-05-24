<?php
if (isset($_POST["login"])) {
	echo "Thông tin là <br>";
	echo "Mã Sinh viên: ".$_POST["masv"]."<br>";
	echo "Họ và tên: ".$_POST["hoten"]."<br>";
	echo "Ngày sinh: ".$_POST["ngaysinh"]."<br>";
	echo "Giới tính: ".$_POST["gioitinh"]."<br>";
	echo "Nơi sinh: ".$_POST["noisinh"]."<br>";
	echo "Lớp: ".$_POST["lop"]."<br>";
}
?>