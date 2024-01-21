package sample2.pkg2;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import sample2.pkg1.Member;

public class MemberList {
    private final List<Member> members;

    public MemberList() {
        members = new ArrayList<Member>();
    }

    public void add(Member member) {
        members.add(member);
    }

    public Member get(int i) {
        return members.get(i);
    }

    public void remove(Member member) {
        members.remove(member);
    }

    public int count() {
        return members.size();
    }
}