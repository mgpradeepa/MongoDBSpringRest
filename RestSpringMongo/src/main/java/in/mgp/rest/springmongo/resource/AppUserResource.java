package in.mgp.rest.springmongo.resource;

import in.mgp.rest.springmongo.domain.AppUser;

import java.util.List;

import javax.ws.rs.core.Response;

public interface AppUserResource {

	public List<AppUser> findAllAppUsers();

	public List<AppUser> findById(String userId);

	public Response createNewOrder(String orderId, String orderFor,
			String orderBy, String customerName);

	public AppUser updateExistingUser(AppUser appUser);

	public void deleteAppUser(AppUser appUser);
}
