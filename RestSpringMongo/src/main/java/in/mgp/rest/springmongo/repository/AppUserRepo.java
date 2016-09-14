package in.mgp.rest.springmongo.repository;

import in.mgp.rest.springmongo.domain.AppUser;
import in.mgp.rest.springmongo.domain.Commodity;

import java.util.List;

public interface AppUserRepo {

	/**
	 * check Presence of the AppUser in the app
	 * 
	 * @param appUser
	 * @return
	 */
	AppUser checkUser(AppUser appUser);

	/**
	 * get the list of Users along with the Commodity details
	 * 
	 * @return
	 */
	List<AppUser> getAllAppUserAndCommodity();

	/**
	 * get the list of Users without Commodity and further details.
	 * 
	 * @return
	 */
	List<AppUser> getAllAppUser();

	/**
	 * create the appuser
	 * 
	 * @param appUser
	 */
	void createAppUser(AppUser appUser);

	/**
	 * create the commodity and return the generated the commodity id
	 * 
	 * @param commodity
	 * @return
	 */
	String createCommodity(Commodity commodity);

	/**
	 * get the friends list of the current user
	 * 
	 * @param userId
	 * @return
	 */
	List<AppUser> getUsersFriends(String userId);

	/**
	 * update the user if any details to be updated
	 * 
	 * @param appUser
	 */
	void updateAppUser(AppUser appUser);

	boolean updateAppUser(AppUser thisUser, AppUser thisUserFriendsDetails);

	/**
	 * find the App user for the provided Id
	 * 
	 * @param userId
	 * @return
	 */
	AppUser findAppUser(String userId);

	/**
	 * delete the app user
	 * 
	 * @param appUser
	 */
	void deleteAppUser(AppUser appUser);

	/**
	 * create complete Collection
	 */
	public void createAppUserCollection();

	/**
	 * drop all the collections of AppUser
	 */
	public void dropAppUserCollection();

}
