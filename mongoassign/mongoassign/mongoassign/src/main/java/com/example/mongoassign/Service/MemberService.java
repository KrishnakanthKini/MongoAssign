package com.example.mongoassign.Service;

import com.example.mongoassign.model.Member;

import java.util.List;

public interface MemberService {
    public Member createMember(Member m);
    public List<Member> getAllMembers();
    public void deleteMember(String memberId);
    public Member updateMember(Member m);
}
