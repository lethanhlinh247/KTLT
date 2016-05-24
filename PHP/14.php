<?php
$dong=$_POST["dong"];
$cot=$_POST["cot"];
echo "<center> Bảng là <br>";
echo "<table  width='500px' cellpadding='15px' border='1'>";
for ($i = 0; $i<$dong; $i++) {
	echo "<tr>";
	for ($j=0;$j<$cot;$j++) {
		$k=$j+1;
		if ($j<=$i)
			echo "<td>".$k."</td>";
		else
			echo "<td></td>";
	}
	echo "</tr>";
}
echo "</table>";
echo "</center>";
?>