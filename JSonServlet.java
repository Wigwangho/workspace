package com.example.demo.ch6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//문서의 확장자는 중요하지 않다.
//이 문서의 정체성은 MIME TYPE에 의해 결정됨

@WebServlet("/mime/json.do")
public class JSonServlet extends HttpServlet {

	Logger logger = LoggerFactory.getLogger(JSonServlet.class);
	//URL 패턴이 힐요함. 1. exactly, 2:/basic/* 3. *.do 4. :/ -root directory
	//-> http://localhost:8000/mime/json.do -> get 방식만.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//res.setContentType("application/json");
		res.setContentType("text/html");
    //mime type 결정
		PrintWriter out = res.getWriter();
		List<Map<String,Object>> list = new ArrayList<>();
		Map<String, Object> rmap = new HashMap<>();
		rmap.put("deptno", 10);
		rmap.put("dname", "총무부");
		rmap.put("loc", "서울");
		list.add(rmap);
		rmap = new HashMap<>();
		rmap.put("deptno", 20);
		rmap.put("dname", "개발부");
		rmap.put("loc", "인천");
		list.add(rmap);
		rmap = new HashMap<>();//select deptno, dname, loc from dept
		rmap.put("deptno", 30);
		rmap.put("dname", "운영부");
		rmap.put("loc", "서울");
		list.add(rmap);
		//확장자 이름이 아닌 mime type 에 집중하라
		//리액트의 어떤 코드가 이 url 패턴을 가져가는가
		//언어 - 자바스크립트 - 전송 - (get, post) - axiios, 
		Gson g = new Gson();
		String temp = g.toJson(list);
		//out.print(list);//JSON 형식에 맞지 앟음 - 키와 값 사이에 대입연산자가 있으므로. ReactJS 조심
		out.print(temp);
		
	}
}
