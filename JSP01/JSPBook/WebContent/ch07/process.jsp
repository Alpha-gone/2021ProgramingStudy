<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="com.oreilly.servlet.*" %>
<%@ page import="com.oreilly.servlet.multipart.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>

<%
	MultipartRequest multi = new MultipartRequest(
		request,
		"E:\\class\\JSP01\\upload", //저장 경로
		5 * 1024 * 1024, //5Mb 5* 2^10 * 2^10
		"utf-8", //유니 코드 설정
		new DefaultFileRenamePolicy() //같은 이름의 파일이 업로드 폴더에 존재하면 뒤에 숫자를 추가 
		);

	String t = multi.getParameter("title");
	out.println("<h3>" + t + "</h3>");
	
	Enumeration files = multi.getFileNames();
	String name = (String)files.nextElement();
	
	String filename = multi.getFilesystemName(name);
	String original = multi.getOriginalFileName(name);
	
	out.println("실제 파일 이름 : " + original + "<br>");
	out.println("저장 파일 이름 : " + filename + "<br>");
	
%>
