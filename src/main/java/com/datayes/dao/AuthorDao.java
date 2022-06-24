package com.datayes.dao;

import com.datayes.domain.Author;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AuthorDao {

    @Select("select ID,PSN_NAME FROM RESEARCH_REPORT_AUTHOR WHERE ID = #{ID}")
    List<Author> getAuthor(String ID);
}
