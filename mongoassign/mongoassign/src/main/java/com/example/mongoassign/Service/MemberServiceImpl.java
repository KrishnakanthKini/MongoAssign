package com.example.mongoassign.Service;

import com.example.mongoassign.Repository.MembersRepository;
import com.example.mongoassign.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MembersRepository memberRepository;


    @Override
    public Member createMember(Member m) {
        // TODO Auto-generated method stub
        return memberRepository.save(m);
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }


    @Override
    public void deleteMember(String memberId) {
        // TODO Auto-generated method stub
        memberRepository.deleteById(memberId);
    }

    @Override
    public Member updateMember(Member member) {
        // TODO Auto-generated method stub
        Optional<Member> m1 = memberRepository.findById(member.getMemberId());
        Member m2=m1.get();
        m2.setFirstName(member.getFirstName());
        m2.setMiddleName(member.getMiddleName());
        m2.setLastName(member.getLastName());
        memberRepository.save(m2);
        return member;
    }
}
