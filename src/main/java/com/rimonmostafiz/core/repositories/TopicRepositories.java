package com.rimonmostafiz.core.repositories;

import com.rimonmostafiz.core.models.Topic;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Rimon Mostafiz
 */
public interface TopicRepositories extends CrudRepository<Topic, String> {}
