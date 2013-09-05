package com.ptit.exam.business.impl;

import com.ptit.exam.business.AnswerService;
import com.ptit.exam.persistence.dao.AnswerDAO;
import com.ptit.exam.persistence.entity.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User: Anhnt
 * Date: 9/4/13
 * Time: 2:40 PM
 */
@Component
public class AnswerServiceImpl implements AnswerService
{

    @Autowired
    AnswerDAO answerDAO;

    @Override
    public Answer findById(Long id)
    {
        return answerDAO.findById(id);
    }

    @Override
    public Answer insert(Answer answer)
    {
        return answerDAO.insert(answer);
    }

    @Override
    public void update(Answer answer)
    {
        answerDAO.update(answer);
    }

    @Override
    public void deleteById(Long id)
    {
        answerDAO.deleteById(id);
    }

    @Override
    public void delete(Answer answer)
    {
        answerDAO.delete(answer);
    }

    @Override
    public List<Answer> getAll()
    {
        return answerDAO.getAll();
    }
}
