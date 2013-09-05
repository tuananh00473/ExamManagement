package com.ptit.exam.persistence.dao;

import com.ptit.exam.persistence.entity.Answer;

import java.util.List;

/**
 * User: Anhnt
 * Date: 9/4/13
 * Time: 2:29 PM
 */
public interface AnswerDAO
{
    public Answer findById(Long id);

    public Answer insert(Answer answer);

    public void update(Answer answer);

    public void deleteById(Long id);

    public void delete(Answer answer);

    public List<Answer> getAll();
}
