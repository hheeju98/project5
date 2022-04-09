package site.metacoding.project5.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardTblRepository extends JpaRepository<BoardTbl, Integer> {

}
