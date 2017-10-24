package net.lustenauer.jpademo.repository;

import net.lustenauer.jpademo.data.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Patric Hollenstein on 24.10.17.
 *
 * @author Patric Hollenstein
 */
@Repository
public interface SchoolRepository extends JpaRepository<School,Integer> {

}

