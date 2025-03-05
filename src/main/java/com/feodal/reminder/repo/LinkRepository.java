package com.feodal.reminder.repo;

import com.feodal.reminder.models.Link;
import org.springframework.data.repository.CrudRepository;

public interface LinkRepository extends CrudRepository<Link, Long> {
    Link findByShortLink(String shortLink);
}
