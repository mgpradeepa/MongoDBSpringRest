package in.mgp.rest.springmongo.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@XmlRootElement
public class Commodity implements Serializable {

	private static final long serialVersionUID = 4347728796633268934L;

	@Id
	private String commodityId;
	private String commodityName;
	private String commodityCategory;

	@Indexed
	@Persistent
	private AppUser commodityAppUser;
	private List<String> commodityFutureReferences;

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getCommodityCategory() {
		return commodityCategory;
	}

	public void setCommodityCategory(String commodityCategory) {
		this.commodityCategory = commodityCategory;
	}

	public AppUser getCommodityAppUser() {
		return commodityAppUser;
	}

	public void setCommodityAppUser(AppUser commodityAppUser) {
		this.commodityAppUser = commodityAppUser;
	}

	public List<String> getCommodityFutureReferences() {
		return commodityFutureReferences;
	}

	public void setCommodityFutureReferences(
			List<String> commodityFutureReferences) {
		this.commodityFutureReferences = commodityFutureReferences;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((commodityAppUser == null) ? 0 : commodityAppUser.hashCode());
		result = prime
				* result
				+ ((commodityCategory == null) ? 0 : commodityCategory
						.hashCode());
		result = prime
				* result
				+ ((commodityFutureReferences == null) ? 0
						: commodityFutureReferences.hashCode());
		result = prime * result
				+ ((commodityId == null) ? 0 : commodityId.hashCode());
		result = prime * result
				+ ((commodityName == null) ? 0 : commodityName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Commodity other = (Commodity) obj;
		if (commodityAppUser == null) {
			if (other.commodityAppUser != null) {
				return false;
			}
		} else if (!commodityAppUser.equals(other.commodityAppUser)) {
			return false;
		}
		if (commodityCategory == null) {
			if (other.commodityCategory != null) {
				return false;
			}
		} else if (!commodityCategory.equals(other.commodityCategory)) {
			return false;
		}
		if (commodityFutureReferences == null) {
			if (other.commodityFutureReferences != null) {
				return false;
			}
		} else if (!commodityFutureReferences
				.equals(other.commodityFutureReferences)) {
			return false;
		}
		if (commodityId == null) {
			if (other.commodityId != null) {
				return false;
			}
		} else if (!commodityId.equals(other.commodityId)) {
			return false;
		}
		if (commodityName == null) {
			if (other.commodityName != null) {
				return false;
			}
		} else if (!commodityName.equals(other.commodityName)) {
			return false;
		}
		return true;
	}

}
