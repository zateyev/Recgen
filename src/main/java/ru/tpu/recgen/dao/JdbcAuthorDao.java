package ru.tpu.recgen.dao;

import ru.tpu.recgen.entity.Author;

public class JdbcAuthorDao implements AuthorDao {
    @Override
    public Author findById(Long l) {
        return null;
    }

    @Override
    public Author findByEmail(String email) {
        return null;
    }

    @Override
    public void update(Author author) {

    }

    @Override
    public Author save(Author author) {
        return null;
    }

    @Override
    public Author merge(Author author) {
        return null;
    }

    @Override
    public Author insert(Author author) {
        return null;
    }

    @Override
    public boolean remove(Author author) {
        return false;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }
}
