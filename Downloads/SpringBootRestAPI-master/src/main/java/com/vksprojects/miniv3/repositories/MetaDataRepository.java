package com.vksprojects.miniv3.repositories;

import com.vksprojects.miniv3.models.metadata.MetaData;
import com.vksprojects.miniv3.models.user.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by vivek on 3/13/18.
 */
@Repository
public interface MetaDataRepository extends JpaRepository<MetaData, String>{

    public List<MetaData> findAllByUserOrderByTimeCreatedDesc(User user, Pageable pageable);

    public List<OnlyNameAndUserId> findAllByTimeCreatedBetweenOrderByUserAsc(LocalDateTime start, LocalDateTime end);

    public MetaData findOneByUserAndName(User user, String name);

}
