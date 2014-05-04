<%@ page language="java" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

legend {
	color: #06c;
	font-weight: 800;
	background: #fff;
}

fieldset {
	padding: 10px;
	margin: 10px;
	width: 270px;
	color: #333;
	border: #06c dashed 1px;
}

select {
	width: 100%;
}
</style>
<body>
	<table width="100%" border="1">
		<tr>

			<td align="right" width="45%">
				<fieldset>
					<legend>未分配的权限</legend>
					<select name="select" size="10" multiple="MULTIPLE">
						<option value="1">item_1</option>
						<option value="2">item_2</option>
						<option value="3">item_3</option>
						<option value="4">item_4</option>
						<option value="5">item_5</option>
						<option value="6">item_6</option>
						<option value="7">item_7</option>
						<option value="8">item_8</option>
					</select>
				</fieldset>
			</td>


			<td align="center" width="10%">
				<table width="100%" border="0" style="float: left">
					<tr>
						<td align="center"><input type="button" value="&gt;"></td>
					</tr>
					<tr>
						<td align="center"><input type="button" value="&gt;&gt;"></td>
					</tr>
					<tr>
						<td align="center">&nbsp;</td>
					</tr>
					<tr>
						<td align="center"><input type="button" value="&lt;"></td>
					</tr>
					<tr>
						<td align="center"><input type="button" value="&lt;&lt;"></td>
					</tr>
				</table>
			</td>

			<td width="45%">
				<fieldset>
					<legend>已分配的权限</legend>
					<select name="select" size="10" multiple="MULTIPLE">
						<option value="1">item_1ssssssssssssssss</option>
						<option value="2">item_2</option>
						<option value="3">item_3</option>
						<option value="4">item_4</option>
						<option value="5">item_5</option>
						<option value="6">item_6</option>
						<option value="7">item_7</option>
						<option value="8">item_8</option>
					</select>
				</fieldset>
			</td>


		</tr>
	</table>
</body>
