package jiho.springboot.semiprojectv6boot.service;

import jiho.springboot.semiprojectv5.model.Member1;

import javax.servlet.http.HttpSession;

public interface MemberService {
    boolean checkLogin(Member1 m, HttpSession sess);

}
