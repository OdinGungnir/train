package com.ol.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ol.entity.system.ExamStu;
import com.ol.service.StuService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/stu")
public class StuController {
	@Autowired
	private StuService ss;
	
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model,@ModelAttribute ExamStu examstu){
		return "student/stulist";
	}
	@RequestMapping(value="/load",method=RequestMethod.POST)
	public void load(HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		JSONObject json=new JSONObject();
		List<ExamStu> list=ss.load();
		if(list==null || list.size()<1){
			try {
				json.put("rows", "");
				response.getWriter().write(json.toString());
				return;
			} catch (IOException e) {
				return;
			}
		}
		JSONArray arrList=JSONArray.fromObject(list);
		
		json.put("rows", arrList);
		try {
			response.getWriter().write(json.toString());
			response.getWriter().close();
		} catch (IOException e) {
			return;
		}
		
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void add(HttpServletResponse response, @Valid ExamStu examStu, BindingResult br){
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		JSONObject json=new JSONObject();
		if(br.hasErrors())
		{
			json.put("result", "error");
			json.put("message", "数据不合法!请重新填写");
			try {
				response.getWriter().write(json.toString());
				response.getWriter().close();
			} catch (IOException e) {
				return;
			}
			return;
		}
		int result=ss.save(examStu);
		if(result!=1){
			json.put("result", "error");
			json.put("message", "添加失败!");
			try {
				response.getWriter().write(json.toString());
				response.getWriter().close();
			} catch (IOException e) {
				return;
			}
			return;
		}
		json.put("result", "success");
		json.put("message", "添加成功!");
		try {
			response.getWriter().write(json.toString());
			response.getWriter().close();
		} catch (IOException e) {
			return;
		}
		return;
	}
	@RequestMapping(value="/{examStuId}/delete",method=RequestMethod.GET)
	public void delete(@PathVariable Integer examStuId,HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		int result=ss.delete(examStuId);
		JSONObject json=new JSONObject();
		if(result!=1){
			json.put("result", "error");
			json.put("message","删除失败!");
			try {
				response.getWriter().write(json.toString());
				response.getWriter().close();
				return;
			} catch (IOException e) {
				return;
			}
		}
		json.put("result", "success");
		json.put("message","删除成功!");
		try {
			response.getWriter().write(json.toString());
			response.getWriter().close();
		} catch (IOException e) {
			return;
		}
	}
	@RequestMapping(value="/{examStuId}/update",method=RequestMethod.GET)
	public void update(HttpServletResponse response,@PathVariable Integer examStuId){
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		ExamStu examStu=ss.find(examStuId);
		JSONObject json=new JSONObject();
		if(examStu==null){
			json.put("result", "error");
			json.put("message", "学生不存在!");
			try {
				response.getWriter().write(json.toString());
				response.getWriter().close();
			} catch (IOException e) {
				return;
			}
		}else{
			JSONArray arry=JSONArray.fromObject(examStu);
			json.put("result", "success");
			json.put("examStu", arry);
			try {
				response.getWriter().write(json.toString());
				response.getWriter().close();
			} catch (IOException e) {
				return;
			}
		}
	}
	@RequestMapping(value="/{examStuId}/update",method=RequestMethod.POST)
	public void update(HttpServletResponse response,@PathVariable Integer examStuId,ExamStu examStu){
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		JSONObject json=new JSONObject();
		if(ss.update(examStu)!=1){
			json.put("result", "error");
			json.put("message","更新失败!");
			try {
				response.getWriter().write(json.toString());
				response.getWriter().close();
			} catch (IOException e) {
				return;
			}
			return;
		}
		json.put("result", "success");
		json.put("message","更新成功!");
		try {
			response.getWriter().write(json.toString());
			response.getWriter().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return;
		}
	}
	
}
