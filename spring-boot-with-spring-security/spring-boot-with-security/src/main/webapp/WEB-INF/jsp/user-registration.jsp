<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta charset="UTF-8">
    <title>Simple login form</title>

    <c:url value="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css" var="reset-min-css"/>
    <link rel="stylesheet" href="${reset-min-css}">

    <c:url value="/css/style.css" var="jstlCss"/>
    <link href="${jstlCss}" rel="stylesheet"/>

    <c:url value="/js/index.js" var="indexjs"/>
    <script src="${indexjs}"></script>


</head>

<body>
<div class="container">
    <div class="login">
        <h1 class="login-heading">
            <strong>Welcome.</strong> Please Register.</h1>

        <form:form modelAttribute="user-form" id="user-form"
                   autocomplete="off">
            Username :
            <form:input type="text" placeholder="Username"
                        required="required" class="input-txt"  path="username"></form:input>

            Password :
            <form:input type="text" placeholder="Password"
                        required="required" class="input-txt"  path="password"></form:input>

            <button type="submit" class="btn btn--right">Sign Up  </button>
        </form:form>


    </div>
</div>


</body>
</html>
