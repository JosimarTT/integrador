package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"341042382513-spt3pjn88up45m1f3518u264j05f712r.apps.googleusercontent.com\">\n");
      out.write("        <style>\n");
      out.write("            #myP,#datos{\n");
      out.write("                width: 800px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                padding: 10px;\n");
      out.write("                height: 50px;\n");
      out.write("                position: absolute;\n");
      out.write("                margin-top: -25px;\n");
      out.write("                margin-left: -400px;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("            }\n");
      out.write("            #datos{\n");
      out.write("                visibility: hidden;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            function init() {\n");
      out.write("                gapi.load('auth2', function() {\n");
      out.write("                var auth2 = gapi.auth2.init({\n");
      out.write("                client_id: \"341042382513-spt3pjn88up45m1f3518u264j05f712r.apps.googleusercontent.com\",\n");
      out.write("                        hosted_domain: 'tecsup.edu.pe'\n");
      out.write("                    });\n");
      out.write("                };\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div align=\"center\" class=\"g-signin2\" data-onsuccess=\"onSignIn\" id=\"myP\"></div>\n");
      out.write("        <div id=\"datos\" >\n");
      out.write("            <img id=\"myImg\"><br>\n");
      out.write("            <p id=\"name\"></p> \n");
      out.write("            <div id=\"status\"></div>\n");
      out.write("            <div id=\"signOut\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                function onSignIn(googleUser) {\n");
      out.write("                // window.location.href='success.jsp';\n");
      out.write("                var profile = googleUser.getBasicProfile();\n");
      out.write("                var imagurl = profile.getImageUrl();\n");
      out.write("                var name = profile.getName();\n");
      out.write("                var email = profile.getEmail();\n");
      out.write("                document.getElementById(\"myImg\").src = imagurl;\n");
      out.write("                document.getElementById(\"name\").innerHTML = name;\n");
      out.write("                document.getElementById(\"myP\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"datos\").style.visibility = \"visible\";\n");
      out.write("                document.getElementById(\"status\").innerHTML = 'Welcome ' + name + '!<a href=success.jsp?email=' + email + '&name=' + name + '/>Continue with Google login</a></p>';\n");
      out.write("                document.getElementById(\"signOut\").innerHTML = '<button onclick=\"signOut()\">Sign Out</button>';\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function signOut() {\n");
      out.write("                var auth2 = gapi.auth2.getAuthInstance();\n");
      out.write("                auth2.signOut().then(function () {\n");
      out.write("                    console.log('User signed out.');\n");
      out.write("                });\n");
      out.write("                location.reload();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!--BOOTSTRAP -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
