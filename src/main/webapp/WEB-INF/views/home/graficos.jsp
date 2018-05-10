<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<body>

	<div id="container"
		style="min-width: 310px; height: 400px; max-width: 600px; margin: 0 auto"></div>

	<script type="text/javascript">
		Highcharts.chart('container', {
			chart : {
				plotBackgroundColor : null,
				plotBorderWidth : null,
				plotShadow : false,
				type : 'pie'
			},
			title : {
				text : 'Grafio usando Highcharts - Desafio 3'
			},
			tooltip : {
				pointFormat : '{series.name}: <b>{point.percentage:.1f}%</b>'
			},
			plotOptions : {
				pie : {
					allowPointSelect : true,
					cursor : 'pointer',
					dataLabels : {
						enabled : false
					},
					showInLegend : true
				}
			},
			series : [ {
				name : 'Pessoas',
				colorByPoint : true,
				data : [ {
					name : 'JAMES E  GRAY',
					y : 0.10
				}, {
					name : 'SUSAN M  WALKER',
					y : 0.00
				}, {
					name : 'BRANDON S  HAIRSTON',
					y : 17500.00
				}, {
					name : 'BRANT N  CASEY',
					y : 50.00
				}, {
					name : 'BILLIE J  ADAMS',
					y : 17000.00
				}, {
					name : 'GLORIA J  MARTELLO ',
					y : 10050.00
				}, {
					name : 'DARRELL S  EVANS ',
					y : 100050.00
				}, {
					name : 'ERIC J. FURMAN',
					y : 355.00
				}, {
					name : 'PATRICK M  GINGERICH',
					y : 1050.00
				} ]
			} ]
		});
	</script>

	<form method="POST" action="/desafio">
		<input type="submit" value="Voltar" />
	</form>
</body>
</html>