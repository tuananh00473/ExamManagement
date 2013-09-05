package com.ptit.exam.persistence.dao.impl;

import com.ptit.exam.persistence.dao.AnswerDAO;
import com.ptit.exam.persistence.entity.Answer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * User: Anhnt
 * Date: 9/4/13
 * Time: 2:32 PM
 */
@Component("answerDAO")
@Transactional
@Repository
public class AnswerDAOImpl implements AnswerDAO
{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Answer findById(Long id)
    {
        return entityManager.find(Answer.class, id);
    }

    @Override
    public Answer insert(Answer answer)
    {
        entityManager.persist(answer);
        return answer;
    }

    @Override
    public void update(Answer answer)
    {
        entityManager.merge(answer);
    }

    @Override
    public void deleteById(Long id)
    {
        Answer answer = findById(id);
        if (answer.getId() != null)
        {
            entityManager.remove(id);
        }
    }

    @Override
    public void delete(Answer answer)
    {
        entityManager.remove(answer);
    }

    @Override
    public List<Answer> getAll()
    {
        Query query = entityManager.createQuery("select a from Answer a");
        return query.getResultList();
    }
}
