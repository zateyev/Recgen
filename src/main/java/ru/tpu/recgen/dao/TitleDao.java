package ru.tpu.recgen.dao;

import ru.tpu.recgen.entity.Title;

public interface TitleDao {
    Title findById(Long l);

    Title findByEmail(String email);

    void update(Title title);

    Title save(Title title);

    Title merge(Title title);

    Title insert(Title title);

    boolean remove(Title title);

    boolean removeById(Long id);
}
