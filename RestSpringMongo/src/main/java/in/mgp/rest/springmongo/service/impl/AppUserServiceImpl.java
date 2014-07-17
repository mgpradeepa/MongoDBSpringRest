/**
 * 
 */
package in.mgp.rest.springmongo.service.impl;

import in.mgp.rest.springmongo.domain.AppUser;
import in.mgp.rest.springmongo.repository.AppUserRepo;
import in.mgp.rest.springmongo.service.AppUserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author GPS
 * 
 */
@Service
@Scope("singleton")
public class AppUserServiceImpl<T> implements AppUserService<T> {

	@Autowired
	AppUserRepo repo;

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public T findById() {
		// TODO Auto-generated method stub
		return (T) new AppUser();
	}

	@Override
	public void createAppUser(AppUser appUser) {

		repo.createAppUser(appUser);

	}

	@Override
	public void createAppUserCollection() {

		repo.createAppUserCollection();
	}

	@Override
	public void dropAppUserCollection() {
		repo.dropAppUserCollection();
	}

}
