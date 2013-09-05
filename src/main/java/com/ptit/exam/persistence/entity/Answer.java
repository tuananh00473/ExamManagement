package com.ptit.exam.persistence.entity;

import org.apache.log4j.Logger;

import javax.persistence.*;

/**
 * User: Administrator
 * Date: 8/22/13
 * Time: 10:31 PM
 */

@Entity
@Table(name = "answer")
@SequenceGenerator(name = "answer_id_seq", sequenceName = "answer_id_seq", allocationSize = 1)
public class Answer
{
    //    ============= LOGGER ===============
    private static final Logger logger = Logger.getLogger(Answer.class);

    public Answer()
    {
        logger.debug("New entity is born. Type: " + this.getClass().getName());
    }

    //  ============= Attribute ==============
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "answer_correct")
    private boolean correct;

    @Column(name = "answer_content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question questionAnswerRelation;

    public Answer(boolean correct, String content, Question questionAnswerRelation)
    {
        this.correct = correct;
        this.content = content;
        this.questionAnswerRelation = questionAnswerRelation;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public boolean isCorrect()
    {
        return correct;
    }

    public void setCorrect(boolean correct)
    {
        this.correct = correct;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public Question getQuestionAnswerRelation()
    {
        return questionAnswerRelation;
    }

    public void setQuestionAnswerRelation(Question questionAnswerRelation)
    {
        this.questionAnswerRelation = questionAnswerRelation;
    }
}
