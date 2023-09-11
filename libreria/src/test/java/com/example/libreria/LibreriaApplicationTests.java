package com.example.libreria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;


@DataJpaTest
public abstract class LibreriaApplicationTests {

    @Autowired
    protected TestEntityManager entityManager;

}
