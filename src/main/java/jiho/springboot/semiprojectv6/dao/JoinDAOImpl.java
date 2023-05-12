package jiho.springboot.semiprojectv6.dao;

import jiho.springboot.semiprojectv6.model.Member1;
import jiho.springboot.semiprojectv6.model.Zipcode;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("jndao")
public class JoinDAOImpl implements JoinDAO {

    @Autowired private SqlSession sqlSession;

    @Override
    public List<Zipcode> selectZipcode(String dong) {
        return sqlSession.selectList("join.findZipcode", dong);
    }

    @Override
    public int insertMember(Member1 m) {
        return sqlSession.insert("join.insertMember",m);
    }

    @Override
    public int selectOneUserid(String uid) {
        return sqlSession.selectOne("join.selectOneUid",uid);
    }

    @Override
    public int selectOneMember(Member1 m) {
        return 0;
    }
}