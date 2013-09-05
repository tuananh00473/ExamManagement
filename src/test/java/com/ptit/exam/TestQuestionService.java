package com.ptit.exam;

import com.ptit.exam.business.QuestionService;
import com.ptit.exam.persistence.entity.Question;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: Anhnt
 * Date: 8/25/13
 * Time: 12:19 AM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-spring-config.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class TestQuestionService
{
    @Autowired
    QuestionService questionService;

    @Autowired
    DatabaseInitialer databaseInitialer;

    @BeforeTransaction
    public void setUp() throws Exception
    {
        databaseInitialer.load();
    }

    @AfterTransaction
    public void tearDown() throws Exception
    {
        databaseInitialer.clean();
    }

    @Test
    public void testCreateNewMatchThenSaveToDB()
    {
        Question question = new Question("checkbox", "question 01");
        Question getMatch = questionService.insert(question);
        Assert.assertEquals("checkbox", getMatch.getType());
    }
}
