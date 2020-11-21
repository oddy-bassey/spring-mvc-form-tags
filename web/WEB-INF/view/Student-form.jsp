<%-- 
    Document   : Student-form
    Created on : Jan 19, 2020, 5:01:30 PM
    Author     : Bassey Oddy
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Registration Form</title>
    </head>
    
    
        <h1>Hello World!</h1>
        
        <form:form action= "processForm" modelAttribute="student">
        
            <!-- firstName and lastName are the properties of the student object -->
            First name: <form:input path="firstName" />
            
            <br><br>
            
            Last name: <form:input path="lastName" />
            
            <br><br>
            
            Country:
            
            <form:select path="country">
                <!-- form:option value="BRA" label="Brazil"/>  -->
                <form:options items= "${student.countryOptions}"/>
            </form:select>
            
            <br><br>
            Favorite programming language
            <br><br>
            <form:radiobuttons path= "favoriteLanguage" items= "${student.favoriteLanguageOptions}"/>
            
            <br><br>
            
            Which operating system do you use?
            Linux: <form:checkbox path= "operatingSystems" value= "Linux" />
            Ms Windows: <form:checkbox path= "operatingSystems" value= "Ms Windows" />
            Mac Os: <form:checkbox path= "operatingSystems" value= "Mac Os" />
            
            <br><br>
            
            <input type="submit" value="submit" /> 
            
        </form:form>
        
    

