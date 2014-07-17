package in.mgp.rest.springmongo.service;

import in.mgp.rest.springmongo.domain.AppUser;

import java.util.List;

public interface AppUserService<T> {

	List<T> findAll();

	T findById();

	void createAppUser(AppUser appUser);

	public void createAppUserCollection();

	public void dropAppUserCollection();

}
