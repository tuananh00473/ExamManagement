package com.ptit.exam.persistence.entity;

import org.apache.log4j.Logger;

import javax.persistence.*;
import java.util.List;

/**
 * User: Administrator
 * Date: 8/22/13
 * Time: 10:28 PM
 */
@Entity
@Table(name = "question")
@SequenceGenerator(name = "question_id_seq", sequenceName = "question_id_seq", allocationSize = 1)

public class Question
{
    //    ============= LOGGER ===============
    private static final Logger logger = Logger.getLogger(Question.class);

    public Question()
    {
        logger.debug("New entity is born. Type: " + this.getClass().getName());
    }

    //  ============= Attribute ==============
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "question_type")
    private String type;

    @Column(name = "question_content")
    private String content;

    @OneToMany(mappedBy = "questionAnswerRelation")
    private List<Answer> answerList;

    public Question(String type, String content)
    {
        this.type = type;
        this.content = content;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public List<Answer> getAnswerList()
    {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList)
    {
        this.answerList = answerList;
    }
}
