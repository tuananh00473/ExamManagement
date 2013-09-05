package com.ptit.exam.persistence.dao.impl;

import com.ptit.exam.persistence.dao.QuestionDAO;
import com.ptit.exam.persistence.entity.Question;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * User: Administrator
 * Date: 8/22/13
 * Time: 9:37 PM
 */

@Component("questionDAO")
@Transactional
@Repository
public class QuestionDAOImpl implements QuestionDAO
{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Question findById(Long id)
    {
        return entityManager.find(Question.class, id);
    }

    @Override
    public Question insert(Question question)
    {
        entityManager.persist(question);
        return question;
    }

    @Override
    public void update(Question question)
    {
        entityManager.merge(question);
    }

    @Override
    public void deleteById(Long id)
    {
        Question question = findById(id);
        if (question.getId() != null)
        {
            entityManager.remove(id);
        }
    }

    @Override
    public void delete(Question question)
    {
        entityManager.remove(question);
    }

    @Override
    public List<Question> getAll()
    {
        Query query = entityManager.createQuery("select q from Question q");
        return query.getResultList();
    }
}
