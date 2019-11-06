package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/footer.html");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <title>Kaiser</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Tin nhanh</a>\r\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txtSearch\">Search</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtSearch\" placeholder=\"Search key...\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Search</button>\n");
      out.write("            </form>\n");
      out.write("            <br/>\n");
      out.write("\n");
      out.write("            <c:forEach var=\"item\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${news}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                        <p class=\"card-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.summary}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Đăng bởi: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </c:forEach>\n");
      out.write("            <br/>\n");
      out.write("            <nav aria-label=\"Page navigation example\">\n");
      out.write("                <ul class=\"pagination\">\n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curr == 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <li class=\"page-item\">\n");
      out.write("                            <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\n");
      out.write("                                <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </c:if>\n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curr > 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <li class=\"page-item\">\n");
      out.write("                            <a class=\"page-link\" href=\"?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curr-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Previous\">\n");
      out.write("                                <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </c:if>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <c:forEach var=\"i\" begin=\"1\" end=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" step=\"1\">\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>    \n");
      out.write("                    </c:forEach>\n");
      out.write("\n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curr == total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <li class=\"page-item\">\n");
      out.write("                            <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\n");
      out.write("                                <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </c:if>\n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curr < total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <li class=\"page-item\">\n");
      out.write("                            <a class=\"page-link\" href=\"?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curr+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Next\">\n");
      out.write("                                <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </c:if>    \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("<footer>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</footer>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
