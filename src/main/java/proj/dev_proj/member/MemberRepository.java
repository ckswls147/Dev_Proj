package proj.dev_proj.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemberRepository {

    private HashMap<Long, Member> store = new HashMap<Long, Member>();

    private long sequence = 0L;

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll(Member member) {
        return new ArrayList<>(store.values());
    }

    public void update(Long memberId, Member updateParam) {
        Member findMember = findById(memberId);
        findMember.setPassword(updateParam.getPassword());
        findMember.setNickname(updateParam.getNickname());
    }

    public boolean validation(String pwd1, String pwd2) {
        if (pwd1.equals(pwd2)) {
            return true;
        } else {
            return false;
        }
    }

}
