package in.mgp.rest.springmongo.repository;

import in.mgp.rest.springmongo.domain.Commodity;

import java.util.List;

public interface CommodityRepo {
	/**
	 * checks commodity
	 * 
	 * @param commodity
	 * @return
	 */
	Commodity checkCommodity(Commodity commodity);

	/**
	 * get the list of Users along with
	 * 
	 * @return
	 */
	List<Commodity> getAllCommodity();

	public void createCommodityCollection();

	public void dropCommodityCollection();

}
