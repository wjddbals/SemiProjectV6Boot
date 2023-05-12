package jiho.springboot.semiprojectv6.dao;

import jiho.springboot.semiprojectv6.model.Member1;

public interface MemberDAO {
    int selectLogin(Member1 m);
}
