package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

    private int age;
    private String userName;
    private Long id;

    public Member() {
    }

    public Member(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
}

