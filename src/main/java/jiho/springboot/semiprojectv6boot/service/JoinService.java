package jiho.springboot.semiprojectv6boot.service;

import jiho.springboot.semiprojectv5.model.Member1;

public interface JoinService {
    String findZipcode(String dong);

    boolean newMember(Member1 m);

    int checkUserid(String uid);
    boolean loginMember(Member1 m);

}
