<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*" %>
<%@ page import="service.SanphamService"%>
<%
 
     // Get the absolute path to file that lives in this application
 
	
	String homeDir = "";	
	homeDir= getServletContext().getRealPath("").split(".metadata")[0];
	homeDir = homeDir+"shoponline\\WebContent\\upload\\";
	//System.out.println(homeDir);

		try {
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}


response.setContentType("text/html");
    response.setHeader("Cache-control","no-cache");
 
    String err = "";
 
    String lastFileName = "";
  
    String contentType = request.getContentType();
    String boundary = "";
    String imagename="";
    final int BOUNDARY_WORD_SIZE = "boundary=".length();
    if(contentType == null || !contentType.startsWith("multipart/form-data")) {
     // err = "Ilegal ENCTYPE : must be multipart/form-data\n";
     // err += "ENCTYPE set = " + contentType;
     err="Chon hinh de up";
    }else{
      boundary = contentType.substring(contentType.indexOf("boundary=") + BOUNDARY_WORD_SIZE);
      boundary = "--" + boundary;
      try {
        javax.servlet.ServletInputStream sis = request.getInputStream();
        byte[] b = new byte[1024];
        int x=0;
        int state=0;
        String name=null,fileName=null,contentType2=null;
        java.io.FileOutputStream buffer = null;
        while((x=sis.readLine(b,0,1024))>-1) {
          String s = new String(b,0,x);
          if(s.startsWith(boundary)) {
            state = 0;
            //out.println("name="+name+"<br>");
            //out.println(fileName+"<br>");
 
            name = null;
            contentType2 = null;
            fileName = null;
 
 
          }else if(s.startsWith("Content-Disposition") && state==0) {
            state = 1;
            if(s.indexOf("filename=") == -1)
              name = s.substring(s.indexOf("name=") + "name=".length(),s.length()-2);
            else {
              name = s.substring(s.indexOf("name=") + "name=".length(),s.lastIndexOf(";"));
              fileName = s.substring(s.indexOf("filename=") + "filename=".length(),s.length()-2);
              if(fileName.equals("\"\"")) {
                fileName = null;
              }else {
                String userAgent = request.getHeader("User-Agent");
                String userSeparator="/";  // default
                if (userAgent.indexOf("Windows")!=-1)
                  userSeparator="\\";
                if (userAgent.indexOf("Linux")!=-1)
                  userSeparator="/";
                fileName = fileName.substring(fileName.lastIndexOf(userSeparator)+1,fileName.length()-1);
                if(fileName.startsWith( "\""))
                  fileName = fileName.substring( 1);
              }
            }
            name = name.substring(1,name.length()-1);
            if (name.equals("file")) {
              if (buffer!=null)
                buffer.close();
              lastFileName = fileName;
            
              
	          	File dir1 = new File(homeDir+fileName);
	          	if(!dir1.exists()){
	              buffer = new java.io.FileOutputStream(homeDir+fileName);
	              imagename=fileName;
	          	}
	          	else {
	          		return;
	          		
	          	}
            }
          }else if(s.startsWith("Content-Type") && state==1) {
            state = 2;
            contentType2 = s.substring(s.indexOf(":")+2,s.length()-2);
          }else if(s.equals("\r\n") && state != 3) {
            state = 3;
          }else {
            if (name.equals("file"))
              buffer.write(b,0,x);
          }
        }
        String masp=request.getParameter("masp");
	 	String tensp=request.getParameter("tensp");
	 	String maloai=request.getParameter("maloai");
//	 	Long gia=Long.parseLong(request.getParameter("gia"));
	 	String file=lastFileName;
	 	long gia=10000;
	 	String mota=request.getParameter("mota");
        SanphamService sp=new SanphamService();
        sp.createsp(masp,tensp,maloai,gia,file,mota);
        sis.close();
        buffer.close();
        
        
        
        
        
      }catch(java.io.IOException e) {
        err = e.toString();
      }
    }
    boolean ok = err.equals("");
    if(!ok) {
      out.println(err);
    }else{
    %>
<SCRIPT language="javascript">
  history.back(1)
  alert('Them thanh cong: <%=lastFileName%>');
  document.write("<img src='images/<%=lastFileName%>'>");
 // window.location.reload(false)
</SCRIPT>
    <%
    }
    out.println("done");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.io.ObjectInputStream.GetField"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="uploadForm" action="/upload" enctype="multipart/form-data" method="post">
  <input type="text" name="masp"/>
  <input type="text" name="tensp"/>
  <input type="text" name="maloai"/>
  <input type="text" name="gia"/>
  <input type="text" name="mota"/>
  <input type="file" name="file"/>
  
  <input TYPE=Button name='Upload' Value='Upload' onClick="uploadForm.Upload.value='Uploading...';document.uploadForm.action='upload';document.uploadForm.submit()">
</form>
</body>
</html>
