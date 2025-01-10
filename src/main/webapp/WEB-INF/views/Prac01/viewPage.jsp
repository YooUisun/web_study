<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Data</title>
</head>
<body>

    <h1>연습문제입니다.</h1>

    <!-- 전달된 단일 값 출력 -->
    <h2>단일 값 출력:</h2>
    <p>Name: ${name}</p>
    <p>Type: ${type}</p>

    <!-- 객체의 값 출력 -->
    <h2>객체 값 출력:</h2>
    <p>Drink Name: ${drinkItem.name}</p>
    <p>Drink Type: ${drinkItem.type}</p>

</body>
</html>
