package com.ptit.exam.persistence.dao;

import com.ptit.exam.persistence.entity.Question;

import java.util.List;

/**
 * User: Administrator
 * Date: 8/22/13
 * Time: 9:36 PM
 */
public interface QuestionDAO
{
    public Question findById(Long id);

    public Question insert(Question question);

    public void update(Question question);

    public void deleteById(Long id);

    public void delete(Question question);

    public List<Question> getAll();

}
