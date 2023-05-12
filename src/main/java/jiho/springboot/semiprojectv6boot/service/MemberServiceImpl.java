package jiho.springboot.semiprojectv6boot.service;

import jiho.springboot.semiprojectv5.dao.MemberDAO;
import jiho.springboot.semiprojectv5.model.Member1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service("msrv")
public class MemberServiceImpl implements MemberService {

    @Autowired private MemberDAO mdao;

    @Override
    public boolean checkLogin(Member1 m, HttpSession sess) {
        boolean isLogin = false;

        // 로그인 가능여부 확인
        if (mdao.selectLogin(m) > 0) {
            // 로그인 가능하면 새션변수에 아이디를 저장
            sess.setAttribute("UID", m.getUserid());
            isLogin = true;
        }

        return isLogin;
    }

}
