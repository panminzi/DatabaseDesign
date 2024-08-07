package com.example.databasedesign.dao;

import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.databasedesign.entity.Grade;
import com.example.databasedesign.entity.Teacher;

import java.util.List;

public interface GradeDao {
    //查询
    @Query("select * from grade_table")//查询注解需要用sql语言，其他不需要
    List<Grade> getAll();

    //插入
    @Insert(onConflict = OnConflictStrategy.REPLACE)//括号内是插入冲突时采取新的替换旧的
    void insert(Teacher...teacher);//三个点表示多个

    //模糊查询
    @Query("select * from teacher_table where getCname() like :name")
    List<Teacher>findByName(String name);
    //删除
    void delete(Grade grade);
}
