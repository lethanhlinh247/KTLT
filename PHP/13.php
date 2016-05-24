<?php
if (isset($_POST["submit"])) {
	echo "Thông tin bạn vừa nhập là <br>";
	if ($_POST["ten"] =="")
		echo "Bạn chưa nhập tên <br>";
	else
		echo "Tên là: ".$_POST["ten"]."<br>";
	if ($_POST["diachi"] =="")
		echo "Bạn chưa nhập địa chỉ <br>";
	else
		echo "Địa chỉ là: ".$_POST["diachi"]."<br>";
	if ($_POST["nghe"] =="")
		echo "Bạn chưa nhập nghề <br>";
	else
		echo "Nghề là: ".$_POST["nghe"]."<br>";
	if ($_POST["ghichu"]=="")
		echo "Bạn chưa nhập ghi chú <br>";
	else
		echo "Ghi chú là: ".$_POST["ghichu"]."<br>";
}
?>