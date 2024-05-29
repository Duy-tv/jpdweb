package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Nihongo</title>\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"bg-gray-800 p-4 h-20 z-50 sticky top-0\">\n");
      out.write("        <div class=\"container justify-items-center\">\n");
      out.write("            <div class=\"flex items-center text-center text-3xl mx-8\">\n");
      out.write("                <a class=\" no-underline text-white text-4xl font-bold hover:text-gray-400 my-auto\" href=\"welcome.jsp\">Nihongo logo</a>\n");
      out.write("                <ul class=\"grid gap-x-16 grid-flow-col auto-cols-max mx-auto mb-3\">\n");
      out.write("                    <li><a class=\"no-underline text-white text-lg justify-between hover:text-gray-400 \" href=\"#\">Home</a></li>\n");
      out.write("                    <li><a class=\"no-underline text-white text-lg justify-between hover:text-gray-400 \" href=\"#\">Vocabulary</a></li>\n");
      out.write("                    <li><a class=\"no-underline text-white text-lg justify-between hover:text-gray-400 \" href=\"#\">Grammar</a></li>\n");
      out.write("                    <li><a class=\"no-underline text-white text-lg justify-between hover:text-gray-400 \" href=\"#\">Kanji</a></li>\n");
      out.write("                    <li><a class=\"no-underline text-white text-lg justify-between hover:text-gray-400 \" href=\"#\">Listening</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <button class=\"no-underline text-white text-lg font-bold align-middle hover:text-gray-400\"><a href=\"#\">Login</a></button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("   \n");
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
