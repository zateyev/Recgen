package ru.tpu.recgen.dao;

import ru.tpu.recgen.entity.Title;

public class JdbcTitleDao implements TitleDao {
    @Override
    public Title findById(Long l) {
        return null;
    }

    @Override
    public Title findByEmail(String email) {
        return null;
    }

    @Override
    public void update(Title title) {

    }

    @Override
    public Title save(Title title) {
        return null;
    }

    @Override
    public Title merge(Title title) {
        return null;
    }

    @Override
    public Title insert(Title title) {
        return null;
    }

    @Override
    public boolean remove(Title title) {
        return false;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }
}
