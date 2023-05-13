package myWebProject.web.repository;

import lombok.RequiredArgsConstructor;
import myWebProject.web.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member){
        em.persist(member);
    }

    public Member findMember(Long id){
        return em.find(Member.class, id);
    }
}
