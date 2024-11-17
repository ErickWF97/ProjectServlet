package org.ewflorencio;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<html lang=\"pt-BR\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <title>Login</title>\n" +
                "  <style>\n" +
                "    * {\n" +
                "      margin: 0;\n" +
                "      padding: 0;\n" +
                "      box-sizing: border-box;\n" +
                "    }\n" +
                "\n" +
                "    html, body {\n" +
                "      width: 100%;\n" +
                "      height: 100%;\n" +
                "      font-family: Arial, sans-serif;\n" +
                "    }\n" +
                "\n" +
                "    .container {\n" +
                "      display: flex;\n" +
                "      justify-content: center;\n" +
                "      align-items: center;\n" +
                "      width: 100%;\n" +
                "      height: 100%;\n" +
                "      background: linear-gradient(135deg, #4A90E2, #50E3C2);\n" +
                "    }\n" +
                "\n" +
                "    .login-box {\n" +
                "      background: white;\n" +
                "      padding: 20px;\n" +
                "      border-radius: 8px;\n" +
                "      box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);\n" +
                "      width: 100%;\n" +
                "      max-width: 400px;\n" +
                "    }\n" +
                "\n" +
                "    .login-box h1 {\n" +
                "      text-align: center;\n" +
                "      margin-bottom: 20px;\n" +
                "      font-size: 24px;\n" +
                "    }\n" +
                "\n" +
                "    .login-box label {\n" +
                "      display: block;\n" +
                "      margin-bottom: 8px;\n" +
                "      font-weight: bold;\n" +
                "    }\n" +
                "\n" +
                "    .login-box input {\n" +
                "      width: 100%;\n" +
                "      padding: 10px;\n" +
                "      margin-bottom: 20px;\n" +
                "      border: 1px solid #ccc;\n" +
                "      border-radius: 4px;\n" +
                "    }\n" +
                "\n" +
                "    .login-box button {\n" +
                "      width: 100%;\n" +
                "      padding: 10px;\n" +
                "      background: #4A90E2;\n" +
                "      color: white;\n" +
                "      border: none;\n" +
                "      border-radius: 4px;\n" +
                "      font-size: 16px;\n" +
                "      cursor: pointer;\n" +
                "    }\n" +
                "\n" +
                "    .login-box button:hover {\n" +
                "      background: #357ABD;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <div class=\"container\">\n" +
                "    <div class=\"login-box\">\n" +
                "      <h1>Login</h1>\n" +
                "      <form>\n" +
                "        <label for=\"username\">Usuário</label>\n" +
                "        <input type=\"text\" id=\"username\" name=\"username\" placeholder=\"Digite seu usuário\" required>\n" +
                "        \n" +
                "        <label for=\"password\">Senha</label>\n" +
                "        <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Digite sua senha\" required>\n" +
                "        \n" +
                "        <button type=\"submit\">Entrar</button>\n" +
                "      </form>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</body>\n" +
                "</html>");
    }

}
