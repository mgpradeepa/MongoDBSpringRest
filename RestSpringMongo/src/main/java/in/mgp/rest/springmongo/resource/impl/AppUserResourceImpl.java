/**
 * 
 */
package in.mgp.rest.springmongo.resource.impl;

import in.mgp.rest.springmongo.domain.AppUser;
import in.mgp.rest.springmongo.resource.AppUserResource;
import in.mgp.rest.springmongo.service.AppUserService;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author GPS
 * 
 */
@Component
@Path("/v1/pconnect")
public class AppUserResourceImpl implements AppUserResource {

	static final Logger logger = LoggerFactory
			.getLogger(AppUserResourceImpl.class);

	@Autowired
	AppUserService appUserService;

	@Override
	@GET
	@Path("/allusers")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<AppUser> findAllAppUsers() {

		logger.info("Fetching the users");
		List<AppUser> allUsers = appUserService.findAll();
		if (!allUsers.isEmpty()) {
			Collections.sort(allUsers);

		}

		return allUsers;
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
