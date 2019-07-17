<html>
<body>
<h2><a href="listar">Mostrar Lista</a></h2>

<form action="insert" method="post">
 	 <table>
 	 	<tr>
 	 		<td>Ingrese su nombre:</td>
 	 		<td><input type="text" name="nombre" ></td>
 	 	</tr>
 	 	<tr>
 	 		<td>Ingrese su Apellido:</td>
 	 		<td><input type="text" name="apellido" ></td>
 	 	</tr>
 	 	<tr>
 	 		<td>Seleccione su genero:</td>
 	 		<td><input type="radio" name="genero" value="M">Masculino 
 	 			<input type="radio" name="genero" value="F">Femenino</td>
 	 	</tr>
 	 	<tr>
 	 		<td>Ingrese su email:</td>
 	 		<td><input type="text" name="email" ></td>
 	 	</tr>
 	 	<tr>
 	 		<td colspan="2"><input type="submit" name="enviar" value="Enviar"></td>
 	 	</tr>
 	 </table>
 	</form>
</body>
</html>
