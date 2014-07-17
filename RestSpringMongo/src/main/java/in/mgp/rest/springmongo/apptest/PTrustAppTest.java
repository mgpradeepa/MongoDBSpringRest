package in.mgp.rest.springmongo.apptest;

import in.mgp.rest.springmongo.domain.AppUser;
import in.mgp.rest.springmongo.domain.Commodity;
import in.mgp.rest.springmongo.service.AppUserService;
import in.mgp.rest.springmongo.service.impl.AppUserServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PTrustAppTest {

	static final org.slf4j.Logger LOGGER = LoggerFactory
			.getLogger(PTrustAppTest.class);

	public static void main(String[] args) {

		LOGGER.info("BootStrapping th application through main class ");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContextPTrust.xml");

		AppUserService appUserService = context
				.getBean(AppUserServiceImpl.class);
		appUserService.dropAppUserCollection();
		appUserService.createAppUserCollection();

		// User One
		AppUser appUser1 = new AppUser();
		appUser1.setUserId("UsId001");
		appUser1.setUserName("Janes");
		appUser1.setUserConnect("Facebook");

		AppUser friend1 = new AppUser();
		friend1.setUserId("UsId002");
		friend1.setUserName("Kene");
		friend1.setUserConnect("Facebook");

		Map<String, String> userToAppLinker = new HashMap<String, String>();

		userToAppLinker.put("Pinterest", "JanePin");
		userToAppLinker.put("G+", "JaneG+");
		userToAppLinker.put("Facebook", "JaneFB");
		userToAppLinker.put("Proffessional", "JaneProf");
		appUser1.setUserConnectApptoId(userToAppLinker);
		List<Commodity> commodities = new ArrayList<Commodity>();
		Commodity commodity = new Commodity();
		commodity.setCommodityId("Com100");
		commodity.setCommodityCategory("Clothes");
		commodity.setCommodityName("Shirt");
		commodities.add(commodity);
		appUser1.setUserCommodities(commodities);

		appUserService.createAppUser(appUser1);

		// User 2
		AppUser appUser2 = new AppUser();
		appUser2.setUserId("UsId002");
		appUser2.setUserName("Kene");
		appUser2.setUserConnect("Facebook");

		AppUser friendOne = new AppUser();
		friendOne.setUserId("UsId001");
		friendOne.setUserName("Janes");
		friendOne.setUserConnect("Facebook");

		Map<String, String> userToAppLinkerUser2 = new HashMap<String, String>();

		userToAppLinkerUser2.put("Pinterest", "KenePin");
		userToAppLinkerUser2.put("G+", "KeneG+");
		userToAppLinkerUser2.put("Facebook", "KeneFB");
		userToAppLinkerUser2.put("Proffessional", "KeneProf");
		appUser1.setUserConnectApptoId(userToAppLinker);
		List<Commodity> userTwoCommodities = new ArrayList<Commodity>();
		Commodity commodity1 = new Commodity();
		commodity1.setCommodityId("Com101");
		commodity1.setCommodityCategory("Accessories");
		commodity1.setCommodityName("Floaters");
		userTwoCommodities.add(commodity1);
		appUser1.setUserCommodities(userTwoCommodities);

		appUserService.createAppUser(appUser2);

		LOGGER.info("Two Users created");
		LOGGER.info("Finished MongoDemo application");
	}
}
