package io.github.chw3021.bookmakase.Repository;

import java.util.Optional;
import io.github.chw3021.bookmakase.domain;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transactional;

@Transactional
public class MemberRepository extends Repository{

    private static Map<Long, Member> MemberData = new HashMap<>();//해쉬맵 형태로 멤버 저장.
    private static long sequence = 0L; //0,1,2 ... 키값 생성

    Optional<Member> findByAccount(String account);
    //Account로 member 찾기. account는 차후 논의

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        MemberData.put(member.getId(),member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(MemberData.get(id));
        //optional을 사용해 결과값이 null일때 에러나는것 방지(값을 감싸서 반환)
    }

    @Override
    public Optional<Member> findByName(String name) {
        return MemberData.values().stream().filter(member -> member.getName().equals(name))
                .findAny();

    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(MemberData.values()); //전체목록 가져오기
    }

    public void clearMemberData(){
        MemberData.clear(); //멤버 데이터 초기화
    }

}