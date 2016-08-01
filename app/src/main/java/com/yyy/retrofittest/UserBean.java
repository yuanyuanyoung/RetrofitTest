package com.yyy.retrofittest;

/**
 * @author Scw
 * @bulidDate 2015年12月23日上午11:39:52
 * 
 */
@SuppressWarnings("serial")
public class UserBean {
    private String id;
    private String userid;// 用户ID
    private String contactPhone;// 联系电话
    private String username;// 用户名
    private String idnumber;// 身份证ID
    private String score;// 积分
    private String couponCount;// 优惠券ID
    private String gradeid;// 会员级别
    private String ordersCount;// 订单数量
    
    private String isRealName ;//是否认证 1认证 0未认证

    public String getId() {
	return id;
    }

    public String getIsRealName() {
		return isRealName;
	}

	public void setIsRealName(String isRealName) {
		this.isRealName = isRealName;
	}

	@Override
    public String toString() {
	return "UserBean [id=" + id + ", userid=" + userid + ", contactPhone="
		+ contactPhone + ", username=" + username + ", idnumber="
		+ idnumber + ", score=" + score + ", couponCount="
		+ couponCount + ", gradeid=" + gradeid + ", ordersCount="
		+ ordersCount + "]";
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getUserid() {
	return userid;
    }

    public void setUserid(String userid) {
	this.userid = userid;
    }

    public String getContactPhone() {
	return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
	this.contactPhone = contactPhone;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getIdnumber() {
	return idnumber;
    }

    public void setIdnumber(String idnumber) {
	this.idnumber = idnumber;
    }

    public String getScore() {
	return score;
    }

    public void setScore(String score) {
	this.score = score;
    }

    public String getCouponCount() {
	return couponCount;
    }

    public void setCouponCount(String couponCount) {
	this.couponCount = couponCount;
    }

    public String getGradeid() {
	return gradeid;
    }

    public void setGradeid(String gradeid) {
	this.gradeid = gradeid;
    }

    public String getOrdersCount() {
	return ordersCount;
    }

    public void setOrdersCount(String ordersCount) {
	this.ordersCount = ordersCount;
    }

}
