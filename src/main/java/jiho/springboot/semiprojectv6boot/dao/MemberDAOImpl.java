package jiho.springboot.semiprojectv6boot.dao;

import jiho.springboot.semiprojectv5.model.Member1;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("mdao")
public class MemberDAOImpl implements MemberDAO{

    @Autowired SqlSession sqlSession;

    @Override
    public int selectLogin(Member1 m) {
        return sqlSession.selectOne("member.selectLogin",m);
    }


}
