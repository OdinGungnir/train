package com.ol.dao;

import com.ol.entity.system.ExamStu;
import com.ol.entity.system.ExamStuVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamStuMapper {
    int countByExample(ExamStuVO example);

    int deleteByExample(ExamStuVO example);

    int deleteByPrimaryKey(Integer examStuId);

    int insert(ExamStu record);

    int insertSelective(ExamStu record);

    List<ExamStu> selectByExample(ExamStuVO example);

    ExamStu selectByPrimaryKey(Integer examStuId);

    int updateByExampleSelective(@Param("record") ExamStu record, @Param("example") ExamStuVO example);

    int updateByExample(@Param("record") ExamStu record, @Param("example") ExamStuVO example);

    int updateByPrimaryKeySelective(ExamStu record);

    int updateByPrimaryKey(ExamStu record);
}