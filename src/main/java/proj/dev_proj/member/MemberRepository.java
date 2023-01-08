package proj.dev_proj.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Member findById(Long id);

    Optional<Member> findByName(String username);

    Optional<Member> findByNickName(String nickname);

    List<Member> findAll();

    void update(Long memberId, Member updateParam);
}