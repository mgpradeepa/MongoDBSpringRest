package in.mgp.rest.springmongo.repository.impl;

import in.mgp.rest.springmongo.domain.AppUser;
import in.mgp.rest.springmongo.domain.Commodity;
import in.mgp.rest.springmongo.repository.AppUserRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Scope("singleton")
public class AppUserRepoImpl implements AppUserRepo {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public AppUser checkUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppUser> getAllAppUserAndCommodity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createAppUser(AppUser appUser) {
		mongoTemplate.insert(appUser);
	}

	@Override
	public String createCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppUser> getUsersFriends(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAppUser(AppUser appUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean updateAppUser(AppUser thisUser,
			AppUser thisUserFriendsDetails) {

		// mongoTemplate.updateFirst(query, update, entityClass)
		return false;
	}

	@Override
	public AppUser findAppUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAppUser(AppUser appUser) {
	}

	@Override
	public void createAppUserCollection() {

		if (!mongoTemplate.collectionExists(AppUser.class)) {
			mongoTemplate.createCollection(AppUser.class);
		}
	}

	@Override
	public void dropAppUserCollection() {
		if (mongoTemplate.collectionExists(AppUser.class)) {
			mongoTemplate.dropCollection(AppUser.class);
		}

	}

	@Override
	public List<AppUser> getAllAppUser() {
		return mongoTemplate.find(null, AppUser.class);
	}
}
