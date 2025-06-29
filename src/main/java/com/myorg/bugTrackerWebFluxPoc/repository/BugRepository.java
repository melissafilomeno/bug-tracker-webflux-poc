package com.myorg.bugTrackerWebFluxPoc.repository;

import com.myorg.bugTrackerWebFluxPoc.entity.Bug;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugRepository extends R2dbcRepository<Bug, String> {

}