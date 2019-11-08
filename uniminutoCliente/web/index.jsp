<%-- 
    Document   : index
    Created on : 8/11/2019, 02:46:47 PM
    Author     : BOG-A411-E-011
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>WEBS SERVICES CLIENTE</h1>
        <form action="index.jsp" method="POST">
            RADIO <input name="cajaradio" type="text" value=""/>       <br>
     
            <input type="submit" value="Calcular"/>
           </form>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	ws.com.AreaCirculo_Service service = new ws.com.AreaCirculo_Service();
	ws.com.AreaCirculo port = service.getAreaCirculoPort();
	 // TODO initialize WS operation arguments here
	java.lang.Double radio = Double.valueOf(request.getParameter("cajaradio"));
	// TODO process result here
	java.lang.Double result = port.area(radio);
        if(radio<0)
            out.println("el radio debe ser mayor a cero");
        else
            out.println("el area del circulo es = " + result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
