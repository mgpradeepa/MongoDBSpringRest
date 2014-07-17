/**
 * 
 */
package in.mgp.rest.springmongo.resource.impl;

import in.mgp.rest.springmongo.domain.AppUser;
import in.mgp.rest.springmongo.resource.AppUserResource;

import java.util.List;

import javax.ws.rs.core.Response;

/**
 * @author GPS
 * 
 */
public class AppUserResourceImpl implements AppUserResource {

	@Override
	public List<AppUser> findAllAppUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppUser> findById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response createNewOrder(String orderId, String orderFor,
			String orderBy, String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppUser updateExistingUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAppUser(AppUser appUser) {
		// TODO Auto-generated method stub

	}

}
