<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="example.readexcel.*"%>
<%@ page import="bean.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<script src="http://maps.googleapis.com/maps/api/js"></script>
<script type="text/javascript">
	var zipval;
	function getZipValue() {
		zipval = document.getElementById("zip").value;
		return zipval;

	}
</script>


</head>

<body>
	Zip Code:
	<input type="text" id="zip" onkeypress="getZipValue()">

	<input type="button" value="map" onclick="loadData()">
	<div id="sample" style="width: 570px; height: 580px;"></div>

	<%
		String z = "<script>document.writeln(zipval)</script>";
		String zipv = request.getParameter("name");
		out.println(z);
		int zip;
		try {
			zip = Integer.parseInt(z);
		} catch (NumberFormatException n) {
			zip = 0;
		}
		ReadExcel1 r = new ReadExcel1();
		ArrayList<ZipBean> zipbean = r.getDetails(zip);
		Iterator<ZipBean> itrzip = zipbean.iterator();
		ZipBean bean = new ZipBean();
		while (itrzip.hasNext()) {
			bean = (ZipBean) itrzip.next();

		}
		double lati = bean.getLatitude();
		double loni = bean.getLongitude();
	%>
	<script language="JavaScript">
		function loadData() {
			var lati1 =
	<%=lati%>
		;
			var loni1 =
	<%=loni%>
		;

			window.loadMap(lati1, loni1);

		}
		function loadMap(lati, logi) {

			alert(lati);
			alert(logi);
			var mapOptions = {
				center : new google.maps.LatLng(logi, lati),
				zoom : 12,
				mapTypeId : google.maps.MapTypeId.ROADMAP
			};

			var map = new google.maps.Map(document.getElementById("sample"),
					mapOptions);
		}
	</script>

</body>
</html>
