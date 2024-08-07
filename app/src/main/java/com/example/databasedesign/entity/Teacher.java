package com.example.databasedesign.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "teacher_table",indices = {@Index(value={"tnumber"},unique = true)})//表名，不加就是文件名,后面部分是索引，tnumber是索引字段，unique使他唯一
public class Teacher {
    @PrimaryKey
    private Integer tnumber;//教师号
    @ColumnInfo(name="教师名")//字段名
    private String tname;//姓名
    @ColumnInfo(name = "所在学院")
    private String tcollege;//学院

    public Teacher(Integer tnumber,String name,String college) {
        this.tnumber = tnumber;
        this.tname = name;
        this.tcollege = college;
    }

    public Integer getTnumber() {
        return tnumber;
    }

    public String getName() {
        return tname;
    }

    public String getCollege() {
        return tcollege;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tnumber=" + tnumber +
                ", name='" + tname + '\'' +
                ", college='" + tcollege + '\'' +
                '}';
    }
}
