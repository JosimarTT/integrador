<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <meta name="google-signin-client_id" content="341042382513-spt3pjn88up45m1f3518u264j05f712r.apps.googleusercontent.com">
        <style>
            #myP,#datos{
                width: 800px;
                border-radius: 5px;
                padding: 10px;
                height: 50px;
                position: absolute;
                margin-top: -25px;
                margin-left: -400px;
                top: 50%;
                left: 50%;
            }
            #datos{
                visibility: hidden;
            }
        </style>
    </head>
    <body>
        <script>
            function init() {
                gapi.load('auth2', function() {
                var auth2 = gapi.auth2.init({
                client_id: "341042382513-spt3pjn88up45m1f3518u264j05f712r.apps.googleusercontent.com",
                        hosted_domain: 'tecsup.edu.pe'
                    });
                };
            }
        </script>
        <div align="center" class="g-signin2" data-onsuccess="onSignIn" id="myP"></div>
        <div id="datos" >
            <img id="myImg"><br>
            <p id="name"></p> 
            <div id="status"></div>
            <div id="signOut"></div>
        </div>


        <script type="text/javascript">
                function onSignIn(googleUser) {
                // window.location.href='success.jsp';
                var profile = googleUser.getBasicProfile();
                var imagurl = profile.getImageUrl();
                var name = profile.getName();
                var email = profile.getEmail();
                document.getElementById("myImg").src = imagurl;
                document.getElementById("name").innerHTML = name;
                document.getElementById("myP").style.visibility = "hidden";
                document.getElementById("datos").style.visibility = "visible";
                document.getElementById("status").innerHTML = 'Welcome ' + name + '!<a href=success.jsp?email=' + email + '&name=' + name + '/>Continue with Google login</a></p>';
                document.getElementById("signOut").innerHTML = '<button onclick="signOut()">Sign Out</button>';
            }
        </script>

        <script>
            function signOut() {
                var auth2 = gapi.auth2.getAuthInstance();
                auth2.signOut().then(function () {
                    console.log('User signed out.');
                });
                location.reload();
            }
        </script>

        <!--BOOTSTRAP -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>