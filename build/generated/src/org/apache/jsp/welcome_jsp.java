package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/includes/header.jsp");
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
      out.write("        <nav class=\"bg-emerald-950 p-4 z-50 sticky top-0\">\n");
      out.write("            <div class=\"container mx-auto flex justify-between items-center h-full\">\n");
      out.write("                <a class=\"no-underline text-white text-[2vw] md:text-[2.5vw] lg:text-[3vw] xl:text-[4vw] font-bold hover:text-gray-400\" href=\"welcome.jsp\">Nihongo logo</a>\n");
      out.write("                <ul class=\"flex space-x-8\">\n");
      out.write("                    <li><a class=\"no-underline text-white text-[0.8vw] md:text-[1vw] lg:text-[1.2vw] xl:text-[1.5vw] hover:text-gray-400\" href=\"#\">Home</a></li>\n");
      out.write("                    <li><a class=\"no-underline text-white text-[0.8vw] md:text-[1vw] lg:text-[1.2vw] xl:text-[1.5vw] hover:text-gray-400\" href=\"#\">Vocabulary</a></li>\n");
      out.write("                    <li><a class=\"no-underline text-white text-[0.8vw] md:text-[1vw] lg:text-[1.2vw] xl:text-[1.5vw] hover:text-gray-400\" href=\"#\">Grammar</a></li>\n");
      out.write("                    <li><a class=\"no-underline text-white text-[0.8vw] md:text-[1vw] lg:text-[1.2vw] xl:text-[1.5vw] hover:text-gray-400\" href=\"#\">Kanji</a></li>\n");
      out.write("                    <li><a class=\"no-underline text-white text-[0.8vw] md:text-[1vw] lg:text-[1.2vw] xl:text-[1.5vw] hover:text-gray-400\" href=\"#\">Listening</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <button class=\"no-underline text-white text-[0.8vw] md:text-[1vw] lg:text-[1.2vw] xl:text-[1.5vw] font-bold hover:text-gray-400\"><a href=\"#\">Login</a></button>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("<div class=\"bg-pink-100 h-full w-full\">\n");
      out.write("    <div class=\"grid grid-flow-col auto-cols-max justify-center  \">\n");
      out.write("        <div class=\"w-[12.5vw] h-[36vh] rounded-lg overflow-hidden shadow-lg bg-white mx-[1vw] my-20\">\n");
      out.write("            <div class=\"px-2 py-1\">\n");
      out.write("                <div class=\"font-bold text-sm mb-1\">Card Title</div>\n");
      out.write("                <p class=\"text-gray-700 text-xs\">\n");
      out.write("                    Example card using JSP and Tailwind CSS.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"px-2 pt-1 pb-1\">\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#example</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#tailwind</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#jsp</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w-[12.5vw] h-[36vh] rounded-lg overflow-hidden shadow-lg bg-white mx-[1vw] my-20\">\n");
      out.write("            <div class=\"px-2 py-1\">\n");
      out.write("                <div class=\"font-bold text-sm mb-1\">Card Title</div>\n");
      out.write("                <p class=\"text-gray-700 text-xs\">\n");
      out.write("                    Example card using JSP and Tailwind CSS.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"px-2 pt-1 pb-1\">\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#example</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#tailwind</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#jsp</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w-[12.5vw] h-[36vh] rounded-lg overflow-hidden shadow-lg bg-white  mx-[1vw] my-20\">\n");
      out.write("            <div class=\"px-2 py-1\">\n");
      out.write("                <div class=\"font-bold text-sm mb-1\">Card Title</div>\n");
      out.write("                <p class=\"text-gray-700 text-xs\">\n");
      out.write("                    Example card using JSP and Tailwind CSS.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"px-2 pt-1 pb-1\">\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#example</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#tailwind</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#jsp</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w-[12.5vw] h-[36vh] rounded-lg overflow-hidden shadow-lg bg-white  mx-[1vw] my-20\">\n");
      out.write("            <div class=\"px-2 py-1\">\n");
      out.write("                <div class=\"font-bold text-sm mb-1\">Card Title</div>\n");
      out.write("                <p class=\"text-gray-700 text-xs\">\n");
      out.write("                    Example card using JSP and Tailwind CSS.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"px-2 pt-1 pb-1\">\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#example</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#tailwind</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#jsp</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w-[12.5vw] h-[36vh] rounded-lg overflow-hidden shadow-lg bg-white  mx-[1vw] my-20\">\n");
      out.write("            <div class=\"px-2 py-1\">\n");
      out.write("                <div class=\"font-bold text-sm mb-1\">Card Title</div>\n");
      out.write("                <p class=\"text-gray-700 text-xs\">\n");
      out.write("                    Example card using JSP and Tailwind CSS.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"px-2 pt-1 pb-1\">\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#example</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#tailwind</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#jsp</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"grid grid-flow-col auto-cols-max justify-center  \">\n");
      out.write("        <div class=\"w-[12.5vw] h-[36vh] rounded-lg overflow-hidden shadow-lg bg-white mx-[1vw] my-20\">\n");
      out.write("            <div class=\"px-2 py-1\">\n");
      out.write("                <div class=\"font-bold text-sm mb-1\">Card Title</div>\n");
      out.write("                <p class=\"text-gray-700 text-xs\">\n");
      out.write("                    Example card using JSP and Tailwind CSS.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"px-2 pt-1 pb-1\">\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#example</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#tailwind</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#jsp</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w-[12.5vw] h-[36vh] rounded-lg overflow-hidden shadow-lg bg-white mx-[1vw] my-20\">\n");
      out.write("            <div class=\"px-2 py-1\">\n");
      out.write("                <div class=\"font-bold text-sm mb-1\">Card Title</div>\n");
      out.write("                <p class=\"text-gray-700 text-xs\">\n");
      out.write("                    Example card using JSP and Tailwind CSS.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"px-2 pt-1 pb-1\">\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#example</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#tailwind</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#jsp</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w-[12.5vw] h-[36vh] rounded-lg overflow-hidden shadow-lg bg-white  mx-[1vw] my-20\">\n");
      out.write("            <div class=\"px-2 py-1\">\n");
      out.write("                <div class=\"font-bold text-sm mb-1\">Card Title</div>\n");
      out.write("                <p class=\"text-gray-700 text-xs\">\n");
      out.write("                    Example card using JSP and Tailwind CSS.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"px-2 pt-1 pb-1\">\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#example</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#tailwind</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#jsp</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w-[12.5vw] h-[36vh] rounded-lg overflow-hidden shadow-lg bg-white  mx-[1vw] my-20\">\n");
      out.write("            <div class=\"px-2 py-1\">\n");
      out.write("                <div class=\"font-bold text-sm mb-1\">Card Title</div>\n");
      out.write("                <p class=\"text-gray-700 text-xs\">\n");
      out.write("                    Example card using JSP and Tailwind CSS.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"px-2 pt-1 pb-1\">\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#example</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#tailwind</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#jsp</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w-[12.5vw] h-[36vh] rounded-lg overflow-hidden shadow-lg bg-white  mx-[1vw] my-20\">\n");
      out.write("            <div class=\"px-2 py-1\">\n");
      out.write("                <div class=\"font-bold text-sm mb-1\">Card Title</div>\n");
      out.write("                <p class=\"text-gray-700 text-xs\">\n");
      out.write("                    Example card using JSP and Tailwind CSS.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"px-2 pt-1 pb-1\">\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#example</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#tailwind</span>\n");
      out.write("                <span class=\"inline-block bg-gray-200 rounded-full px-2 py-1 text-xs font-semibold text-gray-700 mr-1 mb-1\">#jsp</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
