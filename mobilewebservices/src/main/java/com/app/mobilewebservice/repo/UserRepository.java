package com.app.mobilewebservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.mobilewebservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Modifying
	@Query("update User u set u.status = ?2 where u.uid = ?1")
	public int updateUserStatus(String uid, boolean status);

	@Modifying
	@Query("update User u set u.gcmId = ?2 where u.uid = ?1")
	public int updateUserGCM(String uid, String gcmId);

	public List<User> findByStaus(boolean status);

}
