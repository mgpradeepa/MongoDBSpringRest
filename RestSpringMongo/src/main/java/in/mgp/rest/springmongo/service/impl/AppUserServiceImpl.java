/**
 * 
 */
package in.mgp.rest.springmongo.service.impl;

import in.mgp.rest.springmongo.domain.AppUser;
import in.mgp.rest.springmongo.repository.AppUserRepo;
import in.mgp.rest.springmongo.service.AppUserService;

import java.util.ArrayList;
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
public class AppUserServiceImpl implements AppUserService {

	@Autowired
	AppUserRepo repo;

	@Override
	public List<AppUser> findAll() {

		List<AppUser> resultUsersList = new ArrayList<AppUser>();
		List<AppUser> friendList = null;

		for (AppUser appUser : repo.getAllAppUser()) {
			AppUser user = new AppUser();
			user.setUserId(appUser.getUserId());
			user.setUserName(appUser.getUserName());
			user.setUserConnect(appUser.getUserConnect());
			if (appUser.getUserFriends().size() > 0) {
				friendList = new ArrayList<AppUser>();
				for (AppUser friends : appUser.getUserFriends()) {

					AppUser friendData = new AppUser();
					friendData.setUserId(friends.getUserId());
					friendData.setUserName(friends.getUserName());
					friendList.add(friendData);
				}

				user.setUserFriends(friendList);

			} else {
				user.setUserFriends(null);
			}
			resultUsersList.add(user);

		}

		return resultUsersList;
	}

	@Override
	public AppUser findById() {
		// TODO Auto-generated method stub
		return new AppUser();
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
