package jiho.springboot.semiprojectv6boot.dao;

import jiho.springboot.semiprojectv5.model.Member1;
import jiho.springboot.semiprojectv5.model.Zipcode;

import java.util.List;

public interface JoinDAO {

    List<Zipcode> selectZipcode(String dong);

    int insertMember(Member1 m);

    int selectOneUserid(String uid);
    int selectOneMember(Member1 m);

}
