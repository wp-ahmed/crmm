package site.easytobuild.multipurpose.service;

import site.easytobuild.multipurpose.entity.Business;

import java.security.Principal;

public interface BusinessService {
    public Business findByBusinessId(int businessId);

    public Business findByBusinessName(String businessName);
    void save(Business business, Principal principal);

    void deleteByBusinessId(int businessId);
}
