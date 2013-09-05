package com.ptit.exam.business;

import com.ptit.exam.persistence.entity.Answer;

import java.util.List;

/**
 * User: Anhnt
 * Date: 9/4/13
 * Time: 2:39 PM
 */
public interface AnswerService
{
    public Answer findById(Long id);

    public Answer insert(Answer answer);

    public void update(Answer answer);

    public void deleteById(Long id);

    public void delete(Answer answer);

    public List<Answer> getAll();
}
