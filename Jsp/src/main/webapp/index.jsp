<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="prime" method="post">
        Name <input type="text" name="name"><br><br>
        Country <select id="coun" name="country">
            <option>---select country--</option>
            <option>India</option>
            <option>German</option>
            <option>USA</option>
        </select><br><br>
    
Married Status <input type="radio" id="married" name="marrige" value="Married">
               <label for="married">Married</label>
               <input type="radio" id="married" name="marrige" value="UnMarried">
               <label for="married">UnMarried</label><br><br>

    Party <select id="par" name="party"> 
    <option>---select---</option>
    <option>Bjp</option>
    <option>Congress</option> 
    <option>Jds</option> 
    </select>  <br><br>
    
    Age <input type="text" name="age"><br><br>

    Gender <br> <input type="radio" id="gen" name="Gender" value="Male">
     <label for="gen">Male</label>
              <input type="radio" id="gen" name="Gender" value="Female">
     <label for="gen">Female</label>
     <input type="radio" id="gen" name="Gender" value="Others">
     <label for="gen">Others</label><br><br>
   Period as <input type="text" name="period"><br><br>

   Times Represnted <select id="rep" name="time" >
    <option>---select---</option>
    <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
   </select><br><br>
   <input type="submit" value="Click">
     </form>
</body>
</html>