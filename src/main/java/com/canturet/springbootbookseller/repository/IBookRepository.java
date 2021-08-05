package com.canturet.springbootbookseller.repository;

import com.canturet.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long>
{

}
