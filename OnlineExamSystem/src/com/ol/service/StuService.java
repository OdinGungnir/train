package com.ol.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ol.dao.ExamStuMapper;
import com.ol.entity.system.ExamStu;
import com.ol.entity.system.ExamStuVO;
import com.ol.util.DateUtil;

@Service
public class StuService {
	
	@Autowired
	private ExamStuMapper examStuMapper;
	
	public List<ExamStu> load(){
		List<ExamStu> examList=examStuMapper.selectByExample(new ExamStuVO());
		if(examList.size()<1){
			return null;
		}
		if(examList!=null && examList.size()>0){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			for (int i = 0; i < examList.size(); i++) {
				ExamStu stu=examList.get(i);
				String date=sdf.format(stu.getExamStuBirthday());
				String tip=DateUtil.dayForWeekTips(date);
				stu.setBirthday(date+tip);
			}
		}
		return examList;
	}
	/**
	 * 
	 * @param examStu
	 * @return success=1 error=-1
	 */
	public int save(ExamStu examStu){
		int i=-1;
		try {
			i=examStuMapper.insertSelective(examStu);
		} catch (Exception e) {
			return -1;
			// TODO: handle exception
		}
		if(i!=0){
			return 1;
		}
		return -1;
	}
	public int delete(Integer id){
		int i=-1;
		try {
			i=examStuMapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			return -1;
			// TODO: handle exception
		}
		return i;
	}
	public ExamStu find(Integer id){
		return examStuMapper.selectByPrimaryKey(id);
	}
	public int update(ExamStu examStu){
		
		return examStuMapper.updateByPrimaryKeySelective(examStu);
		
	}
}
