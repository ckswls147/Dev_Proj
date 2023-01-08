package proj.dev_proj.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class MemberRepositoryImpl implements MemberRepository {

    private HashMap<Long, Member> store = new HashMap<Long, Member>();

    private long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Member findById(Long id) {
        return store.get(id);
    }

    @Override
    public Optional<Member> findByName(String username) {
        return store.values().stream()
                .filter(member -> member.getUsername().equals(username))
                .findAny();
    }
    @Override
    public Optional<Member> findByNickName(String nickname) {
        return store.values().stream()
                .filter(member -> member.getNickname().equals(nickname))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void update(Long memberId, Member updateParam) {
        Member findMember = findById(memberId);
        findMember.setPassword(updateParam.getPassword());
        findMember.setNickname(updateParam.getNickname());
    }


}
