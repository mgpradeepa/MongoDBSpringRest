package in.mgp.rest.springmongo.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Persistent;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@XmlRootElement
public class AppUser implements Serializable {
	private static final long serialVersionUID = -5419980702000653104L;

	@Indexed
	private String userId;

	private String userName;
	private String userConnect;

	@Persistent
	private List<AppUser> userFriends;
	private Map<String, String> userConnectApptoId;
	private List<Commodity> userCommodities;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserConnect() {
		return userConnect;
	}

	public void setUserConnect(String userConnect) {
		this.userConnect = userConnect;
	}

	public List<AppUser> getUserFriends() {
		return userFriends;
	}

	public void setUserFriends(List<AppUser> userFriends) {
		this.userFriends = userFriends;
	}

	public Map<String, String> getUserConnectApptoId() {
		return userConnectApptoId;
	}

	public void setUserConnectApptoId(Map<String, String> userConnectApptoId) {
		this.userConnectApptoId = userConnectApptoId;
	}

	public List<Commodity> getUserCommodities() {
		return userCommodities;
	}

	public void setUserCommodities(List<Commodity> userCommodities) {
		this.userCommodities = userCommodities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userCommodities == null) ? 0 : userCommodities.hashCode());
		result = prime * result
				+ ((userConnect == null) ? 0 : userConnect.hashCode());
		result = prime
				* result
				+ ((userConnectApptoId == null) ? 0 : userConnectApptoId
						.hashCode());
		result = prime * result
				+ ((userFriends == null) ? 0 : userFriends.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
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
		AppUser other = (AppUser) obj;
		if (userCommodities == null) {
			if (other.userCommodities != null) {
				return false;
			}
		} else if (!userCommodities.equals(other.userCommodities)) {
			return false;
		}
		if (userConnect == null) {
			if (other.userConnect != null) {
				return false;
			}
		} else if (!userConnect.equals(other.userConnect)) {
			return false;
		}
		if (userConnectApptoId == null) {
			if (other.userConnectApptoId != null) {
				return false;
			}
		} else if (!userConnectApptoId.equals(other.userConnectApptoId)) {
			return false;
		}
		if (userFriends == null) {
			if (other.userFriends != null) {
				return false;
			}
		} else if (!userFriends.equals(other.userFriends)) {
			return false;
		}
		if (userId == null) {
			if (other.userId != null) {
				return false;
			}
		} else if (!userId.equals(other.userId)) {
			return false;
		}
		if (userName == null) {
			if (other.userName != null) {
				return false;
			}
		} else if (!userName.equals(other.userName)) {
			return false;
		}
		return true;
	}

}
