package proj.dev_proj.member;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    Long join(Member member, String password_check);

    Member findOne(Long memberId);

    }
