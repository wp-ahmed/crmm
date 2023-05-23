package site.easytobuild.multipurpose.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.easytobuild.multipurpose.entity.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business,Integer> {
    public Business findByBusinessId(int businessId);

    public Business findByBusinessName(String businessName);
    void deleteByBusinessId(int businessId);

}
