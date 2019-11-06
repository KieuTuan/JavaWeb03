package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/resourcesaaa/html/header.html");
    _jspx_dependants.add("/resources/html/footer.html");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Kaiser English</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"resourcesaaa/css/header.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-dark\" id=\"header\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.htm\">\r\n");
      out.write("            <img class=\"logo\" src=\"public/images/actlogo.png\"/>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-outline-secondary\">Tiếng Anh Online</button>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-outline-secondary\">Lộ Trình Học</button>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-outline-secondary\">Làm đề thi</button>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("                <button class=\"btn btn-outline-secondary my-2 my-sm-0\" type=\"submit\">Login</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <img class=\"banner\" src=\"public/images/Python_banner.png\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <h3 class=\"text-center title\">Các chương trình đào tạo</h3>\r\n");
      out.write("            <br/><br/>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"card mb-4 shadow-sm\">\r\n");
      out.write("                        <label>Lever 1</label>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Xem thêm</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <p class=\"float-right\">\r\n");
      out.write("            <a href=\"#\">Back to top</a>\r\n");
      out.write("        </p>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("<footer>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</html>\r\n");
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
