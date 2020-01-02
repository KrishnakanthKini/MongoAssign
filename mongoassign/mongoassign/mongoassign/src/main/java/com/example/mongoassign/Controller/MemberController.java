package com.example.mongoassign.Controller;

import com.example.mongoassign.Service.MemberServiceImpl;
import com.example.mongoassign.model.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class MemberController {
    @Autowired
    MemberServiceImpl memberService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/creates")
    public Member createMember(@RequestBody Member member){
        return memberService.createMember(member);
    }

    @RequestMapping("/displays")
    public List getAllMembers() {
        return memberService.getAllMembers();
    }

    @DeleteMapping("/deletes/{memberId}")
    public void deleteMember(@PathVariable String memberId) {
        memberService.deleteMember(memberId);
    }

    @PostMapping("/update")
    public Member updateMember(@RequestBody Member member) {
        return memberService.updateMember(member);
    }



}
