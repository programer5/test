package chapter5.ch14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        this.hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        this.hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (this.hashMap.containsKey(memberId)) {
            this.hashMap.remove(memberId);
        }
        System.out.println("no element");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> iterator = this.hashMap.keySet().iterator();

        while (iterator.hasNext()) {
            int key = iterator.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }
}
