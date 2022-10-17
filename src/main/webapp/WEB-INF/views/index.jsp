<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Máy tính</title>
</head>
<body>
<h1>Máy tính của tôi</h1>
<form action="calculate" method="post">
  <input type="text" name="number1" value="${number1}">
  <input type="text" name="number2" value="${number2}">
  <p>
    <input type="submit" name="calculation" value="Cong<+>">
    <input type="submit" name="calculation" value="Tru<->">
    <input type="submit" name="calculation" value="Nhan<x>">
    <input type="submit" name="calculation" value="Chia</>">
  </p>
</form>
<h2>Kết quả: ${number1} ${calcul} ${number2} = ${result}</h2>
</body>
</html>
