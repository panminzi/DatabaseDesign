package com.example.databasedesign.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "grade_table")//表名，不加就是文件名,后面部分是索引，cnumber是索引字段，unique使他唯一
public class Grade {
    @ColumnInfo(name = "课程名")
    private String cname;
    @PrimaryKey
    private Integer cnumber;//课程号
    @PrimaryKey
    private Integer snumber;//学号
    @ColumnInfo(name = "总评")
    private Integer grade;//总评



    public Grade(Integer cnumber,Integer snumber,Integer grade,String cname) {
        this.cnumber = cnumber;
        this.snumber = snumber;
        this.grade = grade;
        this.cname=cname;
    }

    public Integer getCnumber() {
        return cnumber;
    }

    public Integer getSnumber() {
        return snumber;
    }

    public Integer getGrade() {
        return grade;
    }

    public String getCname() {
        return cname;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "cname='" + cname + '\'' +
                ", cnumber=" + cnumber +
                ", snumber=" + snumber +
                ", grade=" + grade +
                '}';
    }
}
