<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type = "text/css" href = "style.css" rel = "stylesheet">
    </head>
    <body>
        <h1><center> Hi </center></h1>
         <form action="TestServlet" name = "loginForm" method="post">
                <center>
                   <table>
                       <tr>
                        <td align = "right" >Login</td>
                        <td><input type="text" name="login"></td>
                       </tr>
                       <tr>
                        <td align = "right">Password</td>
                        <td><input type="password" name="password"></td>
                       </tr>
                      </table>
                </center>
                    <center><input class = "btn" type="submit" value="Войти" /> </center>
                </form>
    </body>
</html>
