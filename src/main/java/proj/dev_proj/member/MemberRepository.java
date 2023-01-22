package proj.dev_proj.member;

import java.util.List;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);

    List<Member> findAll();

    List<Member> findByUsername(String username);

    List<Member> findByNickName(String nickname);

    void update(Long memberId, Member updateParam);
}