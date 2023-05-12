package jiho.springboot.semiprojectv6.service;

import jiho.springboot.semiprojectv6.model.Member1;

import javax.servlet.http.HttpSession;

public interface MemberService {
    boolean checkLogin(Member1 m, HttpSession sess);

}
