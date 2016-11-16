package ru.tpu.recgen.dao;

import ru.tpu.recgen.entity.Author;

public interface AuthorDao {
    Author findById(Long l);

    Author findByEmail(String email);

    void update(Author author);

    Author save(Author author);

    Author merge(Author author);

    Author insert(Author author);

    boolean remove(Author author);

    boolean removeById(Long id);
}
