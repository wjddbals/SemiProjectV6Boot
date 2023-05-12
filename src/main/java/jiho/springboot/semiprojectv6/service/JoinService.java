package jiho.springboot.semiprojectv6.service;

import jiho.springboot.semiprojectv6.model.Member1;

public interface JoinService {
    String findZipcode(String dong);

    boolean newMember(Member1 m);

    int checkUserid(String uid);
    boolean loginMember(Member1 m);

}
